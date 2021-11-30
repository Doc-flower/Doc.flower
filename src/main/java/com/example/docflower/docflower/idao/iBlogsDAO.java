package main.java.com.example.docflower.docflower.idao;

import main.java.com.example.docflower.docflower.model.Blogs;

import java.util.List;

public interface iBlogsDAO {
    public int insert(Blogs blogs);

    public int update(Blogs blogs);

    public int delete(int ID);

    public List<Blogs> select(String playName);

    public List<Blogs> selectId(int id);

    public List<Blogs> selectOwnerId(int Ownerid);
}
