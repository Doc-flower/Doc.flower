package main.java.com.example.docflower.docflower.controller;

import main.java.com.example.docflower.docflower.model.Plants;
import main.java.com.example.docflower.docflower.service.PlantsSrv;
import main.java.com.example.docflower.docflower.service.ShopsSrv;
import main.java.com.example.docflower.util.DBUtil;
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
        else if(type.equalsIgnoreCase("search_id"))
            searchId(request, response);
        else if(type.equalsIgnoreCase("sale_stock"))
            sale_stock(request, response);
        else if(type.equalsIgnoreCase("sale_stock_search"))
            sale_stock_search(request, response);
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Plants stu=null;
        int id=0;
        try
        {
            String name=request.getParameter("plants_name");
            String intro=request.getParameter("intro");
            String img1="";
            String img2="";
            int price=Integer.valueOf(request.getParameter("plants_price"));
            int sale=0;
            int stock=1000;
            stu=new Plants(id, name, intro,img1, img2,price,sale,stock);
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
            out.write("" + new PlantsSrv().delete(id));
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
        int id=Integer.valueOf(request.getParameter("plants_id"));
        try
        {
            String name=request.getParameter("plants_name");
            String intro=request.getParameter("intro");
            String img1="";
            String img2="";
            int price=Integer.valueOf(request.getParameter("plants_price"));
            int sale=0;
            int stock=1000;
            stu=new Plants(id, name, intro,img1, img2,price,sale,stock);
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


    private void searchId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        int name=Integer.valueOf(request.getParameter("id"));
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
                json.put("plantsale", s.getSale());
                json.put("plantstock", s.getStock());
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



    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
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
                json.put("plantsale", s.getSale());
                json.put("plantstock", s.getStock());
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

    private void sale_stock(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            int result=0;
            int plant_id=Integer.valueOf(request.getParameter("plant_id"));
            response.setContentType("text/html;charset=utf-8");
            String sql="update plants set plant_sale = plant_sale + 1 , plant_stock = plant_stock - 1";
            sql+=" where plant_id = " + plant_id;
            DBUtil db=new DBUtil();
            db.openConnection();
            result=db.execCommand(sql);
            db.close();
            PrintWriter out=response.getWriter();
            if(result == 1)
                out.write("销量修改成功");
            else
                out.write("销量修改失败，请重试");
            out.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("操作错误，请重试");
        }
    }


    private void sale_stock_search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        String flag = request.getParameter("flag");
        PrintWriter out=response.getWriter();
        List<Plants> result=null;
        result=new PlantsSrv().FetchSale_stock(flag);
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
                json.put("plantsale", s.getSale());
                json.put("plantstock", s.getStock());
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

