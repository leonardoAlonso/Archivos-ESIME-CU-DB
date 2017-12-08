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
import java.util.List;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import project.db.model.Archivo;
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
    public List<Archivo> getArchivo(){
        ArrayList<Archivo> a = new ArrayList();
       ConnectionOracle con = new ConnectionOracle();
       con.conect();
       String  query = "SELECT * FROM ARCHIVO";
       Statement st = null;
       ResultSet rs = null;
        int id = 0;
        String nombre = null;
        String formato = null;
        double costo = 0;
        double calificacion = 0;
        int num_Descargas = 0;
        int puntos = 0;
        int alumno_id = 0;
        int clase_id = 0;
        String ruta = null;
        String descripcion = null;
       try{
           st = con.conex.createStatement();
           rs= st.executeQuery(query);
           while(rs.next()){
               id = rs.getInt("IDARCHIVO");
               nombre = rs.getString("NOMBRE_ARCHIVO");
               formato = rs.getString("FORMATO_ARCHIVO");
               costo = rs.getDouble("COSTO");
               calificacion = rs.getDouble("CALIFICACION");
               num_Descargas = rs.getInt("NUM_DESCARGAS");
               puntos = rs.getInt("PUNTAJE");
               alumno_id = rs.getInt("ALUMNO_IDALUMNO");
               clase_id = rs.getInt("CLASE_IDCLASE");
               ruta = rs.getString("RUTA_ARCHIVO");
               descripcion = rs.getString("DESCRPCION");
               Archivo arr = new Archivo(id,nombre,formato,costo,calificacion,num_Descargas,puntos,alumno_id,clase_id,ruta,descripcion);
                a.add(arr);
           }
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }
        
        return a;
    }
    public List<Archivo> getArchivoUser(){
        ArrayList<Archivo> a = new ArrayList();
       ConnectionOracle con = new ConnectionOracle();
       con.conect();
       String  query = "SELECT * FROM ARCHIVO WHERE ALUMNO_IDALUMNO = " + user_id;
       Statement st = null;
       ResultSet rs = null;
        int id = 0;
        String nombre = null;
        String formato = null;
        double costo = 0;
        double calificacion = 0;
        int num_Descargas = 0;
        int puntos = 0;
        int alumno_id = 0;
        int clase_id = 0;
        String ruta = null;
        String descripcion = null;
       try{
           st = con.conex.createStatement();
           rs= st.executeQuery(query);
           while(rs.next()){
               id = rs.getInt("IDARCHIVO");
               nombre = rs.getString("NOMBRE_ARCHIVO");
               formato = rs.getString("FORMATO_ARCHIVO");
               costo = rs.getDouble("COSTO");
               calificacion = rs.getDouble("CALIFICACION");
               num_Descargas = rs.getInt("NUM_DESCARGAS");
               puntos = rs.getInt("PUNTAJE");
               alumno_id = rs.getInt("ALUMNO_IDALUMNO");
               clase_id = rs.getInt("CLASE_IDCLASE");
               ruta = rs.getString("RUTA_ARCHIVO");
               descripcion = rs.getString("DESCRPCION");
               Archivo arr = new Archivo(id,nombre,formato,costo,calificacion,num_Descargas,puntos,alumno_id,clase_id,ruta,descripcion);
                a.add(arr);
           }
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }
        
        return a;
    }
    
    public JComboBox getItemms(){
        JComboBox box = new JComboBox();
        ConnectionOracle con = new ConnectionOracle();
        con.conect();
        Statement st = null;
        ResultSet rs = null;
        String query = "SELECT NOMBRE_MATERIA, NOMBRE_MAESTRO FROM MATERIA, MAESTRO, CLASE WHERE CLASE.MAESTRO_IDMAESTRO = MAESTRO.IDMAESTRO AND CLASE.MATERIA_IDMATERIA = MATERIA.IDMATERIA";
        String materia = null;
        try{
            st = con.conex.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                materia = rs.getString("NOMBRE_MATERIA");
                box.addItem(rs.getString("NOMBRE_MATERIA"));
            }
        }catch(SQLException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
        return box;
    }
    
    public void insertFile(String name, String format, int cost, double calificacion, int clase_id, String directory, String description){
        ConnectionOracle con = new ConnectionOracle();
        con.conect();
        int last_id = 0;
        String query = "SELECT MAX(IDARCHIVO) FROM ARCHIVO ";
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        System.out.println(last_id);
        try{
            st = con.conex.createStatement(); 
            rs = st.executeQuery(query);
            if(rs.next()){
                //System.out.println("ejecutado");
                last_id =  rs.getInt("MAX(IDARCHIVO)");
                //System.out.println(last_id);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        last_id = last_id + 1;
        System.out.println(last_id);
        query = "INSERT INTO ARCHIVO (IDARCHIVO, NOMBRE_ARCHIVO, FORMATO_ARCHIVO, COSTO, CALIFICACION,"+
                "NUM_DESCARGAS, PUNTAJE, ALUMNO_IDALUMNO, CLASE_IDCLASE, RUTA_ARCHIVO,DESCRPCION )"+
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ? ,?, ?)";
        try{
            ps = con.conex.prepareStatement(query);
            ps.setInt(1,last_id);
            ps.setString(2, name);
            ps.setString(3, format);
            ps.setInt(4, cost);
            ps.setDouble(5,calificacion);
            ps.setInt(6, 0);
            ps.setInt(7, 0);
            ps.setInt(8, user_id);
            ps.setInt(9, clase_id);
            ps.setString(10, directory);
            ps.setString(11, description);
            ps.execute();
             con.disconect();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
