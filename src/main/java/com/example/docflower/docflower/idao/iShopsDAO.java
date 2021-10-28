/**
 * 
 */
package main.java.com.example.docflower.docflower.idao;

import main.java.com.example.docflower.docflower.model.Shops;

import java.util.List;

public interface iShopsDAO
{
    public int insert(Shops stu);

    public int update(Shops stu);

    public int delete(int ID);

    public List<Shops> select(String studioName);

    public List<Shops> selectId(int shopId);
}
