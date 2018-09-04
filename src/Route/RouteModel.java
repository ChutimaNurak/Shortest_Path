package Route;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import shortest_path.Connect;

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

    public ResultSet select_id(int id_route) {
        String sql = "SELECT * FROM job WHERE ID_Job = '" + id_route + "' ORDER BY ID_Job ASC ";
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

    public void insert(int id_job,int id_pos, int seq, int dis ) {
        String sql = "INSERT INTO route"
                + "(ID_Job,ID_Position,Sequence,Distance)"
                + " VALUES(" + id_job + ", " + id_pos + ", " + seq + ", " + dis + ")";
        PreparedStatement ps;
        System.out.println(sql);
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RouteModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(int id_job,int id_pos, int seq, int dis, int id_route) {
        String sql = "UPDATE route"
                + "SET ID_Job = " + id_job + ", ID_Position = " + id_pos + ", Sequence = " + seq + ", Distance = " + dis + " "
                + "WHER ID_Job =" + id_route;
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RouteModel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public void delete(int id_route) {
        String sql = "DELETE FROM job WHERE ID_Job = " + id_route;
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RouteModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
