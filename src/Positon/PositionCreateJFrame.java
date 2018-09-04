package Positon;

import Customer.CustomerModel;
import java.sql.ResultSet;

public class PositionCreateJFrame extends javax.swing.JFrame {

        public PositionCreateJFrame() {
        initComponents();
        ComboBox(); 
    }
        
    PositionCreateJFrame(String selectId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    private void ComboBox() {
        try {
        CustomerModel m_customer = new CustomerModel();
        ResultSet res =  m_customer.select();
        while(res.next()) {
        //System.out.println("res"+res);
        String name = res.getString("Name");
        String ID = res.getString("ID");
        this.txt_ID.addItem(name);
        
        String value = this.txt_ID.getSelectedItem().toString();
        //System.out.println("value"+value);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        add_position = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        txt_ID = new javax.swing.JComboBox<>();
        House = new javax.swing.JLabel();
        txt_house = new javax.swing.JTextField();
        Village = new javax.swing.JLabel();
        txt_village = new javax.swing.JTextField();
        District = new javax.swing.JLabel();
        txt_district = new javax.swing.JTextField();
        County = new javax.swing.JLabel();
        txt_county = new javax.swing.JTextField();
        Province = new javax.swing.JLabel();
        txt_province = new javax.swing.JTextField();
        Zipcode = new javax.swing.JLabel();
        txt_zipcode = new javax.swing.JTextField();
        txt_latitude = new javax.swing.JTextField();
        txt_longitude = new javax.swing.JTextField();
        googlemap = new javax.swing.JButton();
        but_save = new javax.swing.JButton();
        but_back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        path = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        add_position.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        add_position.setText("เพิ่มข้อมูลที่อยู่ลูกค้า ");

        ID.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        ID.setText("  รหัสลูกค้า : ");

        txt_ID.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });

        House.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        House.setText(" บ้านเลขที่ :");

        txt_house.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        txt_house.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_houseActionPerformed(evt);
            }
        });

        Village.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        Village.setText("          หมู่ :");

        txt_village.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        txt_village.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_villageActionPerformed(evt);
            }
        });

        District.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        District.setText("        ตำบล :");

        txt_district.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N

        County.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        County.setText("      อำเภอ :");

        txt_county.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N

        Province.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        Province.setText("     จังหวัด :");

        txt_province.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        txt_province.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_provinceActionPerformed(evt);
            }
        });

        Zipcode.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        Zipcode.setText("     รหัสไปรษณีย์ :");

        txt_zipcode.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        txt_zipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_zipcodeActionPerformed(evt);
            }
        });

        txt_latitude.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N

        txt_longitude.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N

        googlemap.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        googlemap.setForeground(new java.awt.Color(102, 0, 102));
        googlemap.setText("Google Map");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(but_save, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(but_back, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(209, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_latitude, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_longitude, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(District)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_district, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Village)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_village, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(House)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_house, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Zipcode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(ID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(add_position)
                                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(County)
                                        .addGap(0, 0, 0))
                                    .addComponent(Province, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_province, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_county, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(googlemap)
                .addGap(199, 199, 199))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(add_position)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID)
                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(House)
                    .addComponent(txt_house, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Village)
                    .addComponent(txt_village, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(District)
                    .addComponent(txt_district, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Province)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_county, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(County))
                        .addGap(7, 7, 7)
                        .addComponent(txt_province, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Zipcode)
                    .addComponent(txt_zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_longitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_latitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(googlemap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_save)
                    .addComponent(but_back))
                .addGap(0, 164, Short.MAX_VALUE))
        );

        path.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        path.setText("ระบบการวางแผนการขนส่งเพื่อหาเส้นทางที่สั้นที่สุด");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void but_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_backActionPerformed
        this.dispose();
        PositonIndexJFrame obj = new PositonIndexJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_but_backActionPerformed

    private void but_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_saveActionPerformed

        String house = this.txt_house.getText();
        String village = this.txt_village.getText();
        String district = this.txt_district.getText();
        String county = this.txt_county.getText();
        String province = this.txt_province.getText();
        String zip = this.txt_zipcode.getText();
        String la = this.txt_latitude.getText();
        String lon = this.txt_longitude.getText();
        String name_user = this.txt_ID.getSelectedItem().toString();
        String ID = "";
        CustomerModel m_customer = new CustomerModel();
        try {
            ResultSet res =  m_customer.select_search(name_user);
            while(res.next()) {
                ID = res.getString("ID");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println("ID" + ID);
        int id = Integer.parseInt(ID);
        PositonModel model = new PositonModel();
        model.insert(id,house, village, district, county, province, zip, la, lon);

        PositonIndexJFrame obj = new PositonIndexJFrame();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_but_saveActionPerformed

    private void txt_zipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_zipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_zipcodeActionPerformed

    private void txt_provinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_provinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_provinceActionPerformed

    private void txt_villageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_villageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_villageActionPerformed

    private void txt_houseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_houseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_houseActionPerformed

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel County;
    private javax.swing.JLabel District;
    private javax.swing.JLabel House;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Province;
    private javax.swing.JLabel Village;
    private javax.swing.JLabel Zipcode;
    private javax.swing.JLabel add_position;
    private javax.swing.JButton but_back;
    private javax.swing.JButton but_save;
    private javax.swing.JButton googlemap;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel path;
    private javax.swing.JComboBox<String> txt_ID;
    private javax.swing.JTextField txt_county;
    private javax.swing.JTextField txt_district;
    private javax.swing.JTextField txt_house;
    private javax.swing.JTextField txt_latitude;
    private javax.swing.JTextField txt_longitude;
    private javax.swing.JTextField txt_province;
    private javax.swing.JTextField txt_village;
    private javax.swing.JTextField txt_zipcode;
    // End of variables declaration//GEN-END:variables
}
