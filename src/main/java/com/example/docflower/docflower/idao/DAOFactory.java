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

    private static iManagersDAO manDAO;


    private  static iFlowersDAO flowerDAO;

    private  static iCommentsDAO commentsDAO;

    private  static iStorysDAO storysDAO;

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
    public static synchronized iManagersDAO creatManagersDAO()
    {
        if(null == manDAO)
            manDAO=new ManagersDAO();
        return manDAO;
    }

    public static synchronized iFlowersDAO creatflowerDAO()
    {
        if(null == flowerDAO)
            flowerDAO=new FlowersDAO();
        return flowerDAO;
    }

    public static synchronized iCommentsDAO creatcommentDAO()
    {
        if(null == commentsDAO)
            commentsDAO=new CommentsDAO();
        return commentsDAO;
    }

    public static synchronized iStorysDAO creatstoryDAO()
    {
        if(null == storysDAO)
            storysDAO=new StorysDAO();
        return storysDAO;
    }
}
