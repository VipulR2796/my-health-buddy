package UI.Authenticate;

import Model.Account.AccountDirectory;
import Model.Database.DBconnection;
import UI.Dietitian.DietitianHomePage;
import UI.GroceryStore.GSHomePage;
import UI.Hospital.HospitalHomePage;
import UI.HospitalAdmin.HAHomePage;
import UI.MealService.MSHomePage;
import UI.NGO.NGOHomePage;
import UI.ResearchDietitian.ResearchHomePage;
import UI.NutritionAdmin.NAHomePage;
import UI.SystemAdmin.SAHomePage;
import UI.User.UserHomePage;
import java.awt.Color;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author naman
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    DBconnection conn;
    public LoginFrame() {
        initComponents();
        conn = new DBconnection();
        if(conn==null){
            JOptionPane.showMessageDialog(this, "DB Connection not found!", "Error", JOptionPane.ERROR_MESSAGE);
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

        rPanel = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblInvalid = new javax.swing.JLabel();
        txtPswrd = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnLogin1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rPanel.setBackground(new java.awt.Color(255, 255, 255, 100));
        rPanel.setOpaque(true);
        rPanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rPanelFocusGained(evt);
            }
        });
        rPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtEmail.setText("Enter Email");
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        rPanel.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 200, 30));

        lblTitle.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("My HEALTH Buddy");
        lblTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblTitleFocusGained(evt);
            }
        });
        rPanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 100));

        lblInvalid.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblInvalid.setForeground(new java.awt.Color(255, 51, 51));
        lblInvalid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rPanel.add(lblInvalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 380, 10));

        txtPswrd.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtPswrd.setText("Enter Password");
        txtPswrd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPswrd.setEchoChar('\u0000');
        txtPswrd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPswrdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPswrdFocusLost(evt);
            }
        });
        rPanel.add(txtPswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 200, 30));

        btnLogin.setBackground(new java.awt.Color(192, 202, 97));
        btnLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(51, 51, 51));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setFocusPainted(false);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        rPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 140, 40));

        btnLogin1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        btnLogin1.setForeground(new java.awt.Color(51, 51, 51));
        btnLogin1.setText("New User? Sign Up Here");
        btnLogin1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogin1.setBorderPainted(false);
        btnLogin1.setFocusPainted(false);
        btnLogin1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin1.setOpaque(true);
        btnLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogin1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogin1MouseExited(evt);
            }
        });
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        rPanel.add(btnLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 190, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons/icons8-mail-50.png"))); // NOI18N
        rPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 60, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons/pwd_50px.png"))); // NOI18N
        rPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 60, 50));

        getContentPane().add(rPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 400, 630));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel2.setText("X");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 20, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vipul\\Downloads\\flat-lay-healthy-immunity-boosting-foods.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        if ("Enter Email".equals(txtEmail.getText())){
            txtEmail.setText(null);
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if(txtEmail.getText().length()==0){
            txtEmail.setText("Enter Email");
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void lblTitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblTitleFocusGained
        // TODO add your handling code here:
        this.requestFocusInWindow();
    }//GEN-LAST:event_lblTitleFocusGained

    private void txtPswrdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPswrdFocusGained
        // TODO add your handling code here:
        if ("Enter Password".equals(txtPswrd.getText())){
            txtPswrd.setText(null);
            txtPswrd.requestFocus();
            txtPswrd.setEchoChar('*');
        }
    }//GEN-LAST:event_txtPswrdFocusGained

    private void txtPswrdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPswrdFocusLost
        // TODO add your handling code here:
        if(txtPswrd.getText().length()==0){
            txtPswrd.setText("Enter Password");
            txtPswrd.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtPswrdFocusLost

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        // TODO add your handling code here:
        btnLogin.setBackground(new Color(101,153,98));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        // TODO add your handling code here:
        btnLogin.setBackground(new Color(192,202,97));
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String email = txtEmail.getText();
        String password = txtPswrd.getText();
        if (email.equals("Enter Email") || password.equals("Enter Password")){
            lblInvalid.setText("Email or Password is empty!");
        }
        else{
            try {
                userLogin(email,password);
            } catch (IOException ex) {
                Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogin1MouseEntered
        // TODO add your handling code here:
        btnLogin1.setBackground(new Color(192,202,97));
    }//GEN-LAST:event_btnLogin1MouseEntered

    private void btnLogin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogin1MouseExited
        // TODO add your handling code here:
        btnLogin1.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnLogin1MouseExited

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
        dispose();
        SignupFrame sf = new SignupFrame();
        sf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void rPanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rPanelFocusGained
        // TODO add your handling code here:
        this.requestFocusInWindow();
    }//GEN-LAST:event_rPanelFocusGained

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(Color.red);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(Color.black);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked
    
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
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblInvalid;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel rPanel;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPswrd;
    // End of variables declaration//GEN-END:variables

//    private void userLogin(String email,String password) throws IOException{
//        
//        try {
//            AccountDirectory ac = new AccountDirectory();
//            ResultSet res = ac.checkCredential(email, password);
//            if(res.next()){
//                dispose();
//                switch (res.getString(1)) {
//                    case "User":
//                        {
//                            UserHomePage mf = new UserHomePage(email);
//                            mf.setVisible(true);
////                  this.setVisible(false);
//                            break;
//                        }
//                    case "Dietitian":
//                        {
//                            DietitianHomePage mf = new DietitianHomePage(email);
//                            mf.setVisible(true);
////                  this.setVisible(false);
//                            break;
//                        }
//                    case "Research Dietitian":
//                        {
//                            SAHomePage mf = new SAHomePage();
//                            mf.setVisible(true);
////                  this.setVisible(false);
//                            break;
//                        }
//                    case "Hospital Admin":
//                        {
//                            SAHomePage mf = new SAHomePage();
//                            mf.setVisible(true);
////                  this.setVisible(false);
//                            break;
//                        }
//                    case "admin":
//                        {
//                            SAHomePage mf = new SAHomePage(email);
//                            mf.setVisible(true);
////                  this.setVisible(false);
//                            break;
//                        }
//                    case "Grocery Store":
//                        {
//                            GSHomePage mf = new GSHomePage(email);
//                            mf.setVisible(true);
////                  this.setVisible(false);
//                            break;
//                        
//                        }
//                    case "Meal Service":
//                        {
//                            MSHomePage mf = new MSHomePage(email);
//                            mf.setVisible(true);
////                  this.setVisible(false);
//                            break;
//                        
//                        }
//                        
//                    case "Hospital":
//                    {
//                        HospitalHomePage mf = new HospitalHomePage(email);
//                        mf.setVisible(true);
//                        break;
//                    }
//                    case "Nutrition Admin":
//                    {
//                        NAHomePage mf = new NAHomePage();
//                        mf.setVisible(true);
////                  this.setVisible(false);
//                        break;
//                    }
//                    default:
//                        break;
//                }
//                
//            }
//            else{
//                lblInvalid.setText("Please use valid credentials!");
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
    
    private void userLogin(String email,String password) throws IOException{
        try {
            AccountDirectory ac = new AccountDirectory();
            ResultSet res = ac.checkCredential(email, password);
            if(res.next()){
                dispose();
                switch (res.getString(1)) {
                    case "User":
                        {
                            UserHomePage mf = new UserHomePage(email);
                            mf.setVisible(true);
//                  this.setVisible(false);
                            break;
                        }
                    case "Dietitian":
                        {
                            DietitianHomePage mf = new DietitianHomePage(email);
                            mf.setVisible(true);
//                  this.setVisible(false);
                            break;
                        }
                    case "Research Dietitian":
                        {
                            ResearchHomePage mf = new ResearchHomePage(email);
                            mf.setVisible(true);
//                  this.setVisible(false);
                            break;
                        }
                    case "Hospital Admin":
                        {
                            HAHomePage mf = new HAHomePage();
                            mf.setVisible(true);
//                  this.setVisible(false);
                            break;
                        }
                    case "admin":
                        {
                            SAHomePage mf = new SAHomePage(email);
                            mf.setVisible(true);
//                  this.setVisible(false);
                            break;
                        }
                    case "Grocery Store":
                        {
                            GSHomePage mf = new GSHomePage(email);
                            mf.setVisible(true);
//                  this.setVisible(false);
                            break;
                        }
                    case "Meal Service":
                        {
                            MSHomePage mf = new MSHomePage(email);
                            mf.setVisible(true);
//                  this.setVisible(false);
                            break;
                        }
                    case "Nutrition Admin":
                        {
                            NAHomePage mf = new NAHomePage();
                            mf.setVisible(true);
//                  this.setVisible(false);
                            break;
                        }
                    case "NGO":
                        {
                            NGOHomePage mf = new NGOHomePage();
                            mf.setVisible(true);
//                  this.setVisible(false);
                            break;
                        }
                    case "Hospital":
                    {
                        HospitalHomePage mf = new HospitalHomePage(email);
                        mf.setVisible(true);
                        break;
                    }
                    default:
                        break;
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Please use valid credentials");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}