package Job;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import shortest_path.Connect;

public class JobModel {

    public Connection connect;

    public JobModel() {
        Connect c = new Connect();
        this.connect = c.connect;
    }

    public ResultSet select() {
        String sql = "SELECT * FROM job ORDER BY ID_Job ASC";
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

    public ResultSet select_id(int id_job) {
        String sql = "SELECT * FROM job WHERE ID_Job = '" + id_job + "' ORDER BY ID_Job ASC ";
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

    public ResultSet select_search(int id_job) {
        String sql = "SELECT * FROM job WHERE ID_Job LIKE '%" + id_job + "%'";
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

    public void insert(String date, int distance_sum) {
        String sql = "INSERT INTO job"
                + "(Date,Distance_Sum)"
                + " VALUES('" + date + "', " + distance_sum + ")";
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JobModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(int date, int distance_sum, int id_job) {
        String sql = "UPDATE job"
                + "SET Date = " + date + ", Distance_Sum = " + distance_sum + " "
                + "WHER ID_Job =" + id_job;
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JobModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete(int id_job) {
        String sql = "DELETE FROM job WHERE ID_Job = " + id_job;
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JobModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
