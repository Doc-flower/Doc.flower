package main.java.com.example.docflower.docflower.model;

public class Storys {
    private int story_id=0;
    private String story_owner="" ;
    private String story_title="";
    private String story_introduction="";
    private String story_text="" ;
    private String story_image="";
    private String story_time="";

    public Storys(){
        story_id = 0;
    }

    public Storys(int story_id, String story_owner, String story_title, String story_introduction, String story_text, String story_image, String story_time) {
        this.story_id = story_id;
        this.story_owner = story_owner;
        this.story_title = story_title;
        this.story_introduction = story_introduction;
        this.story_text = story_text;
        this.story_image = story_image;
        this.story_time = story_time;
    }

    public int getStory_id() {
        return story_id;
    }

    public void setStory_id(int story_id) {
        this.story_id = story_id;
    }

    public String getStory_owner() {
        return story_owner;
    }

    public void setStory_owner(String story_owner) {
        this.story_owner = story_owner;
    }

    public String getStory_title() {
        return story_title;
    }

    public void setStory_title(String story_title) {
        this.story_title = story_title;
    }

    public String getStory_introduction() {
        return story_introduction;
    }

    public void setStory_introduction(String story_introduction) {
        this.story_introduction = story_introduction;
    }

    public String getStory_text() {
        return story_text;
    }

    public void setStory_text(String story_text) {
        this.story_text = story_text;
    }

    public String getStory_image() {
        return story_image;
    }

    public void setStory_image(String story_image) {
        this.story_image = story_image;
    }

    public String getStory_time() {
        return story_time;
    }

    public void setStory_time(String story_time) {
        this.story_time = story_time;
    }
}
