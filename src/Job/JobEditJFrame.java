package Job;

public class JobEditJFrame extends javax.swing.JFrame {

    public JobEditJFrame() {

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        path = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        but_save = new javax.swing.JButton();
        but_back = new javax.swing.JButton();
        add_position = new javax.swing.JLabel();
        but_delete = new javax.swing.JButton();
        ID_Route = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        ID_zip = new javax.swing.JLabel();
        txt_id_zip = new javax.swing.JTextField();
        but_search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        dis = new javax.swing.JLabel();
        txt_dis = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        path.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        path.setText("ระบบการวางแผนการขนส่งเพื่อหาเส้นทางที่สั้นที่สุด");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

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

        add_position.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        add_position.setText("แก้ไขข้อมูลรอบงาน");

        but_delete.setBackground(new java.awt.Color(255, 255, 255));
        but_delete.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_delete.setForeground(new java.awt.Color(255, 0, 0));
        but_delete.setText("Delete");
        but_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_deleteActionPerformed(evt);
            }
        });

        ID_Route.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        ID_Route.setText("รหัสเส้นทาง :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ID_zip.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        ID_zip.setText("รหัสไปรษณีย์ :");

        txt_id_zip.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        txt_id_zip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_zipActionPerformed(evt);
            }
        });

        but_search.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_search.setText("ค้นหา");
        but_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_searchActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ชื่อ - นามสกุล", "ที่อยู่", "เพิ่ม"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("jLabel1");

        dis.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        dis.setText("ระยะทางรวม(กิดลเมตร)  :");

        txt_dis.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(add_position))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(ID_Route)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(ID_zip)
                                .addGap(18, 18, 18)
                                .addComponent(txt_id_zip, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(but_search)
                                .addGap(106, 106, 106))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(but_save, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(but_delete)
                                        .addGap(14, 14, 14)
                                        .addComponent(but_back, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(dis)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(105, 105, 105)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(add_position)
                .addGap(51, 51, 51)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_save)
                    .addComponent(but_back)
                    .addComponent(but_delete))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
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

    private void but_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_searchActionPerformed

    }//GEN-LAST:event_but_searchActionPerformed

    private void txt_id_zipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_zipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_zipActionPerformed

    private void but_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_deleteActionPerformed

    }//GEN-LAST:event_but_deleteActionPerformed

    private void but_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_backActionPerformed
        this.dispose();
        JobIndextJFrame obj = new JobIndextJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_but_backActionPerformed

    private void but_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_but_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID_Route;
    private javax.swing.JLabel ID_zip;
    private javax.swing.JLabel add_position;
    private javax.swing.JButton but_back;
    private javax.swing.JButton but_delete;
    private javax.swing.JButton but_save;
    private javax.swing.JButton but_search;
    private javax.swing.JLabel dis;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel path;
    private javax.swing.JTextField txt_dis;
    private javax.swing.JTextField txt_id_zip;
    // End of variables declaration//GEN-END:variables
}
