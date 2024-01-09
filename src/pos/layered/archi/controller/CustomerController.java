/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.archi.controller;

import java.util.ArrayList;
import pos.layered.archi.dto.CustomerDto;
import pos.layered.archi.service.ServiceFactory;
import pos.layered.archi.service.custom.CustomerService;
 
/**
 *
 * @author PIYUMINI
 */
public class CustomerController {
    CustomerService customerService=(CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    
    public String addCustomer(CustomerDto custDto) throws Exception {
         return customerService.addCustomer(custDto);
    }

    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        return customerService.getAllCustomer();
    }

    public String updateCustomer(CustomerDto custDto) throws Exception {
        return customerService.updateCustomer(custDto);
     }

    public String deleteCustomer(String id) throws Exception {
        return customerService.deleteCustomer(id);
     }

    public CustomerDto getCustomer(String custId) throws Exception {
        return customerService.getCustomer(custId);
    }
    
}
