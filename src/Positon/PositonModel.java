package Positon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import shortest_path.Connect;

public class PositonModel {

    public Connection connect;

    public PositonModel() {
        Connect c = new Connect();
        this.connect = c.connect;
    }
//
    public ResultSet select() {
        String sql = "SELECT * FROM position ORDER BY ID_Position ASC";
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
    
    //
    public ResultSet selectnameByIdposition(int id_pos) {
        String sql = "SELECT customer.ID,customer.Name FROM position INNER JOIN customer ON position.ID = customer.ID WHERE position.ID = " +id_pos;
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
    
    //
    public ResultSet select_id(int id_pos) {
        String sql = "SELECT * FROM position WHERE ID_Position = '" + id_pos + "' ORDER BY ID_Position ASC ";
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
    
// รหัสไปรษณี
    public ResultSet select_search(String zip_code) {
        String sql = "SELECT * FROM position WHERE Zip_code LIKE '%" + zip_code + "%'";
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
    
// ชื่อลูกค้า
    public ResultSet select_searchname(String name) {
        String sql = "SELECT customer.ID FROM position INNER JOIN customer ON position.ID = customer.ID WHERE customer.Name LIKE '%" + name + "%'";
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
    
    //
    public void insert(int id,String house, String village, String district, String county, String province, String zip, String la, String lon) {
        String sql = "INSERT INTO position (ID,House_number, Village, District, County, Province, Zip_code, Latitude, Longitude)"
                + "VALUES("+id+",'" + house + "','" + village + "','" + district + "','" + county + "','" + province + "','" + zip + "','" + la + "','" + lon + "')";
                
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PositonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //
    public void update(int id,String house, String village, String district, String county, String province, String zip, String la, String lon, int id_pos) {
        String sql = "UPDATE position "
                + "SET ID = " + id + ", House_number = '" + house + "',Village = '" +village+"',District = '" + district + "', County = '" + county + "',Province = '" + province + "',Zip_code = '" + zip + "',Latitude = '" +la + "',Longitude = '" + lon +"' "
                + "WHERE ID_position =" +id_pos;

        //System.out.println(sql);
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PositonModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //
    public void delete(int id_pos) {
        String sql = "DELETE FROM position WHERE ID_Position = " + id_pos;
        PreparedStatement ps;
        try {
            ps = this.connect.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PositonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //
    public ResultSet selectnameById(int id) {
        String sql = "SELECT ID,Name,House_number,Village,District,County,Province,Zip_code "
                + "FROM position INNER JOIN customer ON position.ID = customer.ID "
                + "WHERE ID = " +id;
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
}
