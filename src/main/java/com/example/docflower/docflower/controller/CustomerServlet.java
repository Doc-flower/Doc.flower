package main.java.com.example.docflower.docflower.controller;

import main.java.com.example.docflower.docflower.model.Customer;
import main.java.com.example.docflower.docflower.model.Flowers;
import main.java.com.example.docflower.docflower.service.CustomerSrv;
import main.java.com.example.docflower.docflower.service.FlowersSrv;
import main.java.com.example.docflower.util.MD5Utils;
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

@WebServlet("/CustomerServlet")
public class CustomerServlet  extends HttpServlet
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
        else if(type.equalsIgnoreCase("login"))
            login(request, response);
        else if(type.equalsIgnoreCase("search"))
            search(request, response);
        else if(type.equalsIgnoreCase("update"))
            update(request, response);
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Customer customer=null;
        int id=0;
        try
        {
            String name=request.getParameter("cusname");
            String tel=request.getParameter("custel");
            String email=request.getParameter("cusemail");
            String pwd1=request.getParameter("customerpwd");
            String pwd = MD5Utils.code(pwd1);
            String paypwd=request.getParameter("customerpaypwd");
            String img_bg="";

            String address="";
            customer=new Customer(id,tel, name, email, pwd,paypwd,img_bg,address);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();

            String method = "login";

            List<Customer> result=null;
            result=new CustomerSrv().Fetch(email,method);

            JSONArray array=new JSONArray();
            JSONObject json;

            for(Customer s : result)
            {
                json=new JSONObject();
                json.put("email", s.getEmail());
                array.put(json);
            }
//            System.out.println("------------>pwd:" + pwd);
//
//            System.out.println("------------>MD5:" + pwd_MD5);
            System.out.println("---------->arry:" + array);
            System.out.println("---------->arry.length():" + array.length());
            if(array.length() >= 1){
                out.write("3");     //邮箱不唯一
                return;
            }
            if(new CustomerSrv().add(customer) == 1)
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
        Customer customer =null;
        int id=Integer.parseInt(request.getParameter("cusid"));
        try
        {

            String name=request.getParameter("cusname");
            String tel=request.getParameter("custel");
            String email=request.getParameter("cusemail");
            String img_bg=request.getParameter("customerimg_bg");
            String address=request.getParameter("customeraddress");
            customer=new Customer(id,tel, name, email,null,null,img_bg,address);
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();

            String method = "login";

            List<Customer> result=null;
            result=new CustomerSrv().Fetch(email,method);

            JSONArray array=new JSONArray();
            JSONObject json;

            for(Customer s : result)
            {
                json=new JSONObject();
                json.put("email", s.getEmail());
                array.put(json);
            }
//            System.out.println("------------>pwd:" + pwd);
//
//            System.out.println("------------>MD5:" + pwd_MD5);
            System.out.println("---------->arry:" + array);
            System.out.println("---------->arry.length():" + array.length());
            if(array.length() >= 2){
                out.write("3");     //邮箱不唯一
                return;
            }


            if(new CustomerSrv().modify(customer) == 1)
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

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            int id=Integer.valueOf(request.getParameter("id"));
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out=response.getWriter();
            out.write("" + new CustomerSrv().delete(id));
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
        String method=request.getParameter("method");
        List<Customer> result=null;
        result=new CustomerSrv().Fetch(name,method);
        String jsonStr="";
        try
        {
            JSONArray array=new JSONArray();
            JSONObject json;
            for(Customer s : result)
            {
                json=new JSONObject();
                json.put("id", s.getID());
                json.put("name", s.getName());
                json.put("tel", s.getTel());
                json.put("email", s.getEmail());
                json.put("pwd", s.getPwd());
                json.put("paypwd", s.getPayPwd());
                json.put("imgbg", s.getImg_bg());
                json.put("address", s.getAddress());
                json.put("orders", s.getOrders());
                json.put("friends", s.getFriends());
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


    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String method=request.getParameter("method");
        String email=request.getParameter("email");
        String pwd1=request.getParameter("pwd");
        String pwd=MD5Utils.code(pwd1);
        List<Customer> result=null;
        result=new CustomerSrv().Fetch(email,method);
        String pwd_MD5="";
        try
        {


            for(Customer s : result)
            {


                pwd_MD5 = s.getPwd();
            }
            System.out.println("------------>pwd:" + pwd);

            System.out.println("------------>MD5:" + pwd_MD5);

            if(pwd_MD5.equals(pwd))
            {
                out.write("1");     //登陆成功
            }else {
                out.write("0");     //登陆失败
            }

            out.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("操作错误，请重试");
        }
    }

}



