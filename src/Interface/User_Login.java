/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author DIL-SOFT 02
 */
public class User_Login extends javax.swing.JFrame {

    /**
     * Creates new form User_Login
     */
    public User_Login() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    
     public Connection SqlConnection(){
        
        Connection conn =  null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Stock_System","root","");
            return conn;
            
        } catch (SQLException e) {
                       JOptionPane.showMessageDialog(null, "Mysql connected fail");
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Technician_Details.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
    
    
    public void validateUser()
    {
        if(jText_Uname !=null || jText_password != null){
 
            try{
                 Connection conn = SqlConnection();
                 String qry=("select UName, UPassword from Register where UName=? and UPassword=?");
                 PreparedStatement ps=conn.prepareStatement(qry);
                 ps.setString(1,(jText_Uname.getText()));
                 ps.setString(2, jText_password.getText());
                 ResultSet rs=ps.executeQuery();

                 if(rs.next()){
                     Stock_Details E =new Stock_Details();
                     E.setVisible(true);
                     this.dispose();
                 }
                 else{
                     JOptionPane.showMessageDialog(this, "Invalid Username or Password");
                     jText_Uname.setText("");
                     jText_password.setText("");
                 }
                 conn.close();

            }catch (Exception e){

            }
              }else{
                JOptionPane.showMessageDialog(null, " Data inserted failed");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonclose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        buttonback = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jText_Uname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jText_password = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        butto_signup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(393, 419));

        jPanel1.setBackground(new java.awt.Color(5, 10, 46));
        jPanel1.setPreferredSize(new java.awt.Dimension(394, 70));

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 58)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User");

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login");

        buttonclose.setBackground(new java.awt.Color(5, 10, 46));
        buttonclose.setMinimumSize(new java.awt.Dimension(25, 25));
        buttonclose.setLayout(new java.awt.BorderLayout());

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_25px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        buttonclose.add(close, java.awt.BorderLayout.CENTER);

        buttonback.setBackground(new java.awt.Color(5, 10, 46));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_50px.png"))); // NOI18N
        back.setPreferredSize(new java.awt.Dimension(35, 35));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonbackLayout = new javax.swing.GroupLayout(buttonback);
        buttonback.setLayout(buttonbackLayout);
        buttonbackLayout.setHorizontalGroup(
            buttonbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );
        buttonbackLayout.setVerticalGroup(
            buttonbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(buttonback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonclose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonclose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(buttonback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(5, 10, 46));
        jPanel2.setPreferredSize(new java.awt.Dimension(393, 297));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bus005.gif"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(21, 53, 84));
        jLabel5.setText("User Name:");

        jText_Uname.setBackground(new java.awt.Color(5, 10, 46));
        jText_Uname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jText_Uname.setForeground(new java.awt.Color(255, 255, 255));
        jText_Uname.setBorder(null);
        jText_Uname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jText_UnameFocusGained(evt);
            }
        });
        jText_Uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_UnameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(21, 53, 84));
        jLabel6.setText("Password:");

        jText_password.setBackground(new java.awt.Color(5, 10, 46));
        jText_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jText_password.setForeground(new java.awt.Color(255, 255, 255));
        jText_password.setBorder(null);
        jText_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jText_passwordFocusGained(evt);
            }
        });

        butto_signup.setBackground(new java.awt.Color(5, 10, 46));
        butto_signup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        butto_signup.setForeground(new java.awt.Color(255, 255, 255));
        butto_signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/submit_progress_25px.png"))); // NOI18N
        butto_signup.setText("Sign up");
        butto_signup.setBorder(null);
        butto_signup.setPreferredSize(new java.awt.Dimension(105, 33));
        butto_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butto_signupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jText_Uname)
                        .addComponent(jSeparator1)
                        .addComponent(jText_password)
                        .addComponent(jSeparator2))
                    .addComponent(butto_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jText_Uname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_password, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(butto_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(419, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    
    private void jText_UnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_UnameFocusGained
        // TODO add your handling code here:
        jLabel5.setForeground(new Color(255,255,255));
        jLabel6.setForeground(new Color(21,53,84));
    }//GEN-LAST:event_jText_UnameFocusGained

    private void jText_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_passwordFocusGained
        // TODO add your handling code here:
        jLabel6.setForeground(new Color(255,255,255));
        jLabel5.setForeground(new Color(21,53,84));
    }//GEN-LAST:event_jText_passwordFocusGained

    private void jText_UnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_UnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_UnameActionPerformed

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        changecolor(buttonclose, new Color(232, 17, 35));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
       changecolor(buttonclose, new Color(5, 10, 46));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Home E =new Home();
        E.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        changecolor(buttonback, new Color(51, 84, 158));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        changecolor(buttonback, new Color(5, 10, 46));
    }//GEN-LAST:event_backMouseExited

    private void butto_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butto_signupActionPerformed
       
       validateUser();
            
    }//GEN-LAST:event_butto_signupActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton butto_signup;
    private javax.swing.JPanel buttonback;
    private javax.swing.JPanel buttonclose;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jText_Uname;
    private javax.swing.JPasswordField jText_password;
    // End of variables declaration//GEN-END:variables

    
}