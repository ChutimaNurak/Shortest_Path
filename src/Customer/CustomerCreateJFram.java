package Customer;

public class CustomerCreateJFram extends javax.swing.JFrame {

    public CustomerCreateJFram() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        path = new javax.swing.JLabel();
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(but_save, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(but_back, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(telephone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(name)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(email)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(add_position)
                        .addGap(319, 319, 319))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_position)
                .addGap(18, 18, 18)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_save)
                    .addComponent(but_back))
                .addContainerGap(286, Short.MAX_VALUE))
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
        //ปุ่ม save

        //กำหนดค่าตัวแปร
        String name = this.txt_name.getText();
        String telephone = this.txt_telephone.getText();
        String email = this.txt_email.getText();

        //สร้าง model ใหม่
        CustomerModel model = new CustomerModel();
        //เรียกใช้ฟังชั่น insert
        model.insert(name, telephone, email);

        //ไปหน้า Indext
        this.dispose();
        CustomerIndexJFrame obj = new CustomerIndexJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_but_saveActionPerformed

    private void but_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_backActionPerformed
        //ไปหน้า Indext
        this.dispose();
        CustomerIndexJFrame obj = new CustomerIndexJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_but_backActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_position;
    private javax.swing.JButton but_back;
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
