package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iFlowerDAO;
import main.java.com.example.docflower.docflower.model.Flower;

import java.util.List;
public class FlowersSrv {

    private iFlowerDAO flowerDAO= DAOFactory.creatflowerDAO();

    public int add(Flower flower){

        return flowerDAO.insert(flower);
    }

    public int modify(Flower flower){

        return flowerDAO.update(flower);
    }

    public int delete(int ID){

        return flowerDAO.delete(ID);
    }

    public List<Flower> Fetch(String flowerinformation){

        return flowerDAO.select(flowerinformation);
    }
}
