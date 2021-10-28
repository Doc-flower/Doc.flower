package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iShopsDAO;
import main.java.com.example.docflower.docflower.model.Shops;

import java.util.List;

public class ShopsSrv {
	private iShopsDAO stuDAO= DAOFactory.creatStudioDAO();
	
	public int add(Shops stu){
		return stuDAO.insert(stu); 		
	}
	
	public int modify(Shops stu){
		return stuDAO.update(stu);	
	}
	
	public int delete(int ID){
		return stuDAO.delete(ID); 		
	}
	
	public List<Shops> Fetch(String condt){
		return stuDAO.select(condt);		
	}
	
	public List<Shops> FetchId(int id){
		return stuDAO.selectId(id);
	}
}
