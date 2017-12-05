/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.db.views;

/**
 *
 * @author Leonardo
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txt_ape_pat = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txt_ape_ma = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txt_average = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        combo_pay = new javax.swing.JComboBox();
        combo_cobro = new javax.swing.JComboBox();
        btn_update = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Download_32px.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Upload_32px.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Todo_List_32px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(340, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 490));

        jPanel2.setBackground(new java.awt.Color(34, 49, 63));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 720, 260));

        jPanel3.setBackground(new java.awt.Color(236, 240, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombre.setBackground(new java.awt.Color(236, 240, 241));
        txt_nombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_nombre.setText("First Name");
        txt_nombre.setBorder(null);
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 160, -1));

        txt_ape_pat.setBackground(new java.awt.Color(236, 240, 241));
        txt_ape_pat.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_ape_pat.setText("Last Name");
        txt_ape_pat.setBorder(null);
        jPanel3.add(txt_ape_pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 160, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 160, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 160, -1));

        txt_ape_ma.setBackground(new java.awt.Color(236, 240, 241));
        txt_ape_ma.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_ape_ma.setText("Average");
        txt_ape_ma.setBorder(null);
        jPanel3.add(txt_ape_ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 160, -1));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 160, -1));

        txt_average.setBackground(new java.awt.Color(236, 240, 241));
        txt_average.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_average.setText("Email");
        txt_average.setBorder(null);
        jPanel3.add(txt_average, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 160, -1));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 160, -1));

        jPasswordField1.setBackground(new java.awt.Color(236, 240, 241));
        jPasswordField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 160, -1));

        combo_pay.setBackground(new java.awt.Color(236, 240, 241));
        combo_pay.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        combo_pay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Metodo de pago", "Debito", "Credito", "Pay Pal", "Depostito" }));
        jPanel3.add(combo_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 160, -1));

        combo_cobro.setBackground(new java.awt.Color(236, 240, 241));
        combo_cobro.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        combo_cobro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Metodo de cobro", "Debito", "Credito", "Pay Pal", "Depostito" }));
        jPanel3.add(combo_cobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 160, -1));

        btn_update.setBackground(new java.awt.Color(34, 49, 63));
        btn_update.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn_update.setText("Update");
        btn_update.setBorder(null);
        jPanel3.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 160, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 720, 160));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Search_32px.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 310, 10));

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1.setText("Search file");
        jTextField1.setBorder(null);
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 310, 20));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("User");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Male_User_32px.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Cancel_32px_1.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 720, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox combo_cobro;
    private javax.swing.JComboBox combo_pay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_ape_ma;
    private javax.swing.JTextField txt_ape_pat;
    private javax.swing.JTextField txt_average;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
