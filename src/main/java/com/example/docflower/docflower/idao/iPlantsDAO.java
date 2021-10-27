package main.java.com.example.docflower.docflower.idao;

import main.java.com.example.docflower.docflower.model.Plants;

import java.util.List;

public interface iPlantsDAO {
    public int insert(Plants stu);

    public int update(Plants stu);

    public int delete(int ID);

    public List<Plants> select(int playid);

    public List<Plants> selectSchedid(int schedid);

    public List<Plants> selectName(String playname);


}
