package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iMessagesDAO;
import main.java.com.example.docflower.docflower.model.Messages;

import java.util.List;

public class MessagesSrv {

    private iMessagesDAO messagesDAO= DAOFactory.creatMessagesDAO();

    public int add(Messages messages){
        return messagesDAO.insert(messages);
    }
//
//    public int modify(Play play){
//        return employeeDAO.update(play);
//    }
//
    public int delete(int ID){
        return messagesDAO.delete(ID);
    }

    public List<Messages> Fetch(String email){
        return messagesDAO.select(email);
    }
}
