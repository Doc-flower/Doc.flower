package main.java.com.example.docflower.docflower.model;

public class Flower {
    private int flower_id=0;
    private String flower_name="";
    private String flower_kind="";
    private String flower_introduction="";
    private String flower_image1="";
    private String flower_image2="";
    private String flower_image3="";
    private String flower_image4="";
    private int flower_price=0;

    public Flower(){
        flower_id=0;
    }

    public Flower(int flower_id, String flower_name, String flower_kind, String flower_introduction, String flower_image1, String flower_image2, String flower_image3, String flower_image4, int flower_price) {
        this.flower_id = flower_id;
        this.flower_name = flower_name;
        this.flower_kind = flower_kind;
        this.flower_introduction = flower_introduction;
        this.flower_image1 = flower_image1;
        this.flower_image2 = flower_image2;
        this.flower_image3 = flower_image3;
        this.flower_image4 = flower_image4;
        this.flower_price = flower_price;
    }

    public int getFlower_id() {
        return flower_id;
    }

    public String getFlower_name() {
        return flower_name;
    }

    public String getFlower_kind() {
        return flower_kind;
    }

    public String getFlower_introduction() {
        return flower_introduction;
    }

    public String getFlower_image1() {
        return flower_image1;
    }

    public String getFlower_image2() {
        return flower_image2;
    }

    public String getFlower_image3() {
        return flower_image3;
    }

    public String getFlower_image4() {
        return flower_image4;
    }

    public int getFlower_price() {
        return flower_price;
    }


    public void setFlower_id(int flower_id) {
        this.flower_id = flower_id;
    }

    public void setFlower_name(String flower_name) {
        this.flower_name = flower_name;
    }

    public void setFlower_kind(String flower_kind) {
        this.flower_kind = flower_kind;
    }

    public void setFlower_introduction(String flower_introduction) {
        this.flower_introduction = flower_introduction;
    }

    public void setFlower_image1(String flower_image1) {
        this.flower_image1 = flower_image1;
    }

    public void setFlower_image2(String flower_image2) {
        this.flower_image2 = flower_image2;
    }

    public void setFlower_image3(String flower_image3) {
        this.flower_image3 = flower_image3;
    }

    public void setFlower_image4(String flower_image4) {
        this.flower_image4 = flower_image4;
    }

    public void setFlower_price(int flower_price) {
        this.flower_price = flower_price;
    }
}
