package main.java.com.example.docflower.docflower.idao;

import main.java.com.example.docflower.docflower.model.Customer;

import java.util.List;

public interface iCustomerDAO {

//
    public int insert(Customer customer);
//
    public int update(Customer customer);
//
    public int delete(int ID);
//

    public List<Customer> select(String customerEmail,String method,String path);
}
