package main.java.com.example.docflower.docflower.dao;

import main.java.com.example.docflower.docflower.idao.iBlogsDAO;
import main.java.com.example.docflower.docflower.model.Blogs;
import main.java.com.example.docflower.util.DBUtil;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class BlogsDAO implements iBlogsDAO
{
    @SuppressWarnings("finally")
    @Override
    public int insert(Blogs blogs)
    {
        int resultPlay=0;
        try
        {
            String sql="insert into blogs(blog_name, blog_owner, blog_owner_id, blog_text, blog_time, blog_views, blog_likes) VALUES"
                    + "('" + blogs.getName() + "', '" + blogs.getOwner() + "', "
                    + blogs.getOwner_id() + ", '"+ blogs.getText() + "', '" + blogs.getTime() + "', " + blogs.getViews() + ", " + blogs.getLikes() + " )";
            DBUtil db=new DBUtil();
            db.openConnection();
            ResultSet rst=db.getInsertObjectIDs(sql);
            if(rst != null && rst.first())
            {
                blogs.setID(rst.getInt(1));
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
    public int update(Blogs blogs)
    {
        int result=0;
        try
        {
            String sql="update blogs set " + " blog_views  =" + blogs.getViews() + ", " + " blog_likes = "
                    + blogs.getLikes();
            sql+=" where blog_id = " + blogs.getID();
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
            String sql="delete from blogs where blog_id = " + ID;
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
    @Override
    public List<Blogs> select(String blogName)
    {
        DBUtil db=null;
        List<Blogs> blogsList =null;
        blogsList =new LinkedList<Blogs>();
        try
        {
            String sql="select * from blogs where blog_name like '%" + blogName + "%'";
            db=new DBUtil();
            if(!db.openConnection())
            {
                System.out.print("fail to connect database table blogs");
                return null;
            }
            ResultSet rst=db.execQuery(sql);
            if(rst != null)
            {
                while(rst.next())
                {
                    Blogs blogs =new Blogs();
                    blogs.setID(rst.getInt("blog_id"));
                    blogs.setName(rst.getString("blog_name"));
                    blogs.setOwner(rst.getString("blog_owner"));
                    blogs.setOwner_id(rst.getInt("blog_owner_id"));
                    blogs.setText(rst.getString("blog_text"));
                    blogs.setImg(rst.getString("blog_image"));
                    blogs.setTime(rst.getString("blog_time"));
                    blogs.setViews(rst.getInt("blog_views"));
                    blogs.setLikes(rst.getInt("blog_likes"));
                    blogsList.add(blogs);
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
            return blogsList;
        }
    }


    @SuppressWarnings("finally")
    @Override
    public List<Blogs> selectId(int id)
    {
        DBUtil db=null;
        List<Blogs> blogsList =null;
        blogsList =new LinkedList<Blogs>();
        try
        {
            String sql="select * from blogs where blog_id = '" + id + "'";
            db=new DBUtil();
            if(!db.openConnection())
            {
                System.out.print("fail to connect database table blogs");
                return null;
            }
            ResultSet rst=db.execQuery(sql);
            if(rst != null)
            {
                while(rst.next())
                {
                    Blogs blogs =new Blogs();
                    blogs.setID(rst.getInt("blog_id"));
                    blogs.setName(rst.getString("blog_name"));
                    blogs.setOwner(rst.getString("blog_owner"));
                    blogs.setOwner_id(rst.getInt("blog_owner_id"));
                    blogs.setText(rst.getString("blog_text"));
                    blogs.setImg(rst.getString("blog_image"));
                    blogs.setTime(rst.getString("blog_time"));
                    blogs.setViews(rst.getInt("blog_views"));
                    blogs.setLikes(rst.getInt("blog_likes"));
                    blogsList.add(blogs);
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
            return blogsList;
        }
    }


    @SuppressWarnings("finally")
    @Override
    public List<Blogs> selectOwnerId(int Ownerid)
    {
        DBUtil db=null;
        List<Blogs> blogsList =null;
        blogsList =new LinkedList<Blogs>();
        try
        {
            String sql="select * from blogs where blog_owner_id = '" + Ownerid + "'";
            db=new DBUtil();
            if(!db.openConnection())
            {
                System.out.print("fail to connect database table blogs");
                return null;
            }
            ResultSet rst=db.execQuery(sql);
            if(rst != null)
            {
                while(rst.next())
                {
                    Blogs blogs =new Blogs();
                    blogs.setID(rst.getInt("blog_id"));
                    blogs.setName(rst.getString("blog_name"));
                    blogs.setOwner(rst.getString("blog_owner"));
                    blogs.setOwner_id(rst.getInt("blog_owner_id"));
                    blogs.setText(rst.getString("blog_text"));
                    blogs.setImg(rst.getString("blog_image"));
                    blogs.setTime(rst.getString("blog_time"));
                    blogs.setViews(rst.getInt("blog_views"));
                    blogs.setLikes(rst.getInt("blog_likes"));
                    blogsList.add(blogs);
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
            return blogsList;
        }
    }

}