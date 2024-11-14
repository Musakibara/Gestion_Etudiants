/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudprojetc;

import com.databaseCon.DB;
import com.login.LoginFrame;

/**
 *
 * @author Danny
 */
public class CrudProjetc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create object of that login frame to show when you run this project, login frame must open
        
        LoginFrame loginObj = new LoginFrame();
        loginObj.show();
        
        DB.loadConnection(); // calling load methode in main class
    }
    
}
