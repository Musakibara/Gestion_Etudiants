/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.databaseCon;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Danny
 */
public class DB {
    
    public static Connection con = null; // when is static means we can use it 
    
    // method to connect to database using xammpp
    public static void loadConnection() {
        String url = "jdbc:mysql://localhost:3306/javacrud_db";
        String root = "root";
        String pass = "";
        
        
        try {
            con = DriverManager.getConnection(url, root, pass);
            
            if (con != null){
                JOptionPane.showMessageDialog(null, "Database has been Successfully connected...");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error in Database loading "+e);
        } 
    }
}
