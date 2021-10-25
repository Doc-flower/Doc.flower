package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iScheduleDAO;
import main.java.com.example.docflower.docflower.model.Schedule;

import java.util.List;

public class ScheduleSrv {
    private iScheduleDAO scheDAO= DAOFactory.creatScheduleDAO();

    public int add(Schedule stu){
        return scheDAO.insert(stu);
    }

    public int modify(Schedule stu){
        return scheDAO.update(stu);
    }

    public int delete(int ID){
        return scheDAO.delete(ID);
    }

    public List<Schedule> Fetch(int playid){
        return scheDAO.select(playid);
    }

    public List<Schedule> FetchSchedid(int schedid){
        return scheDAO.selectSchedid(schedid);
    }

    public List<Schedule> FetchName(String playname){
        return scheDAO.selectName(playname);
    }
}
