/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database;

import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author dhloc
 */
public class JDBCmysql {

    public static Connection getConnection() {
        Connection c = null;

        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String url = "jdbc:mysql://localhost:3306/ontap";
            c = DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(JDBCmysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public static void closeConnection(Connection c) {
        if (c != null) {
            try {
                c.close();
            } catch (SQLException ex) {
                Logger.getLogger(JDBCmysql.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void printInfoConnection(Connection c){
        if(c != null){
            try {
                DatabaseMetaData dm = c.getMetaData();
                System.out.println(dm.getUserName());
                System.out.println(dm.getDatabaseProductName());
                System.out.println(dm.getDatabaseProductVersion());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCmysql.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
