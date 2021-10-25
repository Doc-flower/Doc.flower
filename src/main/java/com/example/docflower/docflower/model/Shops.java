package main.java.com.example.docflower.docflower.model;


public class Shops {
	private int id=0      ; 
	private String name="" ;
	private String address="";
	private String tel=""; //���
	private String text="";


	public Shops(){
		id = 0;
	}
	public Shops(int ID, String name, String address, String tel,String text){
		id = ID;
		this.name=name;
		this.address = address;
		this.tel = tel;
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
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAddress(String  count){
		this.address=count;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setTel(String intro){
		this.tel=intro;
	}
	
	public String getTel(){
		return tel;
	}

	public void setText(String intro){
		this.text=intro;
	}

	public String getText(){
		return text;
	}

}
