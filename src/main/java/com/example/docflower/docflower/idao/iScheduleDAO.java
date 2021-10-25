package main.java.com.example.docflower.docflower.idao;

import main.java.com.example.docflower.docflower.model.Schedule;

import java.util.List;

public interface iScheduleDAO {
    public int insert(Schedule stu);

    public int update(Schedule stu);

    public int delete(int ID);

    public List<Schedule> select(int playid);

    public List<Schedule> selectSchedid(int schedid);

    public List<Schedule> selectName(String playname);


}
