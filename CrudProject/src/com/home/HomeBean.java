/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

//import.java.util.Date;

/**
 *
 * @author Danny
 */
public class HomeBean {
    
    private int id;
    private String Nom;
    private String Prenom;
    //ivate Date DateNaiss;
    private String Specialite;
    private String Filiaire;
    private String Numtel;
    private String Gender;
    
    // constructor int id ,S

    public HomeBean(int id,String Nom, String Prenom, String Specialite, String Filiaire, String Numtel, String Gender) {
        this.id = id;
        this.Nom = Nom;
        this.Prenom = Prenom;
        //is.DateNaiss = DateNaiss;
        this.Specialite = Specialite;
        this.Filiaire = Filiaire;
        this.Numtel = Numtel;
        this.Gender = Gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    // getter setter 

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

//    public Date getDateNaiss() {
//        return DateNaiss;
//    }
//
//    public void setDateNaiss(Date DateNaiss) {
//        this.DateNaiss = DateNaiss;
//    }

    public String getSpecialite() {
        return Specialite;
    }

    public void setSpecialite(String Specialite) {
        this.Specialite = Specialite;
    }

    public String getFiliaire() {
        return Filiaire;
    }

    public void setFiliaire(String Filiaire) {
        this.Filiaire = Filiaire;
    }

    public String getNumtel() {
        return Numtel;
    }

    public void setNumtel(String Numtel) {
        this.Numtel = Numtel;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    
}
