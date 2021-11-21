package main.java.com.example.docflower.docflower.service;
import main.java.com.example.docflower.docflower.idao.DAOFactory;
import main.java.com.example.docflower.docflower.idao.iStorysDAO;
import main.java.com.example.docflower.docflower.model.Storys;
import java.util.List;
public class StorysSrv {

    private iStorysDAO storysDAO= DAOFactory.creatstoryDAO();
    public List<Storys> Fetch(String condt){
        return storysDAO.select(condt);
    }

    public List<Storys> FetchId(int id){
        return storysDAO.selectId(id);
    }
}
