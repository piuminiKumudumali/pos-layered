/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.archi.service.custom.impl;

import java.util.ArrayList;
import pos.layered.archi.dao.DaoFactory;
import pos.layered.archi.dao.cutom.CustomerDao;
import pos.layered.archi.dto.CustomerDto;
import pos.layered.archi.entity.CustomerEntity;
import pos.layered.archi.service.custom.CustomerService;

/**
 *
 * @author PIYUMINI
 */
public class CustomerServiceImpl implements CustomerService{
    
    CustomerDao customerDao=(CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public String addCustomer(CustomerDto customerDto)throws Exception {
        
         
        CustomerEntity ce=new CustomerEntity(
                customerDto.getId(),
                customerDto.getTitle(),
                customerDto.getName(),
                customerDto.getDob(),
                customerDto.getSalary(),
                customerDto.getAddress(), 
                customerDto.getCity(), 
                customerDto.getProvince(), 
                customerDto.getZip());
        
        if(customerDao.add(ce)){
            return "successfully added customer";
        }else{
            return "fail";
        }
    }

    @Override
    public String updateCustomer(CustomerDto customerDto) throws Exception {
          
        CustomerEntity ce=new CustomerEntity(
                customerDto.getId(),
                customerDto.getTitle(),
                customerDto.getName(),
                customerDto.getDob(),
                customerDto.getSalary(),
                customerDto.getAddress(), 
                customerDto.getCity(), 
                customerDto.getProvince(), 
                customerDto.getZip());
        
        if(customerDao.update(ce)){
            return "successfully updated customer";
        }else{
            return "fail";
        }
        
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
         if(customerDao.delete(id)){
            return "successfully deleted customer";
        }else{
            return "fail";
        }
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity customerEntity=customerDao.get(id);
        return new CustomerDto(
                   customerEntity.getCustID(),
                    customerEntity.getTitle(),
                    customerEntity.getName(),
                    customerEntity.getDob(),
                    customerEntity.getSalary(),
                    customerEntity.getAddress(), 
                    customerEntity.getCity(), 
                    customerEntity.getProvince(), 
                    customerEntity.getZip()
                  );
     }

    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        ArrayList<CustomerDto>customerDtos=new ArrayList<>();
        ArrayList<CustomerEntity>customerEntitys=customerDao.getAll();
        
        for(CustomerEntity customerEntity:customerEntitys){
            CustomerDto customerDto=new CustomerDto(
                                         customerEntity.getCustID(),
                                       customerEntity.getTitle(),
                                        customerEntity.getName(),
                                         customerEntity.getDob(),
                                      customerEntity.getSalary(),
                                      customerEntity.getAddress(), 
                                        customerEntity.getCity(), 
                                     customerEntity.getProvince(), 
                                         customerEntity.getZip());
            customerDtos.add(customerDto);
        }
        return customerDtos;
        
    }
    
}
