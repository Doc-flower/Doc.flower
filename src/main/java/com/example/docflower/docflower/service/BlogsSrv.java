package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iBlogsDAO;
import main.java.com.example.docflower.docflower.model.Blogs;

import java.util.List;

public class BlogsSrv {

    private iBlogsDAO playDAO= DAOFactory.creatPlayDAO();

    public int add(Blogs blogs){
        return playDAO.insert(blogs);
    }

    public int modify(Blogs blogs){
        return playDAO.update(blogs);
    }

    public int delete(int ID){
        return playDAO.delete(ID);
    }

    public List<Blogs> Fetch(String condt){
        return playDAO.select(condt);
    }

    public List<Blogs> FetchAll(){
        return playDAO.select("");
    }
}
