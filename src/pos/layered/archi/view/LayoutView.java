/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.layered.archi.view;

/**
 *
 * @author PIYUMINI
 */
public class LayoutView extends javax.swing.JFrame {

    /**
     * Creates new form LayoutView
     */
    public LayoutView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        sideNavBar = new javax.swing.JPanel();
        manageCustomerButton = new javax.swing.JButton();
        manageItemButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sideNavBar.setBackground(new java.awt.Color(51, 153, 255));

        manageCustomerButton.setBackground(new java.awt.Color(21, 242, 242));
        manageCustomerButton.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        manageCustomerButton.setForeground(new java.awt.Color(0, 0, 153));
        manageCustomerButton.setText(" Manage Customer");
        manageCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerButtonActionPerformed(evt);
            }
        });

        manageItemButton.setBackground(new java.awt.Color(21, 242, 242));
        manageItemButton.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        manageItemButton.setForeground(new java.awt.Color(0, 0, 153));
        manageItemButton.setText(" Manage Item");
        manageItemButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        manageItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageItemButtonActionPerformed(evt);
            }
        });

        orderButton.setBackground(new java.awt.Color(21, 242, 242));
        orderButton.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        orderButton.setForeground(new java.awt.Color(0, 0, 153));
        orderButton.setText(" Order");
        orderButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideNavBarLayout = new javax.swing.GroupLayout(sideNavBar);
        sideNavBar.setLayout(sideNavBarLayout);
        sideNavBarLayout.setHorizontalGroup(
            sideNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideNavBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideNavBarLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(manageCustomerButton))
                    .addGroup(sideNavBarLayout.createSequentialGroup()
                        .addGroup(sideNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        sideNavBarLayout.setVerticalGroup(
            sideNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideNavBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(manageItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        headerPanel.setBackground(new java.awt.Color(188, 245, 245));

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Super Market");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(sideNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sideNavBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void manageCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerButtonActionPerformed
         loadCustomerPanel();
    }//GEN-LAST:event_manageCustomerButtonActionPerformed

    private void manageItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageItemButtonActionPerformed
         loadItemPanel();
    }//GEN-LAST:event_manageItemButtonActionPerformed

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        loadOrderPanel();
    }//GEN-LAST:event_orderButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LayoutView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton manageCustomerButton;
    private javax.swing.JButton manageItemButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JPanel sideNavBar;
    // End of variables declaration//GEN-END:variables

    private void loadCustomerPanel() {
        bodyPanel.removeAll();
        CustomerViewPanel customerViewPanel=new CustomerViewPanel();
        customerViewPanel.setSize( bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add( customerViewPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadItemPanel() {
        bodyPanel.removeAll();
        ItemPanel itemPanel=new ItemPanel();
        itemPanel.setSize( bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add( itemPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadOrderPanel() {
        bodyPanel.removeAll();
        OrderPanel orderPanel=new OrderPanel();
        orderPanel.setSize( bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add( orderPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }
}
