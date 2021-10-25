package main.java.com.example.docflower.docflower.controller;

import main.java.com.example.docflower.docflower.model.Orders;
import main.java.com.example.docflower.docflower.service.OrdersSrv;
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

@WebServlet("/OrdersServlet")
public class OrdersServlet extends HttpServlet
{
    private static final long serialVersionUID=1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String type=request.getParameter("type");

         //根据请求操作类型，执行相应的增、删、该、查
        if(type.equalsIgnoreCase("add"))
            add(request, response);
        else if(type.equalsIgnoreCase("delete"))
            delete(request, response);
        else if(type.equalsIgnoreCase("update"))
            update(request, response);
        else
        if(type.equalsIgnoreCase("search"))
            search(request, response);
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Orders orders=null;
        try
        {
            int order_id=Integer.valueOf(request.getParameter("order_id"));
            String order_owner_name=request.getParameter("order_owner_name");
            String order_flower_name=request.getParameter("order_flower_name");
            String order_owner_tel=request.getParameter("order_owner_tel");
            String order_address=request.getParameter("order_address");
            String order_text=request.getParameter("order_text");

            orders=new Orders(order_id, order_owner_name, order_flower_name, order_owner_tel, order_address,order_text);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();

            if(new OrdersSrv().add(orders) == 1)
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
            out.write("" + new OrdersSrv().delete(id));
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
        Orders orders=null;
        try
        {
            int order_id=Integer.valueOf(request.getParameter("order_id"));
            String order_owner_name=request.getParameter("order_owner_name");
            String order_flower_name=request.getParameter("order_flower_name");
            String order_owner_tel=request.getParameter("order_owner_tel");
            String order_address=request.getParameter("order_address");
            String order_text=request.getParameter("order_text");

            orders=new Orders(order_id, order_owner_name, order_flower_name, order_owner_tel, order_address,order_text);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();

            if(new OrdersSrv().modify(orders) == 1)
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
        List<Orders> result=null;
//        if(name != null && name.length() > 0)
            result=new OrdersSrv().Fetch(name);
        String jsonStr="";
        try
        {
            JSONArray array=new JSONArray();
            JSONObject json;
            for(Orders s : result)
            {
                json=new JSONObject();
                json.put("order_id", s.getID());
                json.put("order_owner_name", s.getOwnername());
                json.put("order_flower_name", s.getFlowername());
                json.put("order_owner_tel", s.getTel());
                json.put("order_owner_address", s.getAddress());
                json.put("order_owner_text", s.getText());
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


