package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iPlantsDAO;
import main.java.com.example.docflower.docflower.model.Plants;

import java.util.List;

public class PlantsSrv {
    private iPlantsDAO plantsDAO = DAOFactory.creatScheduleDAO();

    public int add(Plants stu) {
        return plantsDAO.insert(stu);
    }

    public int modify(Plants stu) {
        return plantsDAO.update(stu);
    }

    public int delete(int ID) {
        return plantsDAO.delete(ID);
    }

    public List<Plants> Fetch(int playid) {
        return plantsDAO.select(playid);
    }

    public List<Plants> FetchSchedid(int schedid) {
        return plantsDAO.selectSchedid(schedid);
    }

    public List<Plants> FetchName(String playname) {
        return plantsDAO.selectName(playname);
    }

    public List<Plants> FetchSale_stock(String flag) {
        return plantsDAO.selectsale_stock(flag);
    }
}
