/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

// import com.login.Bean;
import com.databaseCon.DB;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import java.util.Date;

/**
 *
 * @author Danny
 */
 public class homeFrame extends javax.swing.JFrame {

    /**
     * Creates new form homeFrame
     */
    public homeFrame() {
        initComponents();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("favicon.png")));
                    
        this.setResizable(false);//this mean frame would be fix
        
        loadTable();
    }
    
    // create table for load data...
    
    private void loadAllDataIntoTable( List <HomeBean> list){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        
        dtm.setRowCount(0);
        
        for(HomeBean bean : list) {
            Vector v = new Vector();
            v.add(bean.getId());
            v.add(bean.getNom());
            v.add(bean.getPrenom());
            v.add(bean.getSpecialite());
            v.add(bean.getFiliaire());
            v.add(bean.getNumtel());
            v.add(bean.getGender());
            
            dtm.addRow(v);
        }
        
    }
    
     public void loadTable(){
            //access those method which
            HomeBal bal = new HomeBal();
            List list = bal.loadData();
            loadAllDataIntoTable(list);
        }
     
     
     //method to clear the jtable
     public void clearTextFieldData(){
         
         jTextFieldFirstName.setText("");
         jTextFieldLastName.setText("");
         jTextFieldFiliaire.setText("");
         jTextFieldSpecialite.setText("");
         jTextFieldNumero.setText("");
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldFiliaire = new javax.swing.JTextField();
        jTextFieldSpecialite = new javax.swing.JTextField();
        jButtonclear = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(74, 31, 61));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inconnu.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 20, 60, 60));

        jLabel2.setBackground(new java.awt.Color(74, 31, 61));
        jLabel2.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(186, 79, 84));
        jLabel2.setText("WELCOME, ADMINISTRATOR");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 20, 210, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/favicon.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 50));

        jLabel4.setBackground(new java.awt.Color(74, 31, 61));
        jLabel4.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(186, 79, 84));
        jLabel4.setText("STUDENT MANAGEMENT SYSTEM");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 25, 340, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1850, 90));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 31, 61), 2, true), "ADD STUDENTS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 1, 18), new java.awt.Color(186, 79, 84))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(186, 79, 84));
        jLabel6.setText("First Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 40));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(186, 79, 84));
        jLabel8.setText("Last Name");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, 40));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(186, 79, 84));
        jLabel10.setText("Filiaire");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, 40));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(186, 79, 84));
        jLabel12.setText("Gender");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 100, 40));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(186, 79, 84));
        jLabel13.setText("Specialite");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, 40));

        jComboBoxGender.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxGender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculin", "Feminin" }));
        jComboBoxGender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(186, 79, 84), 2, true));
        jPanel2.add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 430, 40));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(186, 79, 84));
        jLabel16.setText("Number");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 40));

        jTextFieldNumero.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNumero.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(186, 79, 84), 2, true));
        jTextFieldNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 430, 40));

        jTextFieldFirstName.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFirstName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldFirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(186, 79, 84), 2, true));
        jPanel2.add(jTextFieldFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 430, 40));

        jTextFieldLastName.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldLastName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(186, 79, 84), 2, true));
        jPanel2.add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 430, 40));

        jTextFieldFiliaire.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFiliaire.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldFiliaire.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(186, 79, 84), 2, true));
        jPanel2.add(jTextFieldFiliaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 430, 40));

        jTextFieldSpecialite.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldSpecialite.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldSpecialite.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(186, 79, 84), 2, true));
        jPanel2.add(jTextFieldSpecialite, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 430, 40));

        jButtonclear.setBackground(new java.awt.Color(186, 79, 84));
        jButtonclear.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButtonclear.setText("CLEAR");
        jButtonclear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 31, 61), 2, true));
        jButtonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclearActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 160, 50));

        jButtonInsert.setBackground(new java.awt.Color(186, 79, 84));
        jButtonInsert.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButtonInsert.setText("INSERT");
        jButtonInsert.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 31, 61), 2, true));
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 160, 50));

        jButtonUpdate.setBackground(new java.awt.Color(186, 79, 84));
        jButtonUpdate.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 31, 61), 2, true));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 160, 50));

        jButtonDelete.setBackground(new java.awt.Color(186, 79, 84));
        jButtonDelete.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButtonDelete.setText("DELETE");
        jButtonDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 31, 61), 2, true));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 160, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 650, 670));

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Filiaire", "Specialite", "Numtel", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 272, 1200, 490));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(186, 79, 84));
        jLabel5.setText("Total Students");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 15, 120, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 180, 110));

        jTextFieldSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldSearch.setText("Search here...");
        jTextFieldSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 31, 61), 2, true));
        getContentPane().add(jTextFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 130, 210, 40));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(186, 79, 84));
        jLabel7.setText("Research :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 130, 80, 40));

        jButtonSearch.setBackground(new java.awt.Color(186, 79, 84));
        jButtonSearch.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jButtonSearch.setText("Search");
        jButtonSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(74, 31, 61), 2, true));
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 190, 100, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 160, 60, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroKeyTyped

        char c =evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNumeroKeyTyped

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        
        // this mean insert button click we are getting text field combobox value...
        String Nom = jTextFieldFirstName.getText();
        String Prenom = jTextFieldLastName.getText();
        //Date DateNaiss = jDateChooserDateNaiss.getDate();
        String Specialite = jTextFieldSpecialite.getText();
        String Filiaire = jTextFieldFiliaire.getText();
        String Numtel = jTextFieldNumero.getText();
        String Gender = (String) jComboBoxGender.getSelectedItem();
        
        // now make object of homeBean class...
        HomeBean homeBean = new HomeBean(0, Nom, Prenom, Specialite, Filiaire, Numtel, Gender);
        HomeBal homeObj = new HomeBal();
        homeObj.insert(homeBean);
        
        loadTable();
    }//GEN-LAST:event_jButtonInsertActionPerformed
        int id = 0; // make it global because through the id we will update
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int row = jTable1.getSelectedRow();
        if (row < 0){
            JOptionPane.showMessageDialog(null, "Please select a student from the table for update or delete");
           // this code means when we haven't select a student from the table then the message will show
        } else{
            id = (int) jTable1.getValueAt(row, 0); //we are getting id from the table
            HomeBal bal = new HomeBal();
            HomeBean bean = bal.returnAllDataToTextFields(id); // this method has return type
            jTextFieldFirstName.setText(bean.getNom());
            jTextFieldLastName.setText(bean.getPrenom());
            jTextFieldSpecialite.setText(bean.getSpecialite());
            jTextFieldFiliaire.setText(bean.getFiliaire());
            jTextFieldNumero.setText(bean.getNumtel());
            jComboBoxGender.setSelectedItem(bean.getGender());

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        
        String Nom = jTextFieldFirstName.getText();
        String Prenom = jTextFieldLastName.getText();
        //Date DateNaiss = jDateChooserDateNaiss.getDate();
        String Specialite = jTextFieldSpecialite.getText();
        String Filiaire = jTextFieldFiliaire.getText();
        String Numtel = jTextFieldNumero.getText();
        String Gender = (String) jComboBoxGender.getSelectedItem();
        
        HomeBean bean = new HomeBean(id, Nom, Prenom, Specialite, Filiaire, Numtel, Gender);
        HomeBal bal = new HomeBal();
        bal.updateData(bean); //call of the method to execute sql request
        
        loadTable(); // call of the method to reload the table
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        
       HomeBal bal = new HomeBal();
       bal.deleteData(id); //after deleting the student, the jtable reload
        
        loadTable(); // call of the method to reload the table
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    
    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        clearTextFieldData();
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
         try {
            String pid= Eid.getSelectedItem().toString();
            
             PreparedStatement ps = DB.con.prepareStatement("SELECT * FROM etudiant WHERE id=?");
            ps.setString(1,pid);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()==true){
                jTextFieldFirstName.setText(rs.getString(2));
                jTextFieldLastName.setText(rs.getString(3));
                jTextFieldSpecialite.setText(rs.getString(4));
                jTextFieldFiliaire.setText(rs.getString(4));
                jTextFieldNumero.setText(rs.getString(4));
                jComboBoxGender.setSelectedItem(rs.getString(5));
                
            }else{
                JOptionPane.showMessageDialog(this,"Record not found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldFiliaire;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextFieldSpecialite;
    // End of variables declaration//GEN-END:variables
}
