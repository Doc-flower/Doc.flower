package main.java.com.example.docflower.docflower.dao;

import main.java.com.example.docflower.docflower.idao.iOrdersDAO;
import main.java.com.example.docflower.docflower.model.Orders;
import main.java.com.example.docflower.util.DBUtil;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class OrderDAO implements iOrdersDAO {
    @SuppressWarnings("finally")
    @Override
    public int insert(Orders order)
    {
        int resultPlay=0;
        try
        {
            String sql="insert into order(order_time, order_commodity_name, order_commodity_img, order_owner_name, order_owner_tel, order_address, order_pay,order_status)"
                    + " values('" + order.getTime() + "', '" + order.getCommodityname() + "', '" + order.getCommodityimg() + "', '"
                    + order.getOwnername() + "', '"+ order.getTel() + "','"+ order.getAddress() + "''"+ order.getPay() + "''"+ order.getStatus() + "')";
            DBUtil db=new DBUtil();
            db.openConnection();
            ResultSet rst=db.getInsertObjectIDs(sql);
            if(rst != null && rst.first())
            {
                order.setID(rst.getInt(1));
            }
            db.close(rst);
            db.close();
            resultPlay=1;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            return resultPlay;
        }
    }

    @SuppressWarnings("finally")
    @Override
    public int update(Orders order)
    {
        int result=0;
        try
        {
            String sql="update `order` set " + " order_time  ='" + order.getTime() + "', " + " order_commodity_name  = "
                    + order.getCommodityname() + ", " + " order_commodity_img  = '" + order.getCommodityimg() + "', "
                    + " order_owner_name  = '" + order.getOwnername() + " order_owner_tel  = '" + order.getTel()
                    + "',order_address  = '" + order.getAddress() + "',order_status  = '" + order.getStatus() + "' ";
            sql+=" where order_id = " + order.getID();
            DBUtil db=new DBUtil();
            db.openConnection();
            result=db.execCommand(sql);
            db.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            return result;
        }
    }

    @Override
    public int delete(int ID)
    {
        int result=0;
        try
        {
            String sql="delete from `order` where order_id = " + ID;
            DBUtil db=new DBUtil();
            db.openConnection();
            result=db.execCommand(sql);
            db.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

//    @SuppressWarnings("finally")
//    public String selectplayid(int condt)
//    {
//        DBUtil db=null;
//        String result="";
//        try
//        {
//            String sql="select play_name from play  where play_id= " + condt;
//            db=new DBUtil();
//            if(!db.openConnection())
//            {
//                System.out.print("fail to connect database");
//                return null;
//            }
//            ResultSet rst=db.execQuery(sql);
//            if(rst != null)
//            {
//                while(rst.next())
//                {
//                    result=rst.getString("play_name");
//                }
//            }
//            db.close(rst);
//            db.close();
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        finally
//        {
//            return result;
//        }
//    }


    @SuppressWarnings("finally")
    @Override
    public List<Orders> select(String employeeEmail)
    {
        DBUtil db=null;
        List<Orders> orderList =null;
        orderList =new LinkedList<Orders>();
        try
        {
            employeeEmail.trim();
            String sql="select * from `order` where order_owner_tel like '" + employeeEmail + "' ";

            db=new DBUtil();
            if(!db.openConnection())
            {
                System.out.print("fail to connect database table play");
                return null;
            }
            ResultSet rst=db.execQuery(sql);
            if(rst != null)
            {
                while(rst.next())
                {
                    Orders order = new Orders();
                    order.setID(rst.getInt("order_id"));
                    order.setTime(rst.getString("order_time"));
                    order.setCommodityname(rst.getString("order_commodity_name"));
                    order.setCommodityimg(rst.getString("order_commodity_img"));
                    order.setOwnername(rst.getString("order_owner_name"));
                    order.setTel(rst.getString("order_owner_tel"));
                    order.setAddress(rst.getString("order_address"));
                    order.setPay(rst.getString("order_pay"));
                    order.setStatus(rst.getString("order_status"));
                    orderList.add(order);
                }
            }
            db.close(rst);
            db.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            return orderList;
        }
    }
}
