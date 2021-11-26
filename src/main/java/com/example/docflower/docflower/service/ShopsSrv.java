package main.java.com.example.docflower.docflower.service;

import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iShopsDAO;
import main.java.com.example.docflower.docflower.model.Shops;

import java.util.List;

public class ShopsSrv {
	private iShopsDAO shopsDAO= DAOFactory.creatStudioDAO();
	
	public int add(Shops stu){
		return shopsDAO.insert(stu);
	}
	
	public int modify(Shops stu){
		return shopsDAO.update(stu);
	}
	
	public int delete(int ID){
		return shopsDAO.delete(ID);
	}
	
	public List<Shops> Fetch(String condt){
		return shopsDAO.select(condt);
	}
	
	public List<Shops> FetchId(int id){
		return shopsDAO.selectId(id);
	}
}
