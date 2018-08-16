/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Positon;

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
public class PositonModel {
   public Connection connect;

    public PositonModel() {
        Connect c = new Connect();
        this.connect = c.connect;
    }
    
   public ResultSet select() {
        String sql = "SELECT * FROM position ORDER BY ID_Position ASC";
        // 3. สร้างออบเจ็กต์ Statement พร้อมกับเตรียมส่งคำสั่ง SQL
           PreparedStatement ps;
            ResultSet result = null;
        try {
            ps = this.connect.prepareStatement(sql);
            // 4.ส่งคำสั่งไปประมวลผล
            result = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(PositonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public ResultSet select_id() {
        String sql = "SELECT * FROM position WHERE ID_Position = 1 ORDER BY ID_Position ASC ";
            PreparedStatement ps;
            ResultSet result = null;
        try {
            ps = this.connect.prepareStatement(sql);
            result = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(PositonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public ResultSet select_search(String zip_code) {
        String sql = "SELECT * FROM position WHERE Zip_code LIKE '%" + zip_code + "%'";
        //System.out.println(sql);
            PreparedStatement ps;
            ResultSet result = null;
        try {
            ps = this.connect.prepareStatement(sql);
            result = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(PositonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public void insert() {
        String sql = "INSERT INTO position"
                + "(House_number,Village,District,County,Province,Zip_code,Latitude,Longitude)"
                + " VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement ps;
        System.out.println(sql);
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("บันทึกข้อมูลเรียบร้อย");
        } catch (SQLException ex) {
            Logger.getLogger(PositonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update() {
        String sql = "UPDATE position"
                + "SET House_number = ?, Village = ?, District =?, County = ?, Province =?, Zip_code = ?, Latitude =?, Longitude = ?"
                + "WHER ID_Position = ?";
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PositonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public void delete() {
        String sql = "DELETE * FROM position WHERE ID_Position = ?";
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PositonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}