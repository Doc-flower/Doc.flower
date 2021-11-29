package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iOrdersDAO;
import main.java.com.example.docflower.docflower.model.Orders;

import java.util.List;

public class OrdersSrv {
    private iOrdersDAO ordersDAO= DAOFactory.creatEmployeeDAO();

    public int add(Orders play){
        return ordersDAO.insert(play);
    }

    public int modify(Orders order){
        return ordersDAO.update(order);
    }

    public int delete(int ID){
        return ordersDAO.delete(ID);
    }

    public List<Orders> Fetch(String tel,String method){
        return ordersDAO.select(tel,method);
    }

}
