package main.java.com.example.docflower.docflower.idao;

import main.java.com.example.docflower.docflower.dao.*;

public class DAOFactory
{
    private static iShopsDAO stuDao;

    private static iBlogsDAO playDao;

    private static iOrdersDAO empDao;

    private static iCustomerDAO cusDao;

    private static iPlantsDAO scheDao;

    private static iMessagesDAO messDao;


    public static synchronized iShopsDAO creatStudioDAO()
    {
        if(null == stuDao)
            stuDao=new ShopsDAO();
        return stuDao;
    }

    public static synchronized iBlogsDAO creatPlayDAO()
    {
        if(null == playDao)
            playDao=new BlogsDAO();
        return playDao;
    }

    public static synchronized iOrdersDAO creatEmployeeDAO()
    {
        if(null == empDao)
            empDao=new OrderDAO();
        return empDao;
    }

    public static synchronized iCustomerDAO creatCustomerDAO()
    {
        if(null == cusDao)
            cusDao=new CustomerDAO();
        return cusDao;
    }

    public static synchronized iPlantsDAO creatScheduleDAO()
    {
        if(null == scheDao)
            scheDao=new PlantsDAO();
        return scheDao;
    }

    public static synchronized iMessagesDAO creatMessagesDAO()
    {
        if(null == messDao)
            messDao=new MessagesDAO();
        return messDao;
    }
}
