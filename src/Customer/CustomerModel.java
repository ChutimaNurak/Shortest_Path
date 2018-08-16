/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import shortest_path.Connect;

/**
 *
 * @author Nannii
 */
public class CustomerModel {

    public Connection connect;

    public CustomerModel() {
        Connect c = new Connect();
        this.connect = c.connect;
    }

    //ดีกข้อมูลจากฐานข้อมูลมาแสดงในโปรแกรม
    public ResultSet select() {
        String sql = "SELECT * FROM customer ORDER BY ID ASC";
        // 3. สร้างออบเจ็กต์ Statement พร้อมกับเตรียมส่งคำสั่ง SQL
           PreparedStatement ps;
            ResultSet result = null;
        try {
            ps = this.connect.prepareStatement(sql);
            // 4.ส่งคำสั่งไปประมวลผล
            result = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public ResultSet select_id(int id) {
        String sql = "SELECT * FROM customer WHERE ID = " +id+" ORDER BY ID ASC ";
            PreparedStatement ps;
            ResultSet result = null;
        try {
            ps = this.connect.prepareStatement(sql);
            result = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public ResultSet select_search(String name) {
        String sql = "SELECT * FROM customer WHERE Name LIKE '%" + name + "%'";
        //System.out.println(sql);
            PreparedStatement ps;
            ResultSet result = null;
        try {
            ps = this.connect.prepareStatement(sql);
            result = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public void insert(String name, String telephone, String email) {
        String sql = "INSERT INTO customer"
                + "(Name,Telephone,Email)"
                + " VALUES('"+name+"','"+telephone+"','"+email+"')";
        PreparedStatement ps;
        System.out.println(sql);
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
            //System.out.println("บันทึกข้อมูลเรียบร้อย");
            //JOptionPane.showMessageDialog(this, "บันทึก" , "บันทึกเรียยร้อย" , JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(String name, String telephone, String email, int id) {
        String sql = "UPDATE customer"
                + "SET Name = 'name', Telephone = 'telephone', Email = 'email'"
                + "WHER ID = id";
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public void delete(int ID) {
        String sql = "DELETE * FROM customer WHERE ID = id";
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
