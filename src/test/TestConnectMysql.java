/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import database.JDBCmysql;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dhloc
 */
public class TestConnectMysql {

    public static void main(String[] args) {
        try {
            Connection c = JDBCmysql.getConnection();
            System.out.println(c);
            System.out.println(c.isClosed());
            
            JDBCmysql.closeConnection(c);
            System.out.println(c.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(TestConnectMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
