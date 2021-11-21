package main.java.com.example.docflower.docflower.dao;
import main.java.com.example.docflower.docflower.idao.iStorysDAO;
import main.java.com.example.docflower.docflower.model.Storys;
import main.java.com.example.docflower.util.DBUtil;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
public class StorysDAO implements iStorysDAO {

    @Override
    public List<Storys> select(String name) {
        DBUtil db=null;
        List<Storys> storysList =null;
        storysList =new LinkedList<Storys>();
        try
        {
            name.trim();
            String sql="select * from story where story_title like '%" + name + "%'";
            db=new DBUtil();
            if(!db.openConnection())
            {
                System.out.print("fail to connect database table story");
                return null;
            }
            ResultSet rst=db.execQuery(sql);
            if(rst != null)
            {
                while(rst.next())
                {
                    Storys storys =new Storys();
                    storys.setStory_id(rst.getInt("story_id"));
                    storys.setStory_owner(rst.getString("story_owner"));
                    storys.setStory_introduction(rst.getString("story_introduction"));
                    storys.setStory_title(rst.getString("story_title"));
                    storys.setStory_text(rst.getString("story_text"));
                    storys.setStory_image(rst.getString("story_image"));
                    storys.setStory_time(rst.getString("story_time"));
                    storysList.add(storys);
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
            return  storysList;
        }
    }

    @Override
    public List<Storys> selectId(int id) {
        DBUtil db=null;
        List<Storys> storysList =null;
        storysList =new LinkedList<Storys>();
        try
        {
            String sql="select * from story where story_id = '" + id + "'";
            db=new DBUtil();
            if(!db.openConnection())
            {
                System.out.print("fail to connect database table story");
                return null;
            }
            ResultSet rst=db.execQuery(sql);
            if(rst != null)
            {
                while(rst.next())
                {
                    Storys storys =new Storys();
                    storys.setStory_id(rst.getInt("story_id"));
                    storys.setStory_owner(rst.getString("story_owner"));
                    storys.setStory_introduction(rst.getString("story_introduction"));
                    storys.setStory_title(rst.getString("story_title"));
                    storys.setStory_text(rst.getString("story_text"));
                    storys.setStory_image(rst.getString("story_image"));
                    storys.setStory_time(rst.getString("story_time"));
                    storysList.add(storys);
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
            return storysList;
        }
    }

}

