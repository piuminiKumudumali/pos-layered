/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.archi.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import pos.layered.archi.dao.CrudUtil;
import pos.layered.archi.dao.cutom.ItemDao;
import pos.layered.archi.entity.ItemEntity;

/**
 *
 * @author PIYUMINI
 */
public class ItemDaoImpl implements ItemDao{
     @Override
    public boolean add(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO item VALUES(?,?,?,?,?)",t.getId()
                                      ,t.getDescription(),t.getPackSize(),t.getUnitPrice(),t.getQoh());
     }

    @Override
    public boolean update(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate( "UPDATE Item SET Description=?,PackSize=?,UnitPrice=?,QtyOnHand=? WHERE ItemCode=?",
                                        t.getDescription(),t.getPackSize(),t.getUnitPrice(),t.getQoh(),t.getId());
        
     }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate( "DELETE FROM Item WHERE ItemCode=?",id);
    }

    @Override
    public ItemEntity get(String id) throws Exception {
        ResultSet rst=CrudUtil.executeQuery( "SELECT * FROM Item WHERE ItemCode=?", id);
        
        while(rst.next()){
        return new ItemEntity(
                rst.getString(1),
                rst.getString( 2),
                rst.getString( 3),
                rst.getDouble(4),
                rst.getInt(5));
        }
        return null;
        
     }

    @Override
    public ArrayList<ItemEntity> getAll() throws Exception {
        ArrayList<ItemEntity>itemEntitys=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery("SELECT * FROM Item");
        
        while(rst.next()){
            ItemEntity entity=new ItemEntity( 
                    rst.getString(1),
                    rst.getString( 2), 
                    rst.getString( 3),
                    rst.getDouble(4 ),
                    rst.getInt( 5));
            itemEntitys.add(entity);
        }
        return itemEntitys;
     }
    
}
