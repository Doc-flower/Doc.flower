package main.java.com.example.docflower.docflower.dao;

import main.java.com.example.docflower.docflower.idao.iFlowerDAO;
import main.java.com.example.docflower.docflower.model.Flower;
import main.java.com.example.docflower.util.DBUtil;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class FlowerDAO implements iFlowerDAO{
    @SuppressWarnings("finally")
    @Override
    public int insert(Flower flower)
    {
        int result=0;
        try
        {
            String sql="insert into flowers(flower_name, flower_kind, flower_introduction, flower_image1, flower_image2,flower_image3.flower_image4,flower_price)"
                    + " values('" + flower.getFlower_name() + "', '" + flower.getFlower_kind() + "', '" + flower.getFlower_introduction() + "', '"
                    + flower.getFlower_image1() + "', '"+ flower.getFlower_image2()+"','"+flower.getFlower_image3()+"','"+flower.getFlower_image4()+
                    "',"+flower.getFlower_price()+" )";
            DBUtil db=new DBUtil();
            db.openConnection();
            ResultSet rst=db.getInsertObjectIDs(sql);
            if(rst != null && rst.first())
            {
                flower.setFlower_id(rst.getInt(1));

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
    public int update(Flower flower)
    {
        int result=0;
        try
        {
            String sql="update flowers set " + " flower_name  ='" + flower.getFlower_name()+ "', " + " flower_kind  = '"
                    + flower.getFlower_kind() + "', " + " flower_introduction  = '" + flower.getFlower_introduction() + "', "
                    + " flower_image1 = '" + flower.getFlower_image1()+"'," + " flower_image2  = '" + flower.getFlower_image2() + "' , "
                    +" flower_image3='"+flower.getFlower_image3()+"',"+" flower_image4='"+flower.getFlower_image4()+"',"+"flower_price ="+flower.getFlower_price();
            sql+=" where flower_id = " + flower.getFlower_id();
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
            String sql="delete from flowers where flower_id  = " + ID;
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

   /* @SuppressWarnings("finally")
   public String selectplayid(int condt)
    {
        DBUtil db=null;
        String result="";
        try
        {
            String sql="select play_name from play  where play_id= " + condt;
            db=new DBUtil();
            if(!db.openConnection())
            {
                System.out.print("fail to connect database");
                return null;
            }
            ResultSet rst=db.execQuery(sql);
            if(rst != null)
            {while(rst.next())
                {
                    result=rst.getString("play_name");
                } }
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
*/

    @SuppressWarnings("finally")
    @Override
    public List<Flower> select(String flowerinformation)
    {
        DBUtil db=null;
        List<Flower>  flowerList =null;
        flowerList =new LinkedList<Flower>();
        try
        {
            flowerinformation.trim();
            String sql = null;
            /*查询函数的参数是花信息，如果花的信息是图片，将执行第一条SQL语句，否则，执行第二条SQL语句默认按照花的名字搜索*/
            if(flowerinformation.contains("..")){
                 sql="select * from flowers where flower_image1 ='" + flowerinformation+ "' ";
            }
            else{
                 sql="select * from flowers where flower_name like '%" + flowerinformation+ "%' ";
            }

            db=new DBUtil();
            if(!db.openConnection())
            {
                System.out.print("fail to connect database table flowers");
                return null;
            }
            ResultSet rst=db.execQuery(sql);
            if(rst != null)
            {
                while(rst.next())
                {
                    Flower flower = new Flower();
                    flower.setFlower_id(rst.getInt("flower_id"));
                    flower.setFlower_name(rst.getString("flower_name"));
                    flower.setFlower_kind(rst.getString("flower_kind"));
                    flower.setFlower_introduction(rst.getString("flower_introduction"));
                    flower.setFlower_image1(rst.getString("flower_image1"));
                    flower.setFlower_image2(rst.getString("flower_image2"));
                    flower.setFlower_image3(rst.getString("flower_image3"));
                    flower.setFlower_image4(rst.getString("flower_image4"));
                    flower.setFlower_price(rst.getInt("flower_price"));

                    flowerList.add(flower);
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
            return flowerList;
        }
    }
}

