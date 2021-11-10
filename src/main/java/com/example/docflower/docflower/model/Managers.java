package main.java.com.example.docflower.docflower.model;

public class Managers {

    private int id=0      ;
    private String name="" ;
    private String pwd="";

    public Managers(){
        id = 0;
    }

    public void setID(int ID){
        this.id=ID;
    }

    public int getID(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setPwd(String count){
        this.pwd=count;
    }

    public String getPwd(){
        return pwd;
    }


}

