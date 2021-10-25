package main.java.com.example.docflower.docflower.idao;

import main.java.com.example.docflower.docflower.dao.*;

public class DAOFactory
{
    private static iShopsDAO stuDao;

    private static iPlayDAO playDao;

    private static iOrdersDAO empDao;

    private static iCustomerDAO cusDao;

    private static iScheduleDAO scheDao;

    private static iMessagesDAO messDao;


    public static synchronized iShopsDAO creatStudioDAO()
    {
        if(null == stuDao)
            stuDao=new ShopsDAO();
        return stuDao;
    }

    public static synchronized iPlayDAO creatPlayDAO()
    {
        if(null == playDao)
            playDao=new PlayDAO();
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

    public static synchronized iScheduleDAO creatScheduleDAO()
    {
        if(null == scheDao)
            scheDao=new ScheduleDAO();
        return scheDao;
    }

    public static synchronized iMessagesDAO creatMessagesDAO()
    {
        if(null == messDao)
            messDao=new MessagesDAO();
        return messDao;
    }
}
