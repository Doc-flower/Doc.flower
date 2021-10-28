package main.java.com.example.docflower.docflower.idao;

import main.java.com.example.docflower.docflower.model.Flowers;

import java.util.List;
public interface iFlowersDAO {

    public int insert(Flowers flowers);

    public int update(Flowers flowers);

    public int delete(int ID);

    public List<Flowers> select(String flowerinformation);
}
