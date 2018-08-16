/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Positon;

import Customer.CustomerIndexJFrame;
import Job.JobIndexJFrame;
import Route.RouteIndexJFrame;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Nannii
 */
public class PositonIndexJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PositonIndexJFrame
     */
    public PositonIndexJFrame() {
        initComponents();
        showTable();
    }
    
    public void showTable(){
        PositonModel model = new PositonModel();
        ResultSet result = model.select();
        tb_position.setModel(DbUtils.resultSetToTableModel(result));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
        data = new javax.swing.JLabel();
        Zipcode = new javax.swing.JLabel();
        txt_zipcode = new javax.swing.JTextField();
        but_search = new javax.swing.JButton();
        but_add_position = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_position = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

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
            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
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
                .addContainerGap(30, Short.MAX_VALUE))
        );

        data.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        data.setText("รายละเอียดข้อมูลที่อยู่ลูกค้า");

        Zipcode.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        Zipcode.setText("รหัสไปรษณีย์ :");

        txt_zipcode.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        txt_zipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_zipcodeActionPerformed(evt);
            }
        });

        but_search.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_search.setText("ค้นหา");
        but_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_searchActionPerformed(evt);
            }
        });

        but_add_position.setBackground(new java.awt.Color(255, 255, 255));
        but_add_position.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_add_position.setForeground(new java.awt.Color(0, 102, 51));
        but_add_position.setText("เพิ่มข้อมูลที่อยู่ลูกค้า");
        but_add_position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_add_positionActionPerformed(evt);
            }
        });

        tb_position.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tb_position);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Zipcode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(but_search)
                        .addGap(130, 130, 130)
                        .addComponent(but_add_position)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Zipcode)
                    .addComponent(txt_zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_search)
                    .addComponent(but_add_position))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_zipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_zipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_zipcodeActionPerformed

    private void but_add_positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_add_positionActionPerformed
        this.dispose();
        PositionCreateJFrame obj = new PositionCreateJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_but_add_positionActionPerformed

    private void but_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_searchActionPerformed
        String name = txt_zipcode.getText();
        PositonModel model = new PositonModel();
        ResultSet result = model.select_search(name);
        tb_position.setModel(DbUtils.resultSetToTableModel(result));
    }//GEN-LAST:event_but_searchActionPerformed

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
    private javax.swing.JLabel Zipcode;
    private javax.swing.JButton but_add_position;
    private javax.swing.JButton but_customer;
    private javax.swing.JButton but_job;
    private javax.swing.JButton but_position;
    private javax.swing.JButton but_route;
    private javax.swing.JButton but_search;
    private javax.swing.JLabel data;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel path;
    private javax.swing.JTable tb_position;
    private javax.swing.JTextField txt_zipcode;
    // End of variables declaration//GEN-END:variables
}
