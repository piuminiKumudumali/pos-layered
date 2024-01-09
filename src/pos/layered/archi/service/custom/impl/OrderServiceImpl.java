/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.archi.service.custom.impl;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import pos.layered.archi.dao.DaoFactory;
import pos.layered.archi.dao.cutom.ItemDao;
import pos.layered.archi.dao.cutom.OrderDao;
import pos.layered.archi.dao.cutom.OrderDetailDao;
import pos.layered.archi.db.DBconnection;
import pos.layered.archi.dto.OrderDetailDto;
import pos.layered.archi.dto.OrderDto;
import pos.layered.archi.entity.ItemEntity;
import pos.layered.archi.entity.OrderDetailEntity;
import pos.layered.archi.entity.OrderEntity;
import pos.layered.archi.service.custom.OrderService;

/**
 *
 * @author PIYUMINI
 */
public class OrderServiceImpl implements OrderService{
    
   private OrderDao orderDao=(OrderDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER);
   private OrderDetailDao orderDetailDao=(OrderDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER_DETAIL);
   private ItemDao itemDao=(ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String placeOrder(OrderDto dto) throws Exception {
         
         Connection connection = DBconnection.getInstance().getConnection();
        
        try {
            connection.setAutoCommit(false);
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            if(orderDao.add(new OrderEntity(dto.getOrderId(), sdf.format(new Date()), dto.getCustomerId()))){
                boolean isOrderSaved = true;
                
                for (OrderDetailDto detailDto : dto.getOrderDetailDtos()) {
                    if(!orderDetailDao.add(new OrderDetailEntity(dto.getOrderId(), detailDto.getItemId(), detailDto.getQty(), detailDto.getDiscount()))){
                        isOrderSaved = false;
                    }
                }
                
                if(isOrderSaved){
                    boolean isItemUpdated = true;
                    
                    for (OrderDetailDto detailDto : dto.getOrderDetailDtos()) {
                        ItemEntity entity = itemDao.get(detailDto.getItemId());
                        entity.setQoh(entity.getQoh() - detailDto.getQty());
                        if(!itemDao.update(entity)){
                            isItemUpdated = false;
                        }
                    }
                    
                    if(isItemUpdated){
                        connection.commit();
                        return "Success";
                    } else{
                        connection.rollback();
                        return "Item Update Error";
                    }
                    
                } else{
                    connection.rollback();
                    return "Order Detail Save Error";
                }
            } else{
                connection.rollback();
                return "Order Save Error";
            }
            
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }
    
}
