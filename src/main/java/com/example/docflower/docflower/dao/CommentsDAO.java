package main.java.com.example.docflower.docflower.dao;

import main.java.com.example.docflower.docflower.idao.iCommentsDAO;
import main.java.com.example.docflower.docflower.model.Comments;
import main.java.com.example.docflower.util.DBUtil;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class CommentsDAO implements iCommentsDAO {
    @Override
    public int insert(Comments comments) {
        int resultPlay=0;
        try
        {
            String sql="insert into comment(blog_id, comment_owner,comment_image, comment_text, comment_time, comment_likes) VALUES"
                    + "(" + comments.getBlog_id()+ ", '" + comments.getComment_owner() + "', '"
                    + comments.getComment_image() + "', '" + comments.getComment_text()
                    + "', '" + comments.getComment_time()+ "', " + comments.getComment_likes() + " )";
            DBUtil db=new DBUtil();
            db.openConnection();
            ResultSet rst=db.getInsertObjectIDs(sql);
            if(rst != null && rst.first())
            {
                comments.setComment_id(rst.getInt(1));
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

    @Override
    public int update(Comments comments) {
        int result=0;
        try
        {
            String sql="update comment set " + " blog_id  =" + comments.getBlog_id() + ", " + " comment_owner   =' "
                    + comments.getComment_owner() + "', " + " comment_image = '" + comments.getComment_image() + "', "
                    + " comment_text  = '" + comments.getComment_text() + "', "+" comment_time='"+comments.getComment_time()+"',"+
                    " comment_likes="+comments.getComment_likes();
            sql+=" where comment_id= " + comments.getComment_id();
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
    public List<Comments> select_CommentId(int comment_id) {
        DBUtil db=null;
        List<Comments> commentsList =null;
        commentsList =new LinkedList<Comments>();
        try
        {
            String sql="select * from comment where comment_id = '" + comment_id + "'";
            db=new DBUtil();
            if(!db.openConnection())
            {
                System.out.print("fail to connect database table comment");
                return null;
            }
            ResultSet rst=db.execQuery(sql);
            if(rst != null)
            {
                while(rst.next())
                {
                    Comments comments=new Comments();
                    comments.setComment_id(rst.getInt("comment_id"));
                    comments.setBlog_id(rst.getInt("blog_id"));
                    comments.setComment_owner(rst.getString("comment_owner"));
                    comments.setComment_image(rst.getString("comment_image"));
                    comments.setComment_text(rst.getString("comment_text"));
                    comments.setComment_time(rst.getString("comment_time"));
                    comments.setComment_likes(rst.getInt("comment_likes"));
                    commentsList.add(comments);
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
            return commentsList;
        }
    }

    @Override
    public List<Comments> select_BlogId(int blog_id) {
        DBUtil db=null;
        List<Comments> commentsList =null;
        commentsList =new LinkedList<Comments>();
        try
        {
            String sql="select * from comment where blog_id = '" + blog_id + "'";
            db=new DBUtil();
            if(!db.openConnection())
            {
                System.out.print("fail to connect database table comment");
                return null;
            }
            ResultSet rst=db.execQuery(sql);
            if(rst != null)
            {
                while(rst.next())
                {
                    Comments comments=new Comments();
                    comments.setComment_id(rst.getInt("comment_id"));
                    comments.setBlog_id(rst.getInt("blog_id"));
                    comments.setComment_owner(rst.getString("comment_owner"));
                    comments.setComment_image(rst.getString("comment_image"));
                    comments.setComment_text(rst.getString("comment_text"));
                    comments.setComment_time(rst.getString("comment_time"));
                    comments.setComment_likes(rst.getInt("comment_likes"));
                    commentsList.add(comments);
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
            return commentsList;
        }
    }
}
