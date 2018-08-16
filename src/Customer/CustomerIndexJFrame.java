package Customer;

import Job.JobIndexJFrame;
import Positon.PositonIndexJFrame;
import Route.RouteIndexJFrame;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class CustomerIndexJFrame extends javax.swing.JFrame {
    public CustomerIndexJFrame() {
        initComponents();
        showTable();
    }
    
    public void showTable(){
        CustomerModel model = new CustomerModel();
        ResultSet result = model.select();
        tb_customer.setModel(DbUtils.resultSetToTableModel(result));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        but_job = new javax.swing.JButton();
        but_position = new javax.swing.JButton();
        but_customer = new javax.swing.JButton();
        but_route = new javax.swing.JButton();
        path = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        data = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        but_search = new javax.swing.JButton();
        but_add_customer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_customer = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        path.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        path.setText("ระบบการวางแผนการขนส่งเพื่อหาเส้นทางที่สั้นที่สุด");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(but_route, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_customer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_position, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_job, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_route, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_customer)
                    .addComponent(but_position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        data.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        data.setText("รายละเอียดข้อมูลลูกค้า");

        name.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        name.setText("ชื่อ - นามสกุล: ");

        txt_name.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        but_search.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_search.setText("ค้นหา");
        but_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_searchActionPerformed(evt);
            }
        });

        but_add_customer.setBackground(new java.awt.Color(255, 255, 255));
        but_add_customer.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_add_customer.setForeground(new java.awt.Color(0, 102, 51));
        but_add_customer.setText("เพิ่มข้อมูลลูกค้า");
        but_add_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_add_customerActionPerformed(evt);
            }
        });

        tb_customer.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tb_customer);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(but_search)
                        .addGap(130, 130, 130)
                        .addComponent(but_add_customer))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_search)
                    .addComponent(but_add_customer))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
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

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void but_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_searchActionPerformed
        String name = txt_name.getText();
        CustomerModel model = new CustomerModel();
        ResultSet result = model.select_search(name);
        tb_customer.setModel(DbUtils.resultSetToTableModel(result));
    }//GEN-LAST:event_but_searchActionPerformed

    private void but_add_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_add_customerActionPerformed
        this.dispose();
        CustomerCreateJFram obj = new CustomerCreateJFram();
        obj.setVisible(true);
    }//GEN-LAST:event_but_add_customerActionPerformed

    private void but_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_jobActionPerformed
        this.dispose();
        JobIndexJFrame obj = new JobIndexJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_but_jobActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_add_customer;
    private javax.swing.JButton but_customer;
    private javax.swing.JButton but_job;
    private javax.swing.JButton but_position;
    private javax.swing.JButton but_route;
    private javax.swing.JButton but_search;
    private javax.swing.JLabel data;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel path;
    private javax.swing.JTable tb_customer;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
