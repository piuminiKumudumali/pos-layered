/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.archi.service.custom;

import java.util.ArrayList;
import pos.layered.archi.dto.CustomerDto;
import pos.layered.archi.service.SuperService;

/**
 *
 * @author PIYUMINI
 */
public interface CustomerService extends SuperService{
    String addCustomer(CustomerDto customerDto)throws Exception;
    String updateCustomer(CustomerDto customerDto)throws Exception;
    String deleteCustomer(String id)throws Exception;
    CustomerDto getCustomer(String id)throws Exception;
    ArrayList<CustomerDto> getAllCustomer()throws Exception;
}
