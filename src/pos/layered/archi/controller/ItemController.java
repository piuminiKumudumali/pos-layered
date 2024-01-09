/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.archi.controller;

import java.util.ArrayList;
import pos.layered.archi.dto.ItemDto;
import pos.layered.archi.service.ServiceFactory;
import pos.layered.archi.service.custom.ItemService;

/**
 *
 * @author PIYUMINI
 */
public class ItemController {
     ItemService itemService=(ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);
    
    public String addItem(ItemDto itemDto) throws Exception {
         return itemService.addItem(itemDto);
         
    }
     public String updateItem(ItemDto itemDto) throws Exception {
        return itemService.updateItem(itemDto);
     }

    public String deleteItem(String id) throws Exception {
        return itemService.deleteItem(id);
    }
   
     public ItemDto getItem(String itemId) throws Exception{
        return itemService.getItem(itemId);
    }    
    public ArrayList<ItemDto> getAllItem() throws Exception {
        return itemService.getAllItem();
    }
     
     
    

}
