package main.java.com.example.docflower.docflower.dao;

import main.java.com.example.docflower.docflower.idao.iManagersDAO;
import main.java.com.example.docflower.docflower.idao.iMessagesDAO;
import main.java.com.example.docflower.docflower.model.Managers;
import main.java.com.example.docflower.docflower.model.Messages;
import main.java.com.example.docflower.util.DBUtil;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class ManagersDAO implements iManagersDAO {

    @SuppressWarnings("finally")
    @Override
    public List<Managers> select(String manName)
    {
        DBUtil db=null;
        List<Managers> managersList=null;
        managersList=new LinkedList<Managers>();
        try
        {
            manName.trim();
            String sql = null;
            sql="select * from managers where man_name like '" + manName + "'";
            db=new DBUtil();
            if(!db.openConnection())
            {
                System.out.print("fail to connect database table managers");
                return null;
            }
            ResultSet rst=db.execQuery(sql);
            if(rst != null)
            {
                while(rst.next())
                {
                    Managers managers = new Managers();
                    managers.setID(rst.getInt("man_id"));
                    managers.setName(rst.getString("man_name"));
                    managers.setPwd(rst.getString("man_pwd"));
                    System.out.println("rst.getString" + rst.getString("man_pwd"));

                    managersList.add(managers);
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
            return managersList;
        }
    }
}
