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
    
    public String getLastName(){
        String last_name = null;
        ConnectionOracle con = new ConnectionOracle();
        con.conect();
        Statement st = null;
        String query = "SELECT APELLIDO_P_ALUMNO FROM ALUMNO WHERE USUARIO_IDUSUARIO LIKE " + user_id;
        ResultSet rs;
        try{
            st = con.conex.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
               last_name = rs.getString("APELLIDO_P_ALUMNO");
            }
            con.disconect();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return last_name;
    }
    public double getAverage(){
        double average = 0.0;
        ConnectionOracle con = new ConnectionOracle();
        con.conect();
        Statement st = null;
        String query = "SELECT PROMEDIO FROM ALUMNO WHERE USUARIO_IDUSUARIO LIKE " + user_id;
        ResultSet rs;
        try{
            st = con.conex.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
               average = rs.getDouble("PROMEDIO");
            }
            con.disconect();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return average;
    }
    public String getPassword(){
        String password = null;
        ConnectionOracle con = new ConnectionOracle();
        con.conect();
        Statement st = null;
        String query = "SELECT PASSWORD FROM USUARIO WHERE IDUSUARIO LIKE " + user_id;
        ResultSet rs;
        try{
            st = con.conex.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
               password = rs.getString("PASSWORD");
            }
            con.disconect();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return password;
    }
    public String getMail(){
        String mail = null;
        ConnectionOracle con = new ConnectionOracle();
        con.conect();
        Statement st = null;
        String query = "SELECT CORREO FROM USUARIO WHERE IDUSUARIO LIKE " + user_id;
        ResultSet rs;
        try{
            st = con.conex.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
               mail = rs.getString("CORREO");
            }
            con.disconect();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return mail;
    }
       
}
