/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import com.databaseCon.DB;
//import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;

/**
 *
 * @author Danny
 */

public class Bal { // class use to execute sql request
    
    public void insertDataSignup(Bean beanObj){
        try{
            // create query for inserting signup data. "null" is for the primary key that is on auto-increment
            String query = "insert into admin values(null, ?, ?, ?)"; // i am using preparedStatement for insertion
            PreparedStatement ps = DB.con.prepareStatement(query); // access con form DB which we have made
            ps.setString(1, beanObj.getNom()); // get  name from bean which we have set likes getter  setter. we have set value throught constructor and now we are accessing that value here
            ps.setString(2, beanObj.getEmail());
            ps.setString(3, beanObj.getPassword());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "You have Signup successfully, now go ang login");
        } catch(Exception e ){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    
    
    // create method here which will check from admin table
    
    public boolean checkLogin(String Email, String Password){
        boolean b = false;
        try{
            // whit an unprepare query
            String query = "select Email, Password from admin where Email = '"+Email+"' AND Password = '"+Password+"'";
            Statement st = DB.con.createStatement();
            st.executeQuery(query);
            ResultSet rs = st.executeQuery(query);
            
            if (rs.next()) {
                b = true;
            } else{
                JOptionPane.showMessageDialog(null, "Invalid Email or Password, try again...");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
        
        return b;
    }
    
    
    
}
