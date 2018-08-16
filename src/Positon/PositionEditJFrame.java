/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Positon;

import Customer.CustomerIndexJFrame;
import Job.JobIndexJFrame;
import Route.RouteIndexJFrame;

/**
 *
 * @author Nannii
 */
public class PositionEditJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PositionEditJFrame
     */
    public PositionEditJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        path = new javax.swing.JLabel();
        but_job = new javax.swing.JButton();
        but_position = new javax.swing.JButton();
        but_customer = new javax.swing.JButton();
        but_route = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
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
        txt_longitude = new javax.swing.JTextField();
        txt_latitude = new javax.swing.JTextField();
        but_save = new javax.swing.JButton();
        googlemap = new javax.swing.JButton();
        but_back = new javax.swing.JButton();
        but_delete = new javax.swing.JButton();
        add_position = new javax.swing.JLabel();

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
            .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(but_route, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_customer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_position, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_job, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_route, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_customer)
                    .addComponent(but_position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        ID.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        ID.setText("  รหัสลูกค้า : ");

        txt_ID.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        txt_ID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        txt_longitude.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N

        txt_latitude.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N

        but_save.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        but_save.setText("Save");

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

        add_position.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        add_position.setText("เพิ่มข้อมูลที่อยู่ลูกค้า ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(but_back, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(358, 358, 358))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(but_save, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(but_delete))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
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
                                .addComponent(txt_zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(ID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(googlemap))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(add_position)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_position)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
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
                    .addComponent(but_save))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(but_back)
                .addGap(35, 35, 35))
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
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDActionPerformed

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
        // TODO add your handling code here:
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
    private javax.swing.JLabel County;
    private javax.swing.JLabel District;
    private javax.swing.JLabel House;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Province;
    private javax.swing.JLabel Village;
    private javax.swing.JLabel Zipcode;
    private javax.swing.JLabel add_position;
    private javax.swing.JButton but_back;
    private javax.swing.JButton but_customer;
    private javax.swing.JButton but_delete;
    private javax.swing.JButton but_job;
    private javax.swing.JButton but_position;
    private javax.swing.JButton but_route;
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
