package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iCustomerDAO;
import main.java.com.example.docflower.docflower.model.Customer;

import java.util.List;

public class CustomerSrv {

    private iCustomerDAO customerDAO= DAOFactory.creatCustomerDAO();

    public int add(Customer customer){
        return customerDAO.insert(customer);
    }

    public int modify(Customer customer){
        return customerDAO.update(customer);
    }

    public int delete(int ID){
        return customerDAO.delete(ID);
    }

    public List<Customer> Fetch(String email,String method){
        return customerDAO.select(email,method);
    }
}
