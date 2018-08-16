/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Customer;

import Job.JobIndexJFrame;
import Positon.PositonIndexJFrame;
import Route.RouteIndexJFrame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
import shortest_path.Main;

/**
 *
 * @author Nannii
 */
public class CustomerCreateJFram extends javax.swing.JFrame {

    /** Creates new form CustomerCreateJFram */
    public CustomerCreateJFram() {
        initComponents();
        CreateCustomer();
    }
    public void CreateCustomer(){
    CustomerModel model = new CustomerModel();
        ResultSet result = model.select();

        try {
            // 5. แสดงผล

            while (result.next()) {
            // 
            
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        path = new javax.swing.JLabel();
        but_job = new javax.swing.JButton();
        but_position = new javax.swing.JButton();
        but_customer = new javax.swing.JButton();
        but_route = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        add_position = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        telephone = new javax.swing.JLabel();
        txt_telephone = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        but_save = new javax.swing.JButton();
        but_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        path.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        path.setText("ระบบการวางแผนการขนส่งเพื่อหาเส้นทางที่สั้นที่สุด");

        but_job.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_job.setText("รอบงาน");
        but_job.setMaximumSize(new java.awt.Dimension(87, 23));
        but_job.setMinimumSize(new java.awt.Dimension(87, 23));
        but_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_jobActionPerformed(evt);
            }
        });

        but_position.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_position.setText("ที่อยู่ลูกค้า");
        but_position.setMaximumSize(new java.awt.Dimension(87, 23));
        but_position.setMinimumSize(new java.awt.Dimension(87, 23));
        but_position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_positionActionPerformed(evt);
            }
        });

        but_customer.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_customer.setText("ข้อมูลลูกค้า");
        but_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_customerActionPerformed(evt);
            }
        });

        but_route.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_route.setText("หน้าหลัก");
        but_route.setMaximumSize(new java.awt.Dimension(87, 23));
        but_route.setMinimumSize(new java.awt.Dimension(87, 23));
        but_route.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_routeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(but_route, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_customer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_position, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_job, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_route, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_customer)
                    .addComponent(but_position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        add_position.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        add_position.setText("เพิ่มข้อมูลที่อยู่ลูกค้า ");

        name.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        name.setText("ชื่อ - นามสกุล :");

        txt_name.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        telephone.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        telephone.setText("เบอร์โทร :");

        txt_telephone.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        txt_telephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telephoneActionPerformed(evt);
            }
        });

        email.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        email.setText("        อีเมล์ :");

        txt_email.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N

        but_save.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_save.setText("Save");
        but_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_saveActionPerformed(evt);
            }
        });

        but_back.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_back.setText("Back");
        but_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(561, Short.MAX_VALUE)
                .addComponent(but_back, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(telephone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(but_save, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(add_position)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(add_position)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephone)
                    .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(but_save)
                .addGap(78, 78, 78)
                .addComponent(but_back)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_telephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telephoneActionPerformed

    private void but_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_saveActionPerformed
        // TODO add your handling code here:
        //GET Input
        String name = this.txt_name.getText();
        String telephone = this.txt_telephone.getText();
        String email = this.txt_email.getText();
        //New Model
        CustomerModel model = new CustomerModel();
        model.insert(name, telephone, email);
        //call insert function
        
        //Change page
        this.dispose();
        CustomerIndexJFrame obj = new CustomerIndexJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_but_saveActionPerformed

    private void but_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_backActionPerformed
        this.dispose();
        CustomerIndexJFrame obj = new CustomerIndexJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_but_backActionPerformed

    private void but_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_jobActionPerformed
        this.dispose();
        JobIndexJFrame obj = new JobIndexJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_but_jobActionPerformed

    private void but_positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_positionActionPerformed
        this.dispose();
        PositonIndexJFrame obj = new PositonIndexJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_but_positionActionPerformed

    private void but_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_customerActionPerformed
        this.dispose();
        CustomerIndexJFrame obj = new CustomerIndexJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_but_customerActionPerformed

    private void but_routeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_routeActionPerformed
        this.dispose();
        RouteIndexJFrame obj = new RouteIndexJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_but_routeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_position;
    private javax.swing.JButton but_back;
    private javax.swing.JButton but_customer;
    private javax.swing.JButton but_job;
    private javax.swing.JButton but_position;
    private javax.swing.JButton but_route;
    private javax.swing.JButton but_save;
    private javax.swing.JLabel email;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel path;
    private javax.swing.JLabel telephone;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_telephone;
    // End of variables declaration//GEN-END:variables

}
