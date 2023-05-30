/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import database.JDBCmssql;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dhloc
 */
public class TestConnectMssql {

    public static void main(String[] args) {
        try {
            Connection c = JDBCmssql.getConnection();
            System.out.println(c);
            System.out.println(c.isClosed());
            
            c.close();
            System.out.println(c.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(TestConnectMssql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
