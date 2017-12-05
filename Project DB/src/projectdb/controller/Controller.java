/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdb.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import project.db.model.ConnectionOracle;

/**
 *
 * @author Leonardo
 */

public class Controller {
    static int user_id;
    public Controller(){}
    
    public boolean login(String user, String pass) {
        boolean activo = false;
        ConnectionOracle con = new ConnectionOracle();
        con.conect();
        Statement st = null;
        String query = "SELECT IDUSUARIO FROM USUARIO WHERE USUARIO.CORREO LIKE '" + user  + "' AND PASSWORD LIKE '" + pass + "'";
        ResultSet rs;
        try{
            st = con.conex.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                user_id = rs.getInt("IDUSUARIO");
            }
            activo = true; 
            System.out.println("Inicio");
            con.disconect();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("fallo");
        }
        return activo;
    }
    public String getUser(){
        String user = null;
        ConnectionOracle con = new ConnectionOracle();
        con.conect();
        Statement st = null;
        String query = "SELECT NOMBRE_ALUMNO FROM ALUMNO WHERE USUARIO_IDUSUARIO LIKE " + user_id;
        ResultSet rs;
        try{
            st = con.conex.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
               user = rs.getString("NOMBRE_ALUMNO");
            }
            con.disconect();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return user;
    }
       
}
