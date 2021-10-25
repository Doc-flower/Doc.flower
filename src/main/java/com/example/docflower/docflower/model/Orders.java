package main.java.com.example.docflower.docflower.model;

public class Orders {

    private int id=0      ;
    private String ownername="" ;
    private String flowername="";
    private String tel="";
    private String address="";
    private String text="";

    public Orders(){
        id = 0;
    }
    public Orders(int ID, String ownername,String flowername, String tel, String address,String text){
        this.id = ID;
        this.ownername=ownername;
        this.flowername=flowername;
        this.tel = tel;
        this.address = address;
        this.text = text;

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

    public void setOwnername(String ownername){
        this.ownername=ownername;
    }

    public String getOwnername(){
        return ownername;
    }

    public void setFlowername(String flowername){
        this.flowername=flowername;
    }

    public String getFlowername(){
        return flowername;
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

    public void setText(String text){
        this.text=text;
    }

    public String getText(){
        return text;
    }


}
