/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pos.layered.archi.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.layered.archi.controller.ItemController;
 
import pos.layered.archi.dto.ItemDto;

/**
 *
 * @author PIYUMINI
 */
public class ItemPanel extends javax.swing.JPanel {
        ItemController itemController;
    /**
     * Creates new form ItemPanel
     */
    public ItemPanel() {
        itemController=new ItemController(); 
        initComponents();
        loadAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        packSizelbl4 = new javax.swing.JLabel();
        uniPriceLbl4 = new javax.swing.JLabel();
        itemPackSizeText = new javax.swing.JTextField();
        itemDescriptionText = new javax.swing.JTextField();
        itemUnitPriceText = new javax.swing.JTextField();
        itemCodeText = new javax.swing.JTextField();
        descriptionlbl4 = new javax.swing.JLabel();
        itemId4 = new javax.swing.JLabel();
        qohLbl4 = new javax.swing.JLabel();
        itemQohText = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        itemLbl = new javax.swing.JLabel();

        packSizelbl4.setText(" Pack Size");

        uniPriceLbl4.setText(" Unit Price");

        descriptionlbl4.setText(" Description");

        itemId4.setText(" Item Code");

        qohLbl4.setText(" QOH");

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        itemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(itemTable);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        deleteBtn.setText(" Delete Item");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setText(" Update Item");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        saveBtn.setText(" Save Item");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(packSizelbl4)
                    .addComponent(descriptionlbl4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(itemPackSizeText, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(deleteBtn)
                                .addGap(24, 24, 24)
                                .addComponent(updateBtn)
                                .addGap(31, 31, 31)
                                .addComponent(saveBtn))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(uniPriceLbl4)
                                .addGap(26, 26, 26)
                                .addComponent(itemUnitPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(qohLbl4)
                                .addGap(18, 18, 18)
                                .addComponent(itemQohText, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(itemDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(itemId4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemId4)
                    .addComponent(itemCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(itemDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionlbl4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(packSizelbl4)
                            .addComponent(itemPackSizeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uniPriceLbl4)
                            .addComponent(itemUnitPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qohLbl4)
                            .addComponent(itemQohText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        itemLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        itemLbl.setText(" Manage Item");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemLbl)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(itemLbl)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void itemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTableMouseClicked
            try {
                searchItem() ;
            } catch (Exception ex) {
                Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_itemTableMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
            try {
                updateItem();
            } catch (Exception ex) {
                Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        addItem() ;
    }//GEN-LAST:event_saveBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
            try {
                deleteItem();
            } catch (Exception ex) {
                Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel descriptionlbl4;
    private javax.swing.JTextField itemCodeText;
    private javax.swing.JTextField itemDescriptionText;
    private javax.swing.JLabel itemId4;
    private javax.swing.JLabel itemLbl;
    private javax.swing.JTextField itemPackSizeText;
    private javax.swing.JTextField itemQohText;
    private javax.swing.JTable itemTable;
    private javax.swing.JTextField itemUnitPriceText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel packSizelbl4;
    private javax.swing.JLabel qohLbl4;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel uniPriceLbl4;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

     
    
    private void addItem() {
         try {
            ItemDto dto=new ItemDto(
                    itemCodeText.getText(),
                    itemDescriptionText.getText(),
                    itemPackSizeText.getText(),
                    Double.parseDouble(itemUnitPriceText.getText()),
                    Integer.parseInt(itemQohText.getText()) 
                );
            
            String result=itemController.addItem(dto);
            JOptionPane.showMessageDialog( this,result);
            clear();
            loadAllItems();
        } catch (Exception ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog( this, ex.getMessage());
        }
    }
    
    private void updateItem() throws Exception {
         try {
            ItemDto itemDto=new ItemDto(
                    itemCodeText.getText(),
                    itemDescriptionText.getText(),
                    itemPackSizeText.getText(),
                    Double.parseDouble( itemUnitPriceText.getText()),
                    Integer.parseInt( itemQohText.getText()));
            
            String resp= itemController.updateItem(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllItems();
        } catch (SQLException ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }
    private void deleteItem() throws Exception {
         try {
            String resp=itemController.deleteItem(itemCodeText.getText());
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllItems();
        } catch (SQLException ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    private void loadAllItems() {
         try {
            String [] colomns={"Code", "Description","PackSize","UnitPrice","Qoh"};
            DefaultTableModel dtm= new DefaultTableModel(colomns, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            itemTable.setModel(dtm);
            
            ArrayList<ItemDto>itemDtos=itemController.getAllItem();
            
            for(ItemDto dto: itemDtos){
                Object[] rowData={dto.getId(),dto.getDescription(),dto.getPackSize(),dto.getUnitPrice(),dto.getQoh()};
                dtm.addRow(rowData);
                
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerViewPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    private void searchItem() throws Exception {
        try {
            String itemCode= itemTable.getValueAt( itemTable.getSelectedRow(), 0).toString();
            ItemDto itemDto=itemController.getItem(itemCode);
            
            if(itemDto!=null){
                itemCodeText.setText(itemDto.getId());
                itemDescriptionText.setText( itemDto.getDescription());
                itemPackSizeText.setText( itemDto.getPackSize());
                itemUnitPriceText.setText(Double.toString( itemDto.getUnitPrice()));
                itemQohText.setText( Integer.toString( itemDto.getQoh()));
                
            }else{
                JOptionPane.showMessageDialog(this, "Item not found");
            }   
        } catch (SQLException ex) {
            Logger.getLogger(ItemPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void clear() {
         itemCodeText.setText("");
        itemDescriptionText.setText( "");
        itemPackSizeText.setText( "");
        itemUnitPriceText.setText( "");
        itemQohText.setText( "");
    }
}
