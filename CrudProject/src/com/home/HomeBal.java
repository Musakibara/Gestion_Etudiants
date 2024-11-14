/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import com.databaseCon.DB;
import java.util.List;
//import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Danny
 */
public class HomeBal {
    
    //create method to read informations from Etudiant
    
    public List<HomeBean> loadData(){
        List<HomeBean> list = new ArrayList<HomeBean>();
        
        try{
            // make querry select data from Etudiant...
            String query = "select * from etudiant";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                int id = rs.getInt("id");
                String Nom = rs.getString("Nom");
                String Prenom = rs.getString("Prenom");
                String Specialite = rs.getString("Specialite");
                String Filiaire = rs.getString("Filiaire");
                String Numtel = rs.getString("Numtel");
                String Gender = rs.getString("Gender");

                // instanciation
                HomeBean bean = new HomeBean(id, Nom, Prenom, Specialite, Filiaire, Numtel, Gender);
                list.add(bean);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
         return list;
    }
    
    
    // create method for inserting data
    
    public void insert(HomeBean homeBean){
        // now inserting code would ne be here
        
        try{
            // make query of insert
            String query = "insert into etudiant values(null, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = DB.con.prepareStatement (query);
            ps.setString(1, homeBean.getNom());
            ps.setString(2, homeBean.getPrenom());
            //ps.setDate(3, (java.sql.Date) homeBean.getDateNaiss());
            ps.setString(3, homeBean.getSpecialite());
            ps.setString(4, homeBean.getFiliaire());
            ps.setString(5, homeBean.getNumtel());
            ps.setString(6, homeBean.getGender());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A Student has been inserted Successfully...");
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e);            
        }
    }
    
    
    //create method for get data when click
    public HomeBean returnAllDataToTextFields(int id){
        HomeBean bean = null;
        try{
            String query = "select * from etudiant where id = "+id;
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                int ids = rs.getInt("id");
                String Nom = rs.getString("Nom");
                String Prenom = rs.getString("Prenom");
                String Specialite = rs.getString("Specialite");
                String Filiaire = rs.getString("Filiaire");
                String Numtel = rs.getString("Numtel");
                String Gender = rs.getString("Gender");
                
                bean = new HomeBean(ids, Nom, Prenom, Specialite, Filiaire, Numtel, Gender);
                
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
        
        return bean;
    }
    
    // method for update
    
    public void updateData(HomeBean bean){
        
        try{
            String query = "update etudiant set Nom = ?, Prenom = ?, Specialite = ?, Filiaire = ?, Numtel = ?, Gender = ? where id = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            
            ps.setString(1, bean.getNom());
            ps.setString(2, bean.getPrenom());
            //ps.setDate(3, (java.sql.Date) bean.getDateNaiss());
            ps.setString(3, bean.getSpecialite());
            ps.setString(4, bean.getFiliaire());
            ps.setString(5, bean.getNumtel());
            ps.setString(6, bean.getGender());
            ps.setInt(7, bean.getId());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "The Student has been updated");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    // method for delete
    public void deleteData(int id){
        
        try{
            String query = "delete from etudiant where id = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
           
            ps.setInt(1, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "The Student has been deleted");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    //method for search
//    public HomeBean searchdata(String Nom){
//        
//      HomeBean bean = null;
//        try{
//            String query = "select * from etudiant where Nom = ?";
//            PreparedStatement ps = DB.con.prepareStatement(query);
//            ResultSet rs = ps.executeQuery();
//            
//            while (rs.next()){
//            
//                int id = rs.getInt("id");
//                Nom = rs.getString("Nom");
//                String Prenom = rs.getString("Prenom");
//                String Specialite = rs.getString("Specialite");
//                String Filiaire = rs.getString("Filiaire");
//                String Numtel = rs.getString("Numtel");
//                String Gender = rs.getString("Gender");
//                
//                bean = new HomeBean(id, Nom, Prenom, Specialite, Filiaire, Numtel, Gender);
//            }
//        } catch(Exception e){
//            JOptionPane.showMessageDialog(null, ""+e);
//        }
//        
//        return bean;
//    }
    
}