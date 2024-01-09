/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.archi.dao.custom.impl;

import java.util.ArrayList;
import pos.layered.archi.dao.CrudUtil;
import pos.layered.archi.dao.cutom.OrderDao;
import pos.layered.archi.entity.OrderEntity;

/**
 *
 * @author PIYUMINI
 */
public class OrderDaoImpl implements OrderDao{

    @Override
    public boolean add(OrderEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO orders VALUES(?,?,?)",t.getId(),t.getDate(),t.getCustId());
     }

    @Override
    public boolean update(OrderEntity t) throws Exception {
        return false;
     }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public OrderEntity get(String id) throws Exception {
        return null;
     }

    @Override
    public ArrayList<OrderEntity> getAll() throws Exception {
        return null;
     }
    
}
