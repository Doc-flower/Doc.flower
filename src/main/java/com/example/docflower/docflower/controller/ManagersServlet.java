package main.java.com.example.docflower.docflower.controller;

import main.java.com.example.docflower.docflower.model.Customer;
import main.java.com.example.docflower.docflower.model.Managers;
import main.java.com.example.docflower.docflower.model.Messages;
import main.java.com.example.docflower.docflower.service.CustomerSrv;
import main.java.com.example.docflower.docflower.service.ManagersSrv;
import main.java.com.example.docflower.docflower.service.MessagesSrv;
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

@WebServlet("/ManagersServlet")
public class ManagersServlet extends HttpServlet
{
    private static final long serialVersionUID=1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String type=request.getParameter("type");
        if(type.equalsIgnoreCase("manLogin"))
            login(request, response);
    }
    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("name");
        String pwd=request.getParameter("pwd");
        List<Managers> result=null;
        result=new ManagersSrv().Fetch(name);

        String pwd_database="";
        try
        {
            for(Managers s : result) {
                s.getName();
                pwd_database = s.getPwd();
            }
            if(pwd_database.equals(pwd))
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



