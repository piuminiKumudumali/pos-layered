/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.archi.service.custom;

import pos.layered.archi.dto.OrderDto;
import pos.layered.archi.service.SuperService;

/**
 *
 * @author PIYUMINI
 */
public interface OrderService extends SuperService{
    String placeOrder(OrderDto dto)throws Exception;
    
}
