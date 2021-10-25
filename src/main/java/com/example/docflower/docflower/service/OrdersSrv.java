package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iOrdersDAO;
import main.java.com.example.docflower.docflower.model.Orders;

import java.util.List;

public class OrdersSrv {
    private iOrdersDAO employeeDAO= DAOFactory.creatEmployeeDAO();

    public int add(Orders play){
        return employeeDAO.insert(play);
    }

    public int modify(Orders order){
        return employeeDAO.update(order);
    }

    public int delete(int ID){
        return employeeDAO.delete(ID);
    }

    public List<Orders> Fetch(String email){
        return employeeDAO.select(email);
    }

}
