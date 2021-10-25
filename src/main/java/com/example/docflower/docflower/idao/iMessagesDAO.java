package main.java.com.example.docflower.docflower.idao;

import main.java.com.example.docflower.docflower.model.Messages;

import java.util.List;

public interface iMessagesDAO {

//
    public int insert(Messages messages);
//
//    public int update(Play play);
//
    public int delete(int ID);
//

    public List<Messages> select(String customerEmail);
}
