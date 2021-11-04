package main.java.com.example.docflower.docflower.model;

public class Orders {

    private int id=0;
    private String time="" ;
    private String commodityname="";
    private String commodityimg="";
    private String ownername="" ;
    private String tel="";
    private String address="";
    private String pay="";
    private String status="";

    public Orders(){
        id = 0;
    }
    public Orders(int ID, String time,String commodityname, String commodityimg, String ownername, String tel, String address,String pay,String status){
        this.id = ID;
        this.time=time;
        this.commodityname=commodityname;
        this.commodityimg=commodityimg;
        this.ownername=ownername;
        this.tel = tel;
        this.address = address;
        this.pay = pay;
        this.status=status;

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

    public void setTime(String ownername){
        this.time=ownername;
    }

    public String getTime(){
        return time;
    }

    public void setCommodityname(String ownername){
        this.commodityname=ownername;
    }

    public String getCommodityname(){
        return commodityname;
    }

    public void setCommodityimg(String flowername){
        this.commodityimg=flowername;
    }

    public String getCommodityimg(){
        return commodityimg;
    }

    public void setOwnername(String flowername){
        this.ownername=flowername;
    }

    public String getOwnername(){
        return ownername;
    }

    public void setTel(String tel){
        this.tel=tel;
    }

    public String getTel(){
        return tel;
    }

    public void setAddress(String address){this.address=address;}

    public String getAddress(){
        return address;
    }

    public void setPay(String text){
        this.pay=text;
    }

    public String getPay(){
        return pay;
    }

    public void setStatus(String text){
        this.status=text;
    }

    public String getStatus(){
        return status;
    }


}
