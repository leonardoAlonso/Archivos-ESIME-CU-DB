/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.db.views;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import project.db.model.ConnectionOracle;
import projectdb.controller.Controller;

/**
 *
 * @author Leonardo
 */
public class InsertClass extends javax.swing.JFrame {
    private Object JoptionPane;

    /**
     * Creates new form InsertClass
     */
    public InsertClass() {
        initComponents();
        ConnectionOracle con = new ConnectionOracle();
        con.conect();
        Statement st = null;
        ResultSet rs = null;
        String query = "SELECT  NOMBRE_MAESTRO FROM MAESTRO";
        String materia = null;
        try{
            st = con.conex.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                materia = rs.getString("NOMBRE_MAESTRO");
                this.combo_maestro.addItem(rs.getString("NOMBRE_MAESTRO"));
            }
        }catch(SQLException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
        query = "SELECT NOMBRE_MATERIA FROM MATERIA";
        try{
            st = con.conex.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                materia = rs.getString("NOMBRE_MATERIA");
                this.combo_materia.addItem(rs.getString("NOMBRE_MATERIA"));
            }
        }catch(SQLException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
        
         query = "SELECT NOMBRE_CARRERA FROM CARRERA";
        try{
            st = con.conex.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                materia = rs.getString("NOMBRE_CARRERA");
                this.combo_carrera.addItem(rs.getString("NOMBRE_CARRERA"));
            }
        }catch(SQLException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combo_maestro = new javax.swing.JComboBox();
        combo_materia = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        combo_carrera = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Materia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        btn_exit.setBackground(new java.awt.Color(52, 152, 219));
        btn_exit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.setText("X");
        btn_exit.setBorder(null);
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exitMouseExited(evt);
            }
        });
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 50, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Create new Class");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, 20));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Maestro");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        combo_maestro.setBackground(new java.awt.Color(204, 204, 204));
        combo_maestro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        combo_maestro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona" }));
        combo_maestro.setBorder(null);
        jPanel1.add(combo_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 230, -1));

        combo_materia.setBackground(new java.awt.Color(204, 204, 204));
        combo_materia.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        combo_materia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona" }));
        combo_materia.setBorder(null);
        jPanel1.add(combo_materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 230, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nuevo Maestro");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nuva Materia");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jButton1.setBackground(new java.awt.Color(34, 49, 63));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Subir");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 70, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Carrera");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        combo_carrera.setBackground(new java.awt.Color(204, 204, 204));
        combo_carrera.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        combo_carrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona" }));
        combo_carrera.setBorder(null);
        jPanel1.add(combo_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        // TODO add your handling code here:
        btn_exit.setBackground(Color.red);
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        // TODO add your handling code here:
        Color fondo = new Color(52,152,219);
        btn_exit.setBackground(fondo);

    }//GEN-LAST:event_btn_exitMouseExited

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Upload up= new Upload();
        up.setVisible(true);
        up.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Controller con = new Controller();
        con.insertclase(combo_maestro.getSelectedIndex(), combo_materia.getSelectedIndex(),combo_carrera.getSelectedIndex());
        JOptionPane.showMessageDialog(null,"Se ha creado la clase");
        this.setVisible(false);
        Upload up= new Upload();
        up.setVisible(true);
        up.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JComboBox combo_carrera;
    private javax.swing.JComboBox combo_maestro;
    private javax.swing.JComboBox combo_materia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}