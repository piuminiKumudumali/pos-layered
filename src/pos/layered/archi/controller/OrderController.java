/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.archi.controller;

import pos.layered.archi.dto.OrderDto;
import pos.layered.archi.service.ServiceFactory;
import pos.layered.archi.service.custom.OrderService;

/**
 *
 * @author PIYUMINI
 */
public class OrderController {
    
    private OrderService orderService=(OrderService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ORDER);

    public String placeOrder(OrderDto orderDto) throws Exception {
            return orderService.placeOrder(orderDto);
    }
    
}
