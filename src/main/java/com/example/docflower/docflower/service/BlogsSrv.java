package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iBlogsDAO;
import main.java.com.example.docflower.docflower.model.Blogs;

import java.util.List;

public class BlogsSrv {

    private iBlogsDAO blogsDAO= DAOFactory.creatPlayDAO();

    public int add(Blogs blogs){
        return blogsDAO.insert(blogs);
    }

    public int modify(Blogs blogs){
        return blogsDAO.update(blogs);
    }

    public int delete(int ID){
        return blogsDAO.delete(ID);
    }

    public List<Blogs> Fetch(String condt){
        return blogsDAO.select(condt);
    }

    public List<Blogs> FetchId(int id){
        return blogsDAO.selectId(id);
    }

    public List<Blogs> FetchOwnerId(int Ownerid){
        return blogsDAO.selectOwnerId(Ownerid);
    }

}
