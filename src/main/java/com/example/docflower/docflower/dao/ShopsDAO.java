package main.java.com.example.docflower.docflower.dao;

import main.java.com.example.docflower.docflower.idao.iShopsDAO;
import main.java.com.example.docflower.docflower.model.Shops;
import main.java.com.example.docflower.util.DBUtil;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class ShopsDAO implements iShopsDAO
{
    @SuppressWarnings("finally")
    @Override
    public int insert(Shops stu)
    {
        int result=0;
        try
        {
            String sql="insert into shops( shop_name, shop_address, shop_tel,shop_text )"
                    + " values('" + stu.getName() + "', '" + stu.getAddress() + "', '" + stu.getTel() + "' , '" + stu.getText() + "')";
            DBUtil db=new DBUtil();
            db.openConnection();
            ResultSet rst=db.getInsertObjectIDs(sql);
            if(rst != null && rst.first())
            {
                stu.setID(rst.getInt(1));
            }
            db.close(rst);
            db.close();
            result=1;
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

    @SuppressWarnings("finally")
    @Override
    public int update(Shops stu)
    {
        int result=0;
        try
        {
            String sql="update shops set " + " shop_name ='" + stu.getName() + "', " + " shop_address = "
                    + stu.getAddress() + ", " + " shop_tel = '" + stu.getTel() + "' ";
            sql+=" where shop_id = " + stu.getID();
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
            String sql="delete from  shops where shop_id = " + ID;
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

    @SuppressWarnings("finally")
    public String selectshopid(int condt)
    {
        DBUtil db=null;
        String result="";
        try
        {
            String sql="select shop_name from shops  where shop_id= " + condt;
            db=new DBUtil();
            if(!db.openConnection())
            {
                System.out.print("fail to connect database");
                return null;
            }
            ResultSet rst=db.execQuery(sql);
            if(rst != null)
            {
                while(rst.next())
                {
                    result=rst.getString("studio_name");
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
            return result;
        }
    }

    @SuppressWarnings("finally")
    @Override
    public List<Shops> select(String shop_name)
    {
        DBUtil db=null;
        List<Shops> stuList=null;
        stuList=new LinkedList<Shops>();
        try
        {
            shop_name.trim();
            String sql="select * from shops where shop_name like '%" + shop_name + "%'";
            db=new DBUtil();
            if(!db.openConnection())
            {
                System.out.print("fail to connect database table studio");
                return null;
            }
            ResultSet rst=db.execQuery(sql);
            if(rst != null)
            {
                while(rst.next())
                {
                    Shops stu=new Shops();
                    stu.setID(rst.getInt("shop_id"));
                    stu.setName(rst.getString("shop_name"));
                    stu.setAddress(rst.getString("shop_address"));
                    stu.setTel(rst.getString("shop_tel"));
                    stu.setText(rst.getString("shop_text"));

                    stuList.add(stu);
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
            return stuList;
        }
    }

}
