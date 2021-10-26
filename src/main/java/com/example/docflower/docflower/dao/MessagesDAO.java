package main.java.com.example.docflower.docflower.dao;

import main.java.com.example.docflower.docflower.idao.iMessagesDAO;
import main.java.com.example.docflower.docflower.model.Messages;
import main.java.com.example.docflower.util.DBUtil;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class MessagesDAO implements iMessagesDAO {
    @SuppressWarnings("finally")
    @Override
    public int insert(Messages messages)
    {
        int result=0;
        try
        {
            String sql="INSERT INTO messages(message_name,message_title,message_email,message_time,message_text)"
                    + " values('" + messages.getName() + "', '" + messages.getTitle() + "', '" + messages.getEmail() + "', '" + messages.getTime() + "', '" + messages.getText() + "' )";
            DBUtil db=new DBUtil();
            db.openConnection();
            ResultSet rst=db.getInsertObjectIDs(sql);
            if(rst != null && rst.first())
            {
                messages.setID(rst.getInt(1));
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

    @Override
    public int delete(int ID)
    {
        int result=0;
        try
        {
            String sql="delete from messages where message_id = " + ID;
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
    public List<Messages> select(String customerEmail)
    {
        DBUtil db=null;
        List<Messages> customerList=null;
        customerList=new LinkedList<Messages>();
        try
        {
            customerEmail.trim();
            String sql = null;
            sql="select * from messages where message_title like '%" + customerEmail + "%'";
            db=new DBUtil();
            if(!db.openConnection())
            {
                System.out.print("fail to connect database table customer");
                return null;
            }
            ResultSet rst=db.execQuery(sql);
            if(rst != null)
            {
                while(rst.next())
                {
                    Messages messages = new Messages();
                    messages.setID(rst.getInt("message_id"));
                    messages.setName(rst.getString("message_name"));
                    messages.setTitle(rst.getString("message_title"));
                    messages.setEmail(rst.getString("message_email"));
                    messages.setTime(rst.getString("message_time"));
                    messages.setText(rst.getString("message_text"));
                    customerList.add(messages);
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
            return customerList;
        }
    }
}
