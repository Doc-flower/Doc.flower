package main.java.com.example.docflower.docflower.idao;

import main.java.com.example.docflower.docflower.model.Storys;

import java.util.List;

public interface iStorysDAO {

    public List<Storys> select(String name);

    public List<Storys> selectId(int id);
}
