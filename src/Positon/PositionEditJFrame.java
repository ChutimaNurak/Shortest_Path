package Positon;

import Customer.CustomerModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PositionEditJFrame extends javax.swing.JFrame {

    int id_position;
    int iduser_position;

    public PositionEditJFrame(String id_index, String iduser_index) {
        initComponents();
        this.id_position = Integer.parseInt(id_index);
        this.iduser_position = Integer.parseInt(iduser_index);
        int id_edit = Integer.parseInt(id_index);
        int iduser_edit = Integer.parseInt(iduser_index);
        setText(id_edit);
        ComboBox(iduser_edit);
    }

    private void ComboBox(int id_user) {
        //System.out.println("Id combo Edit " + id_user);
        try {
            CustomerModel m_customer = new CustomerModel();
            ResultSet res = m_customer.select_id(id_user);
            while (res.next()) {

                String name = res.getString("Name");
                //System.out.println("Name Edit" + name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // setText
    public void setText(int Id) {
        try {
            PositonModel model = new PositonModel();

            //System.out.println("Id in Function " +Id);
            ResultSet res = model.select_id(Id);

            while (res.next()) {
                String house = res.getString("House_number");
                String village = res.getString("Village");
                String district = res.getString("District");
                String county = res.getString("County");
                String province = res.getString("Province");
                String zip = res.getString("Zip_code");
                String la = res.getString("Latitude");
                String lon = res.getString("Longitude");
                int id_edit = Integer.parseInt(res.getString("ID"));
                String name_edit = "";
                try {
                    ResultSet res_name = model.selectnameByIdposition(id_edit);
                    while (res_name.next()) {
                        name_edit = res_name.getString("Name");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                txt_house.setText(house);
                txt_village.setText(village);
                txt_district.setText(district);
                txt_county.setText(county);
                txt_province.setText(province);
                txt_zipcode.setText(zip);
                txt_latitude.setText(la);
                txt_longitude.setText(lon);
                txt_ID.setText(name_edit);
                txt_name.setText(Integer.toString(id_edit));
                txt_name.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PositionEditJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        path = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ID = new javax.swing.JLabel();
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
        txt_longitude = new javax.swing.JTextField();
        txt_latitude = new javax.swing.JTextField();
        but_save = new javax.swing.JButton();
        googlemap = new javax.swing.JButton();
        but_back = new javax.swing.JButton();
        but_delete = new javax.swing.JButton();
        add_position = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        path.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        path.setText("ระบบการวางแผนการขนส่งเพื่อหาเส้นทางที่สั้นที่สุด");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 1271, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );

        ID.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        ID.setText("  รหัสลูกค้า : ");

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

        txt_longitude.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N

        txt_latitude.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N

        but_save.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_save.setText("Save");
        but_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_saveActionPerformed(evt);
            }
        });

        googlemap.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        googlemap.setForeground(new java.awt.Color(102, 0, 102));
        googlemap.setText("Google Map");

        but_back.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_back.setText("Back");
        but_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_backActionPerformed(evt);
            }
        });

        but_delete.setBackground(new java.awt.Color(255, 255, 255));
        but_delete.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_delete.setForeground(new java.awt.Color(255, 0, 0));
        but_delete.setText("Delete");
        but_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_deleteActionPerformed(evt);
            }
        });

        add_position.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        add_position.setText("เพิ่มข้อมูลที่อยู่ลูกค้า ");

        txt_ID.setToolTipText("");
        txt_ID.setEnabled(false);

        txt_name.setToolTipText("");
        txt_name.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(but_save, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(but_delete)
                                .addGap(18, 18, 18)
                                .addComponent(but_back, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(txt_latitude, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_longitude, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(County)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_county, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(Province)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_province, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(txt_zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(googlemap))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(ID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(add_position)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_position)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_ID)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(County)
                    .addComponent(txt_county, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Province)
                    .addComponent(txt_province, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Zipcode)
                    .addComponent(txt_zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_longitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_latitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(googlemap))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_delete)
                    .addComponent(but_save)
                    .addComponent(but_back))
                .addContainerGap(125, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_houseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_houseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_houseActionPerformed

    private void txt_villageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_villageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_villageActionPerformed

    private void txt_provinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_provinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_provinceActionPerformed

    private void txt_zipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_zipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_zipcodeActionPerformed

    private void but_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_backActionPerformed
        this.dispose();
        PositonIndexJFrame obj = new PositonIndexJFrame();
        obj.setVisible(true);
    }//GEN-LAST:event_but_backActionPerformed

    private void but_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_saveActionPerformed
        int id_update = this.id_position;
        String house = this.txt_house.getText();
        String village = this.txt_village.getText();
        String district = this.txt_district.getText();
        String county = this.txt_county.getText();
        String province = this.txt_province.getText();
        String zip = this.txt_zipcode.getText();
        String la = this.txt_latitude.getText();
        String lon = this.txt_longitude.getText();
        String x_id = this.txt_name.getText();
        //System.out.println("id Edit " + x_id);
        
        int id = Integer.parseInt(x_id);
        PositonModel model = new PositonModel();
        model.update(id, house, village, district, county, province, zip, la, lon, id_update);
        
        PositonIndexJFrame obj = new PositonIndexJFrame();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_but_saveActionPerformed

    private void but_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_deleteActionPerformed
        PositonModel model = new PositonModel();
        int id_delete = this.id_position;
        //System.out.println("id " + id_delete);
        model.delete(id_position);

        this.dispose();
        PositonIndexJFrame obj = new PositonIndexJFrame();
        obj.setVisible(true);

    }//GEN-LAST:event_but_deleteActionPerformed

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
    private javax.swing.JButton but_delete;
    private javax.swing.JButton but_save;
    private javax.swing.JButton googlemap;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel path;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_county;
    private javax.swing.JTextField txt_district;
    private javax.swing.JTextField txt_house;
    private javax.swing.JTextField txt_latitude;
    private javax.swing.JTextField txt_longitude;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_province;
    private javax.swing.JTextField txt_village;
    private javax.swing.JTextField txt_zipcode;
    // End of variables declaration//GEN-END:variables

}
