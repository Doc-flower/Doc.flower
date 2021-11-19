package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iPlantsDAO;
import main.java.com.example.docflower.docflower.model.Plants;

import java.util.List;

public class PlantsSrv {
    private iPlantsDAO scheDAO = DAOFactory.creatScheduleDAO();

    public int add(Plants stu) {
        return scheDAO.insert(stu);
    }

    public int modify(Plants stu) {
        return scheDAO.update(stu);
    }

    public int delete(int ID) {
        return scheDAO.delete(ID);
    }

    public List<Plants> Fetch(int playid) {
        return scheDAO.select(playid);
    }

    public List<Plants> FetchSchedid(int schedid) {
        return scheDAO.selectSchedid(schedid);
    }

    public List<Plants> FetchName(String playname) {
        return scheDAO.selectName(playname);
    }

    public List<Plants> FetchSale_stock() {
        return scheDAO.selectsale_stock();
    }
}
