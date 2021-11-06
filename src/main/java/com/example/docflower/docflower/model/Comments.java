package main.java.com.example.docflower.docflower.model;

public class Comments {
    private int comment_id=0;
    private int blog_id=0;
    private String comment_owner="";
    private String comment_image="";
    private String comment_text="";
    private String comment_time="";
    private int comment_likes=0;

    public Comments(){
        comment_id=0;
    }
    public Comments(int comment_id, int blog_id, String comment_owner, String comment_image, String comment_text, String comment_time, int comment_likes) {
        this.comment_id = comment_id;
        this.blog_id = blog_id;
        this.comment_owner = comment_owner;
        this.comment_image = comment_image;
        this.comment_text = comment_text;
        this.comment_time = comment_time;
        this.comment_likes = comment_likes;
    }
    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public String getComment_owner() {
        return comment_owner;
    }

    public void setComment_owner(String comment_owner) {
        this.comment_owner = comment_owner;
    }

    public String getComment_image() {
        return comment_image;
    }

    public void setComment_image(String comment_image) {
        this.comment_image = comment_image;
    }

    public String getComment_text() {
        return comment_text;
    }

    public void setComment_text(String comment_text) {
        this.comment_text = comment_text;
    }

    public String getComment_time() {
        return comment_time;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
    }

    public int getComment_likes() {
        return comment_likes;
    }

    public void setComment_likes(int comment_likes) {
        this.comment_likes = comment_likes;
    }
}