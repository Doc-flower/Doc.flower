package main.java.com.example.docflower.docflower.idao;

import main.java.com.example.docflower.docflower.model.Play;

import java.util.List;

public interface iPlayDAO {
    public int insert(Play play);

    public int update(Play play);

    public int delete(int ID);

    public List<Play> select(String playName);
}
