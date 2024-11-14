/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import java.sql.Date;

/**
 *
 * @author Danny
 */

public class Bean { // this class is use to recive values from the form
    
    private String Nom;
    private String Email;
    private String Password;
    

    //constructor

    public Bean(String Nom, String Email, String Password) {
        this.Nom = Nom;
        this.Email = Email;
        this.Password = Password;
    }


    // getter ang setter

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void getPassword(String Password) {
        this.Password = Password;
    }
    
    
    
    
    
}
