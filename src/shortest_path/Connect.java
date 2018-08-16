/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortest_path;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nannii
 */
public class Connect {
    public Connection connect;
    
    public Connect() {
        try {
            // 1. โหลด Driver
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            // 2. สร้างการเชื่อมต่อ
            this.connect = DriverManager.getConnection ("jdbc:mysql://localhost:3306/path?useUnicode=true&characterEncoding=UTF-8","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }   
    
}
