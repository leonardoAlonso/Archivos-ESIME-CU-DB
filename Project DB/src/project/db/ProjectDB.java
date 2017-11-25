/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.db;
import project.db.views.LoginRegister;

/**
 *
 * @author Leonardo
 */
public class ProjectDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginRegister login = new LoginRegister();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
    
}
