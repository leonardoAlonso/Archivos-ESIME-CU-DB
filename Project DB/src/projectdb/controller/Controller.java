/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdb.controller;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
           if (rs.next()){
                user_id = rs.getInt("IDUSUARIO");
                activo = true; 
            }else{
               activo = false;
               JOptionPane.showMessageDialog(null, "Usuario o Contraseña erroneos");
           }
            //System.out.println("Inicio");
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
            if(rs.next()){
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
            if(rs.next()){
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
            if(rs.next()){
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
            if(rs.next()){
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
            if(rs.next()){
               mail = rs.getString("CORREO");
            }
            con.disconect();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return mail;
    }
    
    public void updateUser(String user, String last_name, double promedio, int metodo_pago, int metodo_cobro, String correo, String password){
        ConnectionOracle con = new ConnectionOracle();
        con.conect();
        String query = "UPDATE ALUMNO SET NOMBRE_ALUMNO = ?, "+
                "APELLIDO_P_ALUMNO = ?, PROMEDIO = ?, PAGO_IDPAGO = ?,"+
                "COBRO_IDCOBRO = ? WHERE USUARIO_IDUSUARIO =  ?";
        try{            
            PreparedStatement st = con.conex.prepareStatement(query);
            st.setString(1, user);
            st.setString(2, last_name);
            st.setDouble(3, promedio);
            st.setInt(4, metodo_pago);
            st.setInt(5, metodo_cobro);
            st.setInt(6, user_id);
            st.executeUpdate();
            System.out.println("Actualizado 1");
            query = "UPDATE USUARIO SET CORREO = ?, PASSWORD = ? WHERE IDUSUARIO =" + user_id;
            st = con.conex.prepareStatement(query);
            st.setString(1, correo);
            st.setString(2, password);
            st.executeUpdate();
            con.disconect();
            JOptionPane.showMessageDialog(null, "Datos actualizados");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void newUser(String first_name, String last_name, String birthday, int grade, double average, int  carrer, int pay, int cash, String email, String password){
        ConnectionOracle con = new ConnectionOracle();
        con.conect();
        int last_id = 0;
        String query = "SELECT MAX(IDALUMNO) FROM ALUMNO ";
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        System.out.println(last_id);
        try{
            st = con.conex.createStatement(); 
            rs = st.executeQuery(query);
            if(rs.next()){
                //System.out.println("ejecutado");
                last_id =  rs.getInt("MAX(IDALUMNO)");
                //System.out.println(last_id);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        last_id = last_id + 1;
        //System.out.println(last_id); 
        query = "INSERT INTO USUARIO (IDUSUARIO, CORREO, PASSWORD) VALUES (?, ?, ?)";
        try{
            ps = con.conex.prepareStatement(query);
            ps.setInt(1, last_id);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.execute();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        ps = null;
        query = "INSERT INTO ALUMNO (IDALUMNO, NOMBRE_ALUMNO, APELLIDO_P_ALUMNO, FECHA_NACIMIENTO, SEMESTRE,"+
                "PROMEDIO, CARRERA_IDCARRERA, USUARIO_IDUSUARIO, PAGO_IDPAGO, COBRO_IDCOBRO )"+
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ? ,?)";
        try{
            ps = con.conex.prepareStatement(query);
            ps.setInt(1,last_id);
            ps.setString(2, first_name);
            ps.setString(3, last_name);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
            String strFecha = birthday;
            Date fecha = null;
            try {
                fecha =  formatter.parse(strFecha);
            } catch (ParseException ex) {}
            java.sql.Date fechasql = null;
            fechasql = new java.sql.Date(fecha.getTime());
            ps.setDate(4, fechasql);
            ps.setInt(5,grade);
            ps.setDouble(6, average);
            ps.setInt(7, carrer);
            ps.setInt(8, last_id);
            ps.setInt(9, pay);
            ps.setInt(10, cash);
            ps.execute();
             con.disconect();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
