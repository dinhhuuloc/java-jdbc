/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dhloc
 */
public class JDBCmssql {
    public static Connection getConnection(){
        Connection c = null;
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            String url = "jdbc:sqlserver://localhost:1433;database=ontap;encrypt=true;trustServerCertificate=true;";
            c = DriverManager.getConnection(url, "sa", "sa");
        } catch (SQLException ex) {
            Logger.getLogger(JDBCmssql.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;
    }
}
