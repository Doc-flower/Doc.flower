package main.java.com.example.docflower.docflower.controller;

import main.java.com.example.docflower.docflower.model.Flowers;
import main.java.com.example.docflower.docflower.service.FlowersSrv;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/FlowersServlet")
public class FlowersServlet extends HttpServlet{
    private static final long serialVersionUID=2L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String type=request.getParameter("type");

        // 根据请求操作类型，执行相应的增、删、该、查
        if(type.equalsIgnoreCase("add"))
            add(request, response);
        else if(type.equalsIgnoreCase("delete"))
            delete(request, response);
        else if(type.equalsIgnoreCase("update"))
            update(request, response);
        else if(type.equalsIgnoreCase("searchByName"))
            searchByName(request, response);
        else if(type.equalsIgnoreCase("searchByImg"))
            searchByImg(request,response);
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Flowers flowers =null;
        int id=0;
        try
        {
            String flower_name=request.getParameter("flower_name");
            String flower_kind=request.getParameter("flower_kind");
            String flower_introduction=request.getParameter("flower_introduction");
            String flower_image1="";
            String flower_image2="";
            String flower_image3="";
            String flower_image4="";
            int flower_price=Integer.valueOf(request.getParameter("flower_price"));
            flowers =new Flowers(id, flower_name, flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            if(new FlowersSrv().add(flowers) == 1)
                out.write("数据添加成功");
            else
                out.write("数据添加失败，请重试");
            out.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("操作错误，请重试");
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            int id=Integer.valueOf(request.getParameter("flower_id"));
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.write("" + new FlowersSrv().delete(id));
            out.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("操作错误，请重试");
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Flowers flowers =null;
        int id=0;
        try
        {
            String flower_name=request.getParameter("flower_name");
            String flower_kind=request.getParameter("flower_kind");
            String flower_introduction=request.getParameter("flower_introduction");
            String flower_image1="";
            String flower_image2="";
            String flower_image3="";
            String flower_image4="";
            int flower_price=Integer.valueOf(request.getParameter("flower_price"));
            flowers =new Flowers(id, flower_name, flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            if(new FlowersSrv().modify(flowers) == 1)
                out.write("数据修改成功");
            else
                out.write("数据修改失败，请重试");
            out.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("操作错误，请重试");
        }
    }


    private void searchByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String flowerinformation=request.getParameter("flower_name");
        List<Flowers> result=null;
        result=new FlowersSrv().Fetch(flowerinformation);
        String jsonStr="";
        try
        {
            JSONArray array=new JSONArray();
            JSONObject json;
            for(Flowers s : result)
            {
                json=new JSONObject();
                json.put("flower_id", s.getFlower_id());
                json.put("flower_name", s.getFlower_name());
                json.put("flower_kind", s.getFlower_kind());
                json.put("flower_introduction", s.getFlower_introduction());
                json.put("flower_image1", s.getFlower_image1());
                json.put("flower_image2", s.getFlower_image2());
                json.put("flower_image3", s.getFlower_image3());
                json.put("flower_image4", s.getFlower_image4());
                json.put("flower_price", s.getFlower_price());
                array.put(json);
            }
            jsonStr=array.toString();
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
        finally
        {
            out.println(jsonStr);
            out.flush();
            out.close();
        }
        // System.out.print(jsonStr);
    }

    private void searchByImg(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String flowerinformation=request.getParameter("flower_image1");
        List<Flowers> result=null;
        result=new FlowersSrv().Fetch(flowerinformation);

        String jsonStr="";
        try
        {
            JSONArray array=new JSONArray();
            JSONObject json;
            for(Flowers s : result)
            {
                json=new JSONObject();
                json.put("flower_id", s.getFlower_id());
                json.put("flower_name", s.getFlower_name());
                json.put("flower_kind", s.getFlower_kind());
                json.put("flower_introduction", s.getFlower_introduction());
                json.put("flower_image1", s.getFlower_image1());
                json.put("flower_image2", s.getFlower_image2());
                json.put("flower_image3", s.getFlower_image3());
                json.put("flower_image4", s.getFlower_image4());
                json.put("flower_price", s.getFlower_price());
                array.put(json);
            }
            jsonStr=array.toString();
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
        finally
        {
            out.println(jsonStr);
            out.flush();
            out.close();
        }
        // System.out.print(jsonStr);
    }
}
