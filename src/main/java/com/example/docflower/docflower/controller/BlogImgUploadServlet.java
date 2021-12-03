package main.java.com.example.docflower.docflower.controller;

import main.java.com.example.docflower.docflower.model.Customer;
import main.java.com.example.docflower.util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.sql.ResultSet;

@MultipartConfig(maxFileSize = 1024 * 1024 * 5)
@WebServlet("/BlogImgUploadServlet")
public class BlogImgUploadServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    private static final MultipartConfig config;

    // 得到注解信息
    static
    {
        config = BlogImgUploadServlet.class.getAnnotation(MultipartConfig.class);
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

            String img_blog_name = request.getParameter("img_blog_name");
            String img_blog_owner = request.getParameter("img_blog_owner");
            int img_blog_owner_id = Integer.parseInt(request.getParameter("img_blog_owner_id"));
            String img_blog_text = request.getParameter("img_blog_text");
            String img_blog_time = request.getParameter("img_blog_time");
//            System.out.println(user_name_id);
            // 接收图片:图片封装在part对象中
            part = request.getPart("blog_image");
            System.out.println(part);
            String fileName = getFileName(part);
//            customer.setImg(fileName);
            // 保存图片
            part.write(getServletContext().getRealPath("/WebContent/Client/img/blog_img/") + fileName);
            //向数据库中存入路径
            InsertBlog(img_blog_name,img_blog_owner,img_blog_owner_id,img_blog_text,img_blog_time,fileName);

            System.out.println(fileName);
            System.out.println(part.getSize());

            // 带着play对象转发到result.java页
//            request.setAttribute("play", customer);
            request.getRequestDispatcher("/WebContent/Client/html/BlogImgUploadComplete.html").forward(request, response);
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


    public void InsertBlog(String img_blog_name,String img_blog_owner,int img_blog_owner_id,String img_blog_text,String img_blog_time,String fileName)
    {
        try
        {
            String sql="insert into blogs(blog_name, blog_owner, blog_owner_id, blog_text, blog_image, blog_time, blog_views, blog_likes) VALUES"
                    + "('" + img_blog_name + "', '" + img_blog_owner + "', "
                    + img_blog_owner_id + ", '"+ img_blog_text + "','../img/blog_img/" + fileName + "', '" + img_blog_time + "', " + 0 + ", " + 0 + " )";
            DBUtil db=new DBUtil();
            db.openConnection();
            ResultSet rst=db.getInsertObjectIDs(sql);
//            if(rst != null && rst.first())
//            {
////                blogs.setID(rst.getInt(1));
//            }
            db.close(rst);
            db.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}