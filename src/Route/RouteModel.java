/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Route;

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
public class RouteModel {
public Connection connect;

    public RouteModel() {
        Connect c = new Connect();
        this.connect = c.connect;
    }
    
   public ResultSet select() {
        String sql = "SELECT * FROM route ORDER BY ID_Route ASC";
        // 3. สร้างออบเจ็กต์ Statement พร้อมกับเตรียมส่งคำสั่ง SQL
           PreparedStatement ps;
            ResultSet result = null;
        try {
            ps = this.connect.prepareStatement(sql);
            // 4.ส่งคำสั่งไปประมวลผล
            result = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(RouteModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public ResultSet select_id() {
        String sql = "SELECT * FROM route WHERE ID_Route = 1 ORDER BY ID_Route ASC ";
            PreparedStatement ps;
            ResultSet result = null;
        try {
            ps = this.connect.prepareStatement(sql);
            result = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(RouteModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public ResultSet select_search(int id_route) {
        String sql = "SELECT * FROM route WHERE ID_Route LIKE '%" + id_route + "%'";
        //System.out.println(sql);
            PreparedStatement ps;
            ResultSet result = null;
        try {
            ps = this.connect.prepareStatement(sql);
            result = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(RouteModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public void insert() {
        String sql = "INSERT INTO route"
                + "(ID_Job,Sequence,Distance,ID_Position)"
                + " VALUES(?,?,?,?)";
        PreparedStatement ps;
        System.out.println(sql);
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("บันทึกข้อมูลเรียบร้อย");
        } catch (SQLException ex) {
            Logger.getLogger(RouteModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update() {
        String sql = "UPDATE route"
                + "SET ID_Job = ?, Sequence = ?, District =?, Distance = ?, ID_Position =?"
                + "WHER ID_Route = ?";
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RouteModel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public void delete() {
        String sql = "DELETE * FROM route WHERE ID_Route = ?";
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RouteModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
