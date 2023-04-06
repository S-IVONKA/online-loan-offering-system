/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/////////////////////////Database Connection Code is here/////////////////////////

package loanmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author user
 */
public class db {

    private static Connection c;

    private static void setUpConnection() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/loan", "root", "");
    }

    public static void iud(String sql) throws Exception {
        if (c == null) {
            setUpConnection();
        }
        c.createStatement().executeUpdate(sql);
    }

    public static ResultSet search(String sql) throws Exception {
        if (c == null) {
            setUpConnection();
        }
        return c.createStatement().executeQuery(sql);
    }

    public static Connection getDBCon() throws Exception {
        if (c == null) {
            setUpConnection();
        }
        return c;
    }
}


















