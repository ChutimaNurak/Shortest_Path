package Job;

import Customer.CustomerIndexJFrame;
import Positon.PositonIndexJFrame;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class JobIndextJFrame extends javax.swing.JFrame {

    public JobIndextJFrame() {
        initComponents();
        showTable();
    }

    public void showTable() {
        JobModel model = new JobModel();
        ResultSet result = model.select();
        tb_job.setModel(DbUtils.resultSetToTableModel(result));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        path = new javax.swing.JLabel();
        but_job = new javax.swing.JButton();
        but_customer = new javax.swing.JButton();
        but_position = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        data = new javax.swing.JLabel();
        ID_Job = new javax.swing.JLabel();
        txt_job = new javax.swing.JTextField();
        but_search = new javax.swing.JButton();
        but_add_job = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_job = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        path.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        path.setText("ระบบการวางแผนการขนส่งเพื่อหาเส้นทางที่สั้นที่สุด");

        but_job.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_job.setText("หน้าหลัก");
        but_job.setMaximumSize(new java.awt.Dimension(87, 23));
        but_job.setMinimumSize(new java.awt.Dimension(87, 23));
        but_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_jobActionPerformed(evt);
            }
        });

        but_customer.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_customer.setText("ข้อมูลลูกค้า");
        but_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_customerActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(but_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_customer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_position, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_customer)
                    .addComponent(but_position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        data.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        data.setText("รายละเอียดข้อมูลรอบงาน");

        ID_Job.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        ID_Job.setText("ปี-เดือน-วัน :");

        txt_job.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        txt_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jobActionPerformed(evt);
            }
        });

        but_search.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_search.setText("ค้นหา");
        but_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_searchActionPerformed(evt);
            }
        });

        but_add_job.setBackground(new java.awt.Color(255, 255, 255));
        but_add_job.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_add_job.setForeground(new java.awt.Color(0, 102, 51));
        but_add_job.setText("เพิ่มรอบงาน");
        but_add_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_add_jobActionPerformed(evt);
            }
        });

        tb_job.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_job.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_jobMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_job);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(ID_Job)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_job, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(but_search)
                        .addGap(130, 130, 130)
                        .addComponent(but_add_job))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(data)
                .addGap(294, 294, 294))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_Job)
                    .addComponent(txt_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_search)
                    .addComponent(but_add_job))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
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

    private void but_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_jobActionPerformed
        JobIndextJFrame index = new JobIndextJFrame();
        index.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_but_jobActionPerformed

    private void but_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_customerActionPerformed
        CustomerIndexJFrame index = new CustomerIndexJFrame();
        index.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_but_customerActionPerformed

    private void but_positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_positionActionPerformed
        PositonIndexJFrame index = new PositonIndexJFrame();
        index.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_but_positionActionPerformed

    private void txt_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jobActionPerformed

    private void but_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_searchActionPerformed
        String date =txt_job.getText();
        JobModel mode1 = new JobModel();
        ResultSet result = mode1.select_search(date);
        tb_job.setModel(DbUtils.resultSetToTableModel(result));
        txt_job.setText("");
    }//GEN-LAST:event_but_searchActionPerformed

    private void but_add_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_add_jobActionPerformed
        this.dispose();
        JobCreateJFrame obj = new JobCreateJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_but_add_jobActionPerformed

    private void tb_jobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_jobMouseClicked

       
    }//GEN-LAST:event_tb_jobMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID_Job;
    private javax.swing.JButton but_add_job;
    private javax.swing.JButton but_customer;
    private javax.swing.JButton but_job;
    private javax.swing.JButton but_position;
    private javax.swing.JButton but_search;
    private javax.swing.JLabel data;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel path;
    private javax.swing.JTable tb_job;
    private javax.swing.JTextField txt_job;
    // End of variables declaration//GEN-END:variables
}
