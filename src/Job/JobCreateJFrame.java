package Job;

import Positon.PositonModel;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class JobCreateJFrame extends javax.swing.JFrame {

     public JobCreateJFrame() {
        initComponents();
        showTable();
    }

    public void showTable() {
        PositonModel model = new PositonModel();
        ResultSet result = model.selectnameByIdposition();
        tb_job.setModel(DbUtils.resultSetToTableModel(result));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        path = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        add_position = new javax.swing.JLabel();
        ID_Route = new javax.swing.JLabel();
        dis = new javax.swing.JLabel();
        txt_dis = new javax.swing.JTextField();
        but_save = new javax.swing.JButton();
        but_back = new javax.swing.JButton();
        txt_id_zip = new javax.swing.JTextField();
        ID_zip = new javax.swing.JLabel();
        but_search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_job = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        path.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        path.setText("ระบบการวางแผนการขนส่งเพื่อหาเส้นทางที่สั้นที่สุด");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        add_position.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        add_position.setText("เพิ่มข้อมูลรอบงาน");

        ID_Route.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        ID_Route.setText("รหัสเส้นทาง :");

        dis.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        dis.setText("ระยะทางรวม(กิดลเมตร)  :");

        txt_dis.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N

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

        txt_id_zip.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        txt_id_zip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_zipActionPerformed(evt);
            }
        });

        ID_zip.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        ID_zip.setText("รหัสไปรษณีย์ :");

        but_search.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_search.setText("ค้นหา");
        but_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_searchActionPerformed(evt);
            }
        });

        tb_job.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_job);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("jLabel1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(add_position)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ID_Route)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ID_zip)
                        .addGap(18, 18, 18)
                        .addComponent(txt_id_zip, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(but_search)
                        .addGap(228, 228, 228))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(dis)
                        .addGap(18, 18, 18)
                        .addComponent(txt_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(but_save, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(but_back, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_position)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_Route)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_search)
                    .addComponent(txt_id_zip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID_zip))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dis)
                    .addComponent(txt_dis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_save)
                    .addComponent(but_back))
                .addContainerGap(30, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_saveActionPerformed

    }//GEN-LAST:event_but_saveActionPerformed

    private void but_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_backActionPerformed
        this.dispose();
        JobIndextJFrame obj = new JobIndextJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_but_backActionPerformed

    private void txt_id_zipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_zipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_zipActionPerformed

    private void but_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_searchActionPerformed
        String zip = txt_id_zip.getText();
        PositonModel mode1 = new PositonModel();
        ResultSet result = mode1.select_search(zip);
        txt_id_zip.setModel(DbUtils.resultSetToTableModel(result));
        txt_id_zip.setText("");
        
    }//GEN-LAST:event_but_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID_Route;
    private javax.swing.JLabel ID_zip;
    private javax.swing.JLabel add_position;
    private javax.swing.JButton but_back;
    private javax.swing.JButton but_save;
    private javax.swing.JButton but_search;
    private javax.swing.JLabel dis;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel path;
    private javax.swing.JTable tb_job;
    private javax.swing.JTextField txt_dis;
    private javax.swing.JTextField txt_id_zip;
    // End of variables declaration//GEN-END:variables
}
