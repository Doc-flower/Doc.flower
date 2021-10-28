package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iFlowersDAO;
import main.java.com.example.docflower.docflower.model.Flowers;

import java.util.List;
public class FlowersSrv {

    private iFlowersDAO flowerDAO= DAOFactory.creatflowerDAO();

    public int add(Flowers flowers){

        return flowerDAO.insert(flowers);
    }

    public int modify(Flowers flowers){

        return flowerDAO.update(flowers);
    }

    public int delete(int ID){

        return flowerDAO.delete(ID);
    }

    public List<Flowers> Fetch(String flowerinformation){

        return flowerDAO.select(flowerinformation);
    }
}
