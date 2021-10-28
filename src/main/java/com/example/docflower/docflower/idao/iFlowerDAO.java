package main.java.com.example.docflower.docflower.idao;

import main.java.com.example.docflower.docflower.model.Flower;
import java.util.List;
public interface iFlowerDAO{

    public int insert(Flower flower);

    public int update(Flower flower);

    public int delete(int ID);

    public List<Flower> select(String flowerinformation);
}
