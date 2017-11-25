/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.db.model;
import java.sql.*;
//import javax.swing.UIManager;
import javax.swing.JOptionPane;
//import javax.swing.plaf.ColorUIResource;
/**
 *
 * @author Leonardo
 */
public class ConnectionOracle {
    String user;
    String password;
    String url;
    Connection conex;
    //UIManager UI=new UIManager();
    
    Statement stm;
    public ConnectionOracle(){
        user = "leonardo_alonso"; // cambair por su usuario
        password = "aea4f8261e"; // cambiar por su contraseña
        url = "jdbc:oracle:thin:@localhost:1521:XE";
        conex = null;
        stm = null;
    }
    public void conect(){
        try{
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            conex = DriverManager.getConnection(url,user,password); 
            //UI.put("OptionPane.background",new ColorUIResource(34,49,63));
            //UI.put("OptionPane.foreground", new ColorUIResource(255,255,255));
            JOptionPane.showMessageDialog(null,"Conexion exitosa");
        }catch(SQLException e){
           // UI.put("OptionPane.background",new ColorUIResource(255,0,0));
            JOptionPane.showMessageDialog(null,"Conexion fallida");
        }
    }
    public void disconect(){
        try{
            conex.close();
        }catch(SQLException e){
            //UI.put("OptionPane.background",new ColorUIResource(255,0,0));
            JOptionPane.showMessageDialog(null,"Error al desconectar");
        }
    }
    
    /*Aun no funciona 
    se debe crear un procedimiento almacenado en la base de datos para insertar alumnos
    sobre el mismo insertar al usuario
    */
    /*
    public void insert_alumno(int ID, String name, String lastname, String age, String gender) {
        try {
            String Query = "INSERT INTO ALUMNO "  + " VALUES("
                    + "\"" + ID + "\", "
                    + "\"" + name + "\", "
                    + "\"" + lastname + "\", "
                    + "\"" + age + "\", "
                    + "\"" + gender + "\")";
            stm = conex.createStatement();
            stm.executeUpdate(Query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    */
}
