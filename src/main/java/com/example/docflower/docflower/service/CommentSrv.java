package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iCommentsDAO;
import main.java.com.example.docflower.docflower.model.Blogs;
import main.java.com.example.docflower.docflower.model.Comments;
import java.util.List;

public class CommentSrv {
    private iCommentsDAO commentsDAO = DAOFactory.creatcommentDAO();

    public int add(Comments comments){
        return commentsDAO .insert(comments);
    }

    public int modify(Comments comments){
        return commentsDAO .update(comments);
    }

    public List<Comments> Fetch_CommentId(int comment_id){
        return commentsDAO.select_CommentId(comment_id);
    }

    public List<Comments> Fetch_BlogId(int blog_id){
        return commentsDAO.select_BlogId(blog_id);
    }
}
