package main.java.com.example.docflower.docflower.controller;
import main.java.com.example.docflower.docflower.model.Storys;
import main.java.com.example.docflower.docflower.service.StorysSrv;
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

@WebServlet("/StorysServlet")
public class StorysServlet extends HttpServlet{
    private static final long serialVersionUID=1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String type=request.getParameter("type");

        // 根据请求操作类型，执行相应的查
        if(type.equalsIgnoreCase("search"))
            search(request, response);
        else if(type.equalsIgnoreCase("searchId"))
            searchId(request, response);
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("name");
        List<Storys> result=null;
        result=new StorysSrv().Fetch(name);
        String jsonStr="";
        try
        {
            JSONArray array=new JSONArray();
            JSONObject json;
            for(Storys s : result)
            {
                json=new JSONObject();
                json.put("story_id", s.getStory_id());
                json.put("story_owner", s.getStory_owner());
                json.put("story_title", s.getStory_title());
                json.put("story_introduction", s.getStory_introduction());
                json.put("story_text", s.getStory_text());
                json.put("story_image", s.getStory_image());
                json.put("story_time", s.getStory_time());
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
        int id=Integer.valueOf(request.getParameter("id"));
        List<Storys> result=null;
        result=new StorysSrv().FetchId(id);
        String jsonStr="";
        try
        {
            JSONArray array=new JSONArray();
            JSONObject json;
            for(Storys s : result)
            {
                json=new JSONObject();
                json.put("story_id", s.getStory_id());
                json.put("story_owner", s.getStory_owner());
                json.put("story_title", s.getStory_title());
                json.put("story_introduction", s.getStory_introduction());
                json.put("story_text", s.getStory_text());
                json.put("story_image", s.getStory_image());
                json.put("story_time", s.getStory_time());
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
