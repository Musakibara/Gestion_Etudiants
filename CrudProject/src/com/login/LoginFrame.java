/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import com.home.homeFrame;
import java.awt.Toolkit;

/**
 *
 * @author Danny
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame     */

    public LoginFrame() {
        initComponents();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("favicon.png")));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jTextFieldEmail = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonSignup = new javax.swing.JButton();
        jButtonSignin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(74, 31, 61));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/login/logoHintel-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 210, 210));

        jLabel3.setBackground(new java.awt.Color(186, 79, 84));
        jLabel3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(186, 79, 84));
        jLabel3.setText("INSTITUT SUPERIEUR HINTEL");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 270, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("copyright @ hintel All rights reserved");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 290, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 530));

        jPanel3.setBackground(new java.awt.Color(186, 79, 84));
        jPanel3.setForeground(new java.awt.Color(74, 31, 61));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 5, 20, 20));

        jLabel5.setBackground(new java.awt.Color(74, 31, 61));
        jLabel5.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(74, 31, 61));
        jLabel5.setText("SIGN IN");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 140, 30));

        jSeparator1.setBackground(new java.awt.Color(222, 222, 222));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 130, 10));

        jPasswordFieldPassword.setBackground(new java.awt.Color(186, 79, 84));
        jPasswordFieldPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPasswordFieldPassword.setText("jPasswordField1");
        jPasswordFieldPassword.setBorder(null);
        jPanel3.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 320, 40));

        jTextFieldEmail.setBackground(new java.awt.Color(186, 79, 84));
        jTextFieldEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldEmail.setText("Email");
        jTextFieldEmail.setBorder(null);
        jPanel3.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 320, 50));

        jSeparator2.setBackground(new java.awt.Color(222, 222, 222));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 320, 20));

        jSeparator3.setBackground(new java.awt.Color(222, 222, 222));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 202, 320, 10));

        jLabel6.setBackground(new java.awt.Color(222, 222, 222));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mail.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 50, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/login/password.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 50, 40));

        jButtonSignup.setBackground(new java.awt.Color(186, 79, 84));
        jButtonSignup.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonSignup.setForeground(new java.awt.Color(74, 31, 61));
        jButtonSignup.setText("SIGN UP");
        jButtonSignup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 31, 61), 1, true));
        jButtonSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignupActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 110, 40));

        jButtonSignin.setBackground(new java.awt.Color(186, 79, 84));
        jButtonSignin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonSignin.setForeground(new java.awt.Color(74, 31, 61));
        jButtonSignin.setText("SIGN IN");
        jButtonSignin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 31, 61), 1, true));
        jButtonSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSigninActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 110, 40));

        jLabel8.setBackground(new java.awt.Color(186, 79, 84));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 31, 61));
        jLabel8.setText("I Forgot My Password ?");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 160, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 520, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButtonSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignupActionPerformed
        
        this.hide();
        SignupFrame signupObj = new SignupFrame();
        signupObj.setVisible(true);
        
    }//GEN-LAST:event_jButtonSignupActionPerformed

    private void jButtonSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSigninActionPerformed
        // get data from fields
        String Email = jTextFieldEmail.getText();
        String Password = jPasswordFieldPassword.getText();
        
        // create bal class object
        Bal balObj = new Bal();
        boolean b = balObj.checkLogin(Email, Password); // we called the check method, he will return type boolean response
        
        if (b){
            // if from checkLogin method it's returning value tru...
            //then check in if and after that create home page object and show it
            
            homeFrame homeObj = new homeFrame();
            homeObj.show();
            this.hide();
        }
    }//GEN-LAST:event_jButtonSigninActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSignin;
    private javax.swing.JButton jButtonSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables
}
