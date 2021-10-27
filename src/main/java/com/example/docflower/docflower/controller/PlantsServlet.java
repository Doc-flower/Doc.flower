package main.java.com.example.docflower.docflower.controller;

import main.java.com.example.docflower.docflower.model.Plants;
import main.java.com.example.docflower.docflower.service.PlantsSrv;
import main.java.com.example.docflower.docflower.service.ShopsSrv;
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

@WebServlet("/PlantsServlet")
public class PlantsServlet extends HttpServlet
{
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
        else if(type.equalsIgnoreCase("search"))
            search(request, response);
        else if(type.equalsIgnoreCase("searchname"))
            searchName(request, response);
        else if(type.equalsIgnoreCase("schedid"))
            searchSchedId(request, response);
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Plants stu=null;
        int id=0;
        try
        {
            String name=request.getParameter("name");
            String intro=request.getParameter("intro");
            String img1=request.getParameter("playname");
            String img2=request.getParameter("schedtime");
            int price=Integer.valueOf(request.getParameter("price"));
            stu=new Plants(id, name, intro,img1, img2,price);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();

            if(new PlantsSrv().add(stu) == 1)
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
            out.write("" + new ShopsSrv().delete(id));
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
        Plants stu=null;
        int id=0;
        try
        {
            String name=request.getParameter("name");
            String intro=request.getParameter("intro");
            String img1=request.getParameter("playname");
            String img2=request.getParameter("schedtime");
            int price=Integer.valueOf(request.getParameter("price"));
            stu=new Plants(id, name, intro,img1, img2,price);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();

            if(new PlantsSrv().modify(stu) == 1)
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
        int name=Integer.valueOf(request.getParameter("playid"));
        List<Plants> result=null;
        result=new PlantsSrv().Fetch(name);
        String jsonStr="";
        try
        {
            JSONArray array=new JSONArray();
            JSONObject json;
            for(Plants s : result)
            {
                json=new JSONObject();
                json.put("plantid", s.getID());
                json.put("plantname", s.getName());
                json.put("plantintro", s.getIntro());
                json.put("plantimg1", s.getImg1());
                json.put("plantimg2", s.getImg2());
                json.put("price", s.getPrice());
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

    private void searchSchedId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        int name=Integer.valueOf(request.getParameter("schedid"));
        List<Plants> result=null;
        result=new PlantsSrv().FetchSchedid(name);
        String jsonStr="";
        try
        {
            JSONArray array=new JSONArray();
            JSONObject json;
            for(Plants s : result)
            {
                json=new JSONObject();
                json.put("plantid", s.getID());
                json.put("plantname", s.getName());
                json.put("plantintro", s.getIntro());
                json.put("plantimg1", s.getImg1());
                json.put("plantimg2", s.getImg2());
                json.put("price", s.getPrice());
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



    private void searchName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("name");
        List<Plants> result=null;
        result=new PlantsSrv().FetchName(name);
        String jsonStr="";
        try
        {
            JSONArray array=new JSONArray();
            JSONObject json;
            for(Plants s : result)
            {
                json=new JSONObject();
                json.put("plantid", s.getID());
                json.put("plantname", s.getName());
                json.put("plantintro", s.getIntro());
                json.put("plantimg1", s.getImg1());
                json.put("plantimg2", s.getImg2());
                json.put("price", s.getPrice());
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

