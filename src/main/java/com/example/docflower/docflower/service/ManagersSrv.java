package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iManagersDAO;
import main.java.com.example.docflower.docflower.model.Managers;

import java.util.List;

public class ManagersSrv {

    private iManagersDAO managersDAO= DAOFactory.creatManagersDAO();

    public List<Managers> Fetch(String name){
        return managersDAO.select(name);
    }
}
