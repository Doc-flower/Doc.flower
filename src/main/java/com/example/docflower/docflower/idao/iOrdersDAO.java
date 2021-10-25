package main.java.com.example.docflower.docflower.idao;

import main.java.com.example.docflower.docflower.model.Orders;

import java.util.List;

public interface iOrdersDAO {


    public int insert(Orders play);

    public int update(Orders play);

    public int delete(int ID);


    public List<Orders> select(String employeeEmail);
}
