package main.java.com.example.docflower.docflower.model;

public class Blogs {

    private int id=0;
    private String name="" ;
    private String owner="";
    private int owner_id = 0;
    private String text="";
    private String time="" ;
    private int views=0;
    private int likes=0;

    public Blogs(){
        id = 0;
    }
    public Blogs(int ID, String name, String owner,int owner_id,String text, String time, int views, int likes){
        this.id = ID;
        this.name=name;
        this.owner = owner;
        this.owner_id = owner_id;

        this.text = text;
        this.time=time;
        this.views = views;
        this.likes = likes;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

    public void setOwner(String intro){
        this.owner=intro;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner_id(int intro){
        this.owner_id=intro;
    }

    public int getOwner_id (){
        return owner_id;
    }

    public void setText(String intro){
        this.text=intro;
    }

    public String getText(){
        return text;
    }

    public void setTime(String img){
        this.time=img;
    }

    public String getTime(){
        return time;
    }

    public void setViews(int imgbg){
        this.views=imgbg;
    }

    public int getViews (){
        return views;
    }

    public void setLikes(int count){
        this.likes=count;
    }

    public int getLikes(){
        return likes;
    }

}
