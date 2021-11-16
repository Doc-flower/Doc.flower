package main.java.com.example.docflower.docflower.controller;

import main.java.com.example.docflower.docflower.model.Comments;
import main.java.com.example.docflower.docflower.service.CommentSrv;
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

@WebServlet("/CommentsServlet")
public class CommentsServlet extends HttpServlet{
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
        else if(type.equalsIgnoreCase("update"))
            update(request, response);
        else if(type.equalsIgnoreCase("search_CommentId"))
            search_CommentId(request, response);
        else if(type.equalsIgnoreCase("search__BlogId"))
            search__BlogId(request, response);
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Comments comments =null;
        int id=0;
        try
        {
            int blog_id=Integer.valueOf(request.getParameter("blog_id"));
            String comment_owner=request.getParameter("comment_owner");
            String comment_image=request.getParameter("comment_image");
            String comment_text=request.getParameter("comment_text");
            String comment_time=request.getParameter("comment_time");
            int comment_likes=0;
            comments =new  Comments(id, blog_id,comment_owner,comment_image,comment_text,comment_time,comment_likes);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();

            if(new CommentSrv().add(comments) == 1)
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


    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Comments comments =null;
        try
        {
            int id=Integer.valueOf(request.getParameter("id"));
            int blog_id=Integer.valueOf(request.getParameter("blog_id"));
            String comment_owner=request.getParameter("comment_owner");
            String comment_image=request.getParameter("comment_image");
            String comment_text=request.getParameter("comment_text");
            String comment_time=request.getParameter("comment_time");
            int comment_likes=Integer.valueOf(request.getParameter("comment_likes"));
            comments =new  Comments(id, blog_id,comment_owner,comment_image,comment_text,comment_time,comment_likes);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            if(new CommentSrv().modify(comments) == 1)
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



    private void search_CommentId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        int id=Integer.valueOf(request.getParameter("id"));
        List<Comments> result=null;
        result = new CommentSrv().Fetch_CommentId(id);

        String jsonStr="";
        try
        {
            JSONArray array=new JSONArray();
            JSONObject json;
            for(Comments s : result)
            {
                json=new JSONObject();
                json.put("comment_id", s.getComment_id());
                json.put("blog_id", s.getBlog_id());
                json.put("comment_owner", s.getComment_owner());
                json.put("comment_image", s.getComment_image());
                json.put("comment_text", s.getComment_text());
                json.put("comment_time", s.getComment_time());
                json.put("comment_likes", s.getComment_likes());
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

    private void search__BlogId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        int id=Integer.valueOf(request.getParameter("id"));
        List<Comments> result=null;
        result = new CommentSrv().Fetch_BlogId(id);

        String jsonStr="";
        try
        {
            JSONArray array=new JSONArray();
            JSONObject json;
            for(Comments s : result)
            {
                json=new JSONObject();
                json.put("comment_id", s.getComment_id());
                json.put("blog_id", s.getBlog_id());
                json.put("comment_owner", s.getComment_owner());
                json.put("comment_image", s.getComment_image());
                json.put("comment_text", s.getComment_text());
                json.put("comment_time", s.getComment_time());
                json.put("comment_likes", s.getComment_likes());
                array.put(json);
                System.out.println(json);
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
