package main.java.com.example.docflower.docflower.dao;

import main.java.com.example.docflower.docflower.idao.iPlantsDAO;
import main.java.com.example.docflower.docflower.model.Plants;
import main.java.com.example.docflower.util.DBUtil;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class PlantsDAO implements iPlantsDAO
{
    @SuppressWarnings("finally")
    @Override
    public int insert(Plants stu)
    {
        int result=0;
        try
        {
            String sql="insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES"
                    + " ('" + stu.getName() + "', '" + stu.getIntro() + "', '" + stu.getImg1() + "', '" + stu.getImg2() + "', "
                    + stu.getPrice() + ")";
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
    public int update(Plants stu)
    {
        int result=0;
        try
        {
            String sql="update plants set " + " plant_name ='" + stu.getName() + "', " + " plant_introduction = '"
                    + stu.getIntro() + "', "
                    + " plant_price = '" + stu.getPrice() + "' ";
            sql+=" where plant_id = " + stu.getID();
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
            System.out.println("------------->ID:" +ID);
            String sql="delete from plants where plant_id = " + ID;
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
    public String selectstudioid(int condt)
    {
        DBUtil db=null;
        String result="";
        try
        {
            String sql="select studio_name from studio  where studio_id= " + condt;
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
    public List<Plants> select(int plantid)
    {
        DBUtil db=null;
        List<Plants> stuList=null;
        stuList=new LinkedList<Plants>();
        try
        {
            String sql="select * from plants where plant_id = '" + plantid + "'";
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
                    Plants stu=new Plants();
                    stu.setID(rst.getInt("plant_id"));
                    stu.setName(rst.getString("plant_name"));
                    stu.setIntro(rst.getString("plant_introduction"));
                    stu.setImg1(rst.getString("plant_image1"));
                    stu.setImg2(rst.getString("plant_image2"));
                    stu.setPrice(rst.getInt("plant_price"));
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

    @Override
    public List<Plants> selectSchedid(int schedid) {
        DBUtil db=null;
        List<Plants> stuList=null;
        stuList=new LinkedList<Plants>();
        try
        {
            String sql="select * from plants where sched_id = '" + schedid + "'";
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
                    Plants stu=new Plants();
                    stu.setID(rst.getInt("plant_id"));
                    stu.setName(rst.getString("plant_name"));
                    stu.setIntro(rst.getString("plant_introduction"));
                    stu.setImg1(rst.getString("plant_image1"));
                    stu.setImg2(rst.getString("plant_image2"));
                    stu.setPrice(rst.getInt("plant_price"));
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


    @SuppressWarnings("finally")
    @Override
    public List<Plants> selectName(String playname)
    {
        DBUtil db=null;
        List<Plants> stuList=null;
        stuList=new LinkedList<Plants>();
        try
        {
            String sql="select * from plants where plant_name like '%" + playname + "%'";
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
                    Plants stu=new Plants();
                    stu.setID(rst.getInt("plant_id"));
                    stu.setName(rst.getString("plant_name"));
                    stu.setIntro(rst.getString("plant_introduction"));
                    stu.setImg1(rst.getString("plant_image1"));
                    stu.setImg2(rst.getString("plant_image2"));
                    stu.setPrice(rst.getInt("plant_price"));
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

