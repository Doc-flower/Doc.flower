package main.java.com.example.docflower.docflower.controller;

import main.java.com.example.docflower.util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

@MultipartConfig(maxFileSize = 1024 * 1024 * 5)
@WebServlet("/PlantImgUploadServlet")
public class PlantImgUploadServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    private static final MultipartConfig config;

    // 得到注解信息
    static
    {
        config = PlantImgUploadServlet.class.getAnnotation(MultipartConfig.class);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        Part part;
        try
        {
            request.setCharacterEncoding("UTF-8");
            // 接收文本
            int plant_id = Integer.parseInt(request.getParameter("plant_img_id"));
            System.out.println(plant_id);
            // 接收图片:图片封装在part对象中
            part = request.getPart("plant_image");
            System.out.println(part);
            String fileName = getFileName(part);
            // 保存图片
            part.write(getServletContext().getRealPath("/WebContent/Client/img/绿植/new/") + fileName);
            //向数据库中存入路径
            updatePlantImg(plant_id,fileName);

            System.out.println(fileName);
            System.out.println(part.getSize());

            // 带着play对象转发到result.java页
//            request.setAttribute("play", customer);
            request.getRequestDispatcher("/WebContent/Management/html/PlantImgUploadComplete.html").forward(request, response);
        }
        catch(Exception e)
        {
            if(config.maxRequestSize() == -1L || config.maxFileSize() == -1L)
            {
                System.out.println("上传文件过大!");
            }
            request.setAttribute("desc", "上传文件过大(限制5M)，或存在异常!");
        }

    }

    /**
     * 从Part的Header信息中提取上传文件的文件名
     * @param part
     * @return 上传文件的文件名，如果如果没有则返回null
     */
    private String getFileName(Part part)
    {
        // 获取header信息中的content-disposition，如果为文件，则可以从其中提取出文件名
        // IE下文件名带路径，而火狐、chrome文件名不带
        String header = part.getHeader("content-disposition");
        System.out.println("header : " + header);
        String[] params = header.split(";");
        String[] temp = params[2].split("=");
        // 获取文件名，兼容各种浏览器的写法，去掉文件名前路径和双引号
        String fileName = "";
        if(temp[1].lastIndexOf("\\") < 0)
            fileName = temp[1].substring(1, temp[1].length() - 1);
        else
            fileName = temp[1].substring(temp[1].lastIndexOf("\\") + 1, temp[1].length() - 1);
        return fileName;
    }


    public void updatePlantImg(int plant_id, String fileName)
    {
        int result=0;
        try
        {

            String sql="update plants set plant_image1 = '../img/绿植/new/" + fileName;
            sql+="' where plant_id = " + plant_id;
            DBUtil db=new DBUtil();
            db.openConnection();
            result=db.execCommand(sql);
            db.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }




}