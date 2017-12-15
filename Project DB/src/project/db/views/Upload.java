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
public class Upload extends javax.swing.JFrame {

    /**
     * Creates new form Upload
     */
    public Upload() {
        initComponents();
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
                this.combo_class.addItem(rs.getString("NOMBRE_MATERIA") +" "+ rs.getString("NOMBRE_MAESTRO"));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_name_file = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextPane();
        txt_costo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txt_calificacion = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField5 = new javax.swing.JTextField();
        combo_type = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txt_ruta = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        combo_class = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Descripcion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Formato");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Costo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Calificacion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txt_name_file.setBackground(new java.awt.Color(52, 152, 219));
        txt_name_file.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_name_file.setForeground(new java.awt.Color(255, 255, 255));
        txt_name_file.setBorder(null);
        jPanel1.add(txt_name_file, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 350, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 350, 10));

        txt_descripcion.setBorder(null);
        txt_descripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(txt_descripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 430, 140));

        txt_costo.setBackground(new java.awt.Color(52, 152, 219));
        txt_costo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_costo.setForeground(new java.awt.Color(255, 255, 255));
        txt_costo.setBorder(null);
        jPanel1.add(txt_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 350, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 350, 10));

        txt_calificacion.setBackground(new java.awt.Color(52, 152, 219));
        txt_calificacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_calificacion.setForeground(new java.awt.Color(255, 255, 255));
        txt_calificacion.setBorder(null);
        jPanel1.add(txt_calificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 320, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 320, 10));

        jTextField5.setBackground(new java.awt.Color(52, 152, 219));
        jTextField5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(null);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 260, -1));

        combo_type.setBackground(new java.awt.Color(204, 204, 204));
        combo_type.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        combo_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona", ".docx", ".pdf", ".exe", ".cpp", ".java", ".txt", ".ppt", "otro", " " }));
        combo_type.setBorder(null);
        jPanel1.add(combo_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 350, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Upload File");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        txt_ruta.setBackground(new java.awt.Color(52, 152, 219));
        txt_ruta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_ruta.setForeground(new java.awt.Color(255, 255, 255));
        txt_ruta.setBorder(null);
        jPanel1.add(txt_ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 320, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 262, 310, 20));

        jButton1.setBackground(new java.awt.Color(34, 49, 63));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Upload");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 70, 30));

        jButton2.setBackground(new java.awt.Color(34, 49, 63));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Select file");
        jButton2.setBorder(null);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 100, 30));

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
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 50, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Clase");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        combo_class.setBackground(new java.awt.Color(204, 204, 204));
        combo_class.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        combo_class.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona" }));
        combo_class.setBorder(null);
        jPanel1.add(combo_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 360, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nueva clase");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        // TODO add your handling code here:
        btn_exit.setBackground(Color.red);
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        // TODO add your handling code here:
        Color fondo = new Color(52,152,219);
        btn_exit.setBackground(fondo);
        
    }//GEN-LAST:event_btn_exitMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Controller con = new Controller();
        String formato = null;
        switch(String.valueOf(combo_type.getSelectedItem())){
            case ".docx":
                formato = ".docx" ;
                break;
            case ".pdf":
                formato = ".pdf" ;
                break;
            case ".exe":
                formato = ".exe" ;
                break;
            case ".cpp":
                formato = ".cpp" ;
                break;
            case ".java":
                formato = ".java" ;
                break;
            case ".txt":
                formato = ".txt" ;
                break;
            case ".ppt":
                formato = ".ppt" ;
                break;
            default:
                formato = "otro";
                break;        
        }
        int clase = 0;
        if("Selecciona".equals(String.valueOf(combo_class.getSelectedItem()))){
            clase = 1;
        }else{
            clase = combo_class.getSelectedIndex();
        }
        con.insertFile(txt_name_file.getText(), formato, Integer.parseInt(txt_costo.getText()), Double.parseDouble(txt_calificacion.getText()), clase, txt_ruta.getText(), txt_descripcion.getText());
       JOptionPane.showMessageDialog(null, "Felicidades tu archivo ha sido subido");
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        InsertClass clase =  new InsertClass();
        this.setVisible(false);
        clase.setVisible(true);
        clase.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel8MouseClicked

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JComboBox combo_class;
    private javax.swing.JComboBox combo_type;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txt_calificacion;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextPane txt_descripcion;
    private javax.swing.JTextField txt_name_file;
    private javax.swing.JTextField txt_ruta;
    // End of variables declaration//GEN-END:variables
}
