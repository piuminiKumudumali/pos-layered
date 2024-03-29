/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.archi.dto;

/**
 *
 * @author PIYUMINI
 */
public class OrderDetailDto {
    
    private String itemId;
    private Integer qty;
    private Double discount;

    public OrderDetailDto() {
    }

    public OrderDetailDto(String itemId, Integer qty, Double discount) {
        this.itemId = itemId;
        this.qty = qty;
        this.discount = discount;
    }

    /**
     * @return the itemId
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    /**
     * @return the discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailDto{" + "itemId=" + itemId + ", qty=" + qty + ", discount=" + discount + '}';
    }

     
    
    
    
}
