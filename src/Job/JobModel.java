/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Job;

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
public class JobModel {
public Connection connect;

    public JobModel() {
        Connect c = new Connect();
        this.connect = c.connect;
    }
    
   public ResultSet select() {
        String sql = "SELECT * FROM job ORDER BY ID_Job ASC";
        // 3. สร้างออบเจ็กต์ Statement พร้อมกับเตรียมส่งคำสั่ง SQL
           PreparedStatement ps;
            ResultSet result = null;
        try {
            ps = this.connect.prepareStatement(sql);
            // 4.ส่งคำสั่งไปประมวลผล
            result = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(JobModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public ResultSet select_id() {
        String sql = "SELECT * FROM job WHERE ID_Job = 1 ORDER BY ID_Job ASC ";
            PreparedStatement ps;
            ResultSet result = null;
        try {
            ps = this.connect.prepareStatement(sql);
            result = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(JobModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public ResultSet select_search(String id_job) {
        String sql = "SELECT * FROM job WHERE ID_Job LIKE '%" + id_job + "%'";
        //System.out.println(sql);
            PreparedStatement ps;
            ResultSet result = null;
        try {
            ps = this.connect.prepareStatement(sql);
            result = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(JobModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public void insert() {
        String sql = "INSERT INTO job"
                + "(Date)"
                + " VALUES(?)";
        PreparedStatement ps;
        System.out.println(sql);
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("บันทึกข้อมูลเรียบร้อย");
        } catch (SQLException ex) {
            Logger.getLogger(JobModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update() {
        String sql = "UPDATE job"
                + "SET Date = ?"
                + "WHER ID_Job = ?";
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JobModel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public void delete() {
        String sql = "DELETE * FROM job WHERE ID_Job = ?";
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JobModel.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}