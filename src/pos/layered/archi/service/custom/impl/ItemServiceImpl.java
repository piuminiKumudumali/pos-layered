/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.archi.service.custom.impl;

import java.util.ArrayList;
import pos.layered.archi.dao.DaoFactory;
import pos.layered.archi.dao.cutom.ItemDao;
import pos.layered.archi.dto.ItemDto;
import pos.layered.archi.entity.ItemEntity;
import pos.layered.archi.service.custom.ItemService;

/**
 *
 * @author PIYUMINI
 */
public class ItemServiceImpl implements ItemService{
    
    ItemDao itemDao= (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String addItem(ItemDto dto) throws Exception {
          ItemEntity ce=new ItemEntity(
                dto.getId(),
                dto.getDescription(),
                dto.getPackSize(),
                dto.getUnitPrice(),
                dto.getQoh());
        
        if(itemDao.add(ce)){
            return "successfully added item";
        }else{
            return "fail";
        }
        
    }

    @Override
    public String updateItem(ItemDto dto) throws Exception {
         ItemEntity ce=new ItemEntity(
                dto.getId(),
                dto.getDescription(),
                dto.getPackSize(),
                dto.getUnitPrice(),
                dto.getQoh());
        
        if(itemDao.update(ce)){
            return "successfully updated item";
        }else{
            return "fail";
        }
        
    }

    @Override
    public String deleteItem(String id) throws Exception {
        if(itemDao.delete(id)){
            return "Successfully deleted";
        }else{
            return "Fail";
        }
     }

    @Override
      public ItemDto getItem(String id) throws Exception {
        ItemEntity entity = itemDao.get(id);
        return new ItemDto(entity.getId(),
                entity.getDescription(), entity.getPackSize(),
                entity.getUnitPrice(), entity.getQoh());
    }


    @Override
    public ArrayList<ItemDto> getAllItem() throws Exception {
         ArrayList<ItemDto>itemDtos=new ArrayList<>();
         
         ArrayList<ItemEntity>itemEntitys=itemDao.getAll();
         
         for(ItemEntity entity:itemEntitys){
             ItemDto itemDto=new ItemDto(
                                entity.getId(),
                          entity.getDescription(),
                            entity.getPackSize(),
                           entity.getUnitPrice(),
                                entity.getQoh()
                              );
             itemDtos.add(itemDto);
         }
         return itemDtos;
    }
}    