package main.java.com.example.docflower.docflower.model;

public class Plants {
    private int id=0      ;
    private String name="";
    private String intro="";
    private String img1="";
    private String img2="";
    private int price=0;
    private int sale=0;
    private int stock=0;


    public Plants(){
        id = 0;
    }
    public Plants(int ID, String name, String intro, String img1, String img2, int price,int sale,int stock){
        id = ID;
        this.name=name;
        this.intro = intro;
        this.img1 = img1;
        this.img2 = img2;
        this.price = price;
        this.sale = sale;
        this.stock = stock;
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

    public void setName(String studioid){
        this.name=studioid;
    }

    public String getName(){
        return name;
    }

    public void setIntro(String count){
        this.intro=count;
    }

    public String getIntro(){
        return intro;
    }

    public void setImg1(String playname){
        this.img1=playname;
    }

    public String getImg1(){
        return img1;
    }

    public void setImg2(String intro){
        this.img2=intro;
    }

    public String getImg2(){
        return img2;
    }

    public void setPrice(int count){
        this.price=count;
    }

    public int getPrice(){
        return price;
    }

    public void setSale(int intro){
        this.sale=intro;
    }

    public int getSale(){
        return sale;
    }

    public void setStock(int count){
        this.stock=count;
    }

    public int getStock(){
        return stock;
    }

}
