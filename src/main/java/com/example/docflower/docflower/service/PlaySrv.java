package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iPlayDAO;
import main.java.com.example.docflower.docflower.model.Play;

import java.util.List;

public class PlaySrv {

    private iPlayDAO playDAO= DAOFactory.creatPlayDAO();

    public int add(Play play){
        return playDAO.insert(play);
    }

    public int modify(Play play){
        return playDAO.update(play);
    }

    public int delete(int ID){
        return playDAO.delete(ID);
    }

    public List<Play> Fetch(String condt){
        return playDAO.select(condt);
    }

    public List<Play> FetchAll(){
        return playDAO.select("");
    }
}
