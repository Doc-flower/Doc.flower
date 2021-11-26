package main.java.com.example.docflower.docflower.controller;

import main.java.com.example.docflower.docflower.model.Blogs;
import main.java.com.example.docflower.docflower.service.BlogsSrv;
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

@WebServlet("/BlogsServlet")
public class BlogsServlet extends HttpServlet
{
    private static final long serialVersionUID=1L;

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
        else if(type.equalsIgnoreCase("search"))
            search(request, response);
        else if(type.equalsIgnoreCase("searchId"))
            searchId(request, response);
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Blogs blogs =null;
        int id=0;
        try
        {
            String name=request.getParameter("name");
            String owner=request.getParameter("owner");
            int owner_id=Integer.parseInt(request.getParameter("owner_id"));
            String text=request.getParameter("text");
            String time=request.getParameter("time");
            int views=0;
            int likes=0;
            blogs =new Blogs(id, name, owner,owner_id,text,time,views,likes);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            if(new BlogsSrv().add(blogs) == 1)
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
            int id=Integer.valueOf(request.getParameter("id"));
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.write("" + new BlogsSrv().delete(id));
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
        Blogs blogs =null;

        try
        {
            int id=Integer.parseInt(request.getParameter("id"));
            String name=request.getParameter("name");
            String owner=request.getParameter("owner");
            int owner_id=Integer.parseInt(request.getParameter("owner_id"));
            String text=request.getParameter("text");
            String time=request.getParameter("time");
            int views=Integer.parseInt(request.getParameter("views"));
            int likes=Integer.parseInt(request.getParameter("likes"));
            blogs =new Blogs(id, name, owner,owner_id,text,time,views,likes);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();

            if(new BlogsSrv().modify(blogs) == 1)
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

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("name");
        List<Blogs> result=null;
        result=new BlogsSrv().Fetch(name);
        String jsonStr="";
        try
        {
            JSONArray array=new JSONArray();
            JSONObject json;
            for(Blogs s : result)
            {
                json=new JSONObject();
                json.put("id", s.getID());
                json.put("name", s.getName());
                json.put("owner", s.getOwner());
                json.put("owner_id", s.getOwner_id());
                json.put("text", s.getText());
                json.put("time", s.getTime());
                json.put("views", s.getViews());
                json.put("likes", s.getLikes());
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
    }


    private void searchId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        int name=Integer.valueOf(request.getParameter("id"));
        List<Blogs> result=null;
        result=new BlogsSrv().FetchId(name);
        String jsonStr="";
        try
        {
            JSONArray array=new JSONArray();
            JSONObject json;
            for(Blogs s : result)
            {
                json=new JSONObject();
                json.put("id", s.getID());
                json.put("name", s.getName());
                json.put("owner", s.getOwner());
                json.put("owner_id", s.getOwner_id());
                json.put("text", s.getText());
                json.put("time", s.getTime());
                json.put("views", s.getViews());
                json.put("likes", s.getLikes());
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
    }

}