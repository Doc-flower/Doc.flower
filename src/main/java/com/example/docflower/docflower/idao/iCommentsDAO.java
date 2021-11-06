package main.java.com.example.docflower.docflower.idao;

import main.java.com.example.docflower.docflower.model.Comments;
import java.util.List;

public interface iCommentsDAO {

    public int insert(Comments comments);

    public int update(Comments comments);

   // public int delete(int ID);

   // public List<Comments> select(String comment_name);

    public List<Comments> select_CommentId(int comment_id);

    public List<Comments> select_BlogId(int blog_id);
}
