package UI.Authenticate;

import Model.Account.AccountDirectory;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author naman
 */
public class SignupFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public SignupFrame() {
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

        jPasswordField1 = new javax.swing.JPasswordField();
        mainPanel = new javax.swing.JPanel();
        rPanel = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txtPswrdCon = new javax.swing.JPasswordField();
        txtPswrd = new javax.swing.JPasswordField();
        btnSignup = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        comboGender = new javax.swing.JComboBox<>();
        dateDOB = new com.toedter.calendar.JDateChooser();
        txtContact = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblInvalid = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rPanel.setBackground(new java.awt.Color(255, 255, 255, 100));
        rPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtEmail.setText("Enter Email Address");
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        rPanel.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 200, 30));

        lblTitle.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("My HEALTH Buddy");
        rPanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, 50));

        txtPswrdCon.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtPswrdCon.setText("Confirm Password");
        txtPswrdCon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPswrdCon.setEchoChar('\u0000');
        txtPswrdCon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPswrdConFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPswrdConFocusLost(evt);
            }
        });
        rPanel.add(txtPswrdCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 200, 30));

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
        rPanel.add(txtPswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 200, 30));

        btnSignup.setBackground(new java.awt.Color(192, 202, 97));
        btnSignup.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(51, 51, 51));
        btnSignup.setText("Signup");
        btnSignup.setBorder(null);
        btnSignup.setBorderPainted(false);
        btnSignup.setFocusPainted(false);
        btnSignup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignupMouseExited(evt);
            }
        });
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        rPanel.add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 140, 30));

        btnLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(51, 51, 51));
        btnLogin.setText("Back to Login");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        rPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 140, 30));

        txtName.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtName.setText("Enter Full Name");
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        rPanel.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 200, 30));

        comboGender.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Male", "Female", "Non-binary", "Don't want to disclose" }));
        comboGender.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        rPanel.add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 200, 30));

        dateDOB.setBackground(new java.awt.Color(121, 237, 39));
        dateDOB.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        dateDOB.setToolTipText("DOB");
        dateDOB.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        rPanel.add(dateDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 200, 30));

        txtContact.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtContact.setText("Enter Mobile Number");
        txtContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContactFocusLost(evt);
            }
        });
        rPanel.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 200, 30));

        txtAddress.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtAddress.setText("Enter Address");
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });
        rPanel.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 200, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons/mail_30px.png"))); // NOI18N
        rPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 30, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons/icons8-home-address-30.png"))); // NOI18N
        rPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 40, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons/icons8-birth-date-30.png"))); // NOI18N
        rPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 40, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons/icons8-password-30.png"))); // NOI18N
        rPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 40, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons/icons8-phone-30.png"))); // NOI18N
        rPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 40, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons/icons8-password-30.png"))); // NOI18N
        rPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 40, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons/icons8-name-tag-30.png"))); // NOI18N
        rPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 30, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icons/icons8-unisex-30.png"))); // NOI18N
        rPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 40, 40));

        mainPanel.add(rPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 400, 610));

        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 51, 51));
        btnClose.setText("X");
        btnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        mainPanel.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vipul\\Downloads\\grilled-chicken-rice-spicy-chickpeas-avocado-cabbage-pepper-buddha-bowl-dark-top-view.jpg")); // NOI18N
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 670));

        lblInvalid.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblInvalid.setForeground(new java.awt.Color(255, 51, 51));
        lblInvalid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainPanel.add(lblInvalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 380, 20));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        if ("Enter Email Address".equals(txtEmail.getText())){
            txtEmail.setText(null);
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if(txtEmail.getText().length()==0){
            txtEmail.setText("Enter Email Address");
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPswrdConFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPswrdConFocusGained
        // TODO add your handling code here:
        if ("Confirm Password".equals(txtPswrdCon.getText())){
            txtPswrdCon.setText(null);
            txtPswrdCon.requestFocus();
            txtPswrdCon.setEchoChar('*');
        }
    }//GEN-LAST:event_txtPswrdConFocusGained

    private void txtPswrdConFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPswrdConFocusLost
        // TODO add your handling code here:
        if(txtPswrdCon.getText().length()==0){
            txtPswrdCon.setText("Confirm Password");
            txtPswrdCon.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtPswrdConFocusLost

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

    private void btnSignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseEntered
        // TODO add your handling code here:
        btnSignup.setBackground(new Color(101,153,98));
    }//GEN-LAST:event_btnSignupMouseEntered

    private void btnSignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseExited
        // TODO add your handling code here:
        btnSignup.setBackground(new Color(192,202,97));
    }//GEN-LAST:event_btnSignupMouseExited

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String password = txtPswrdCon.getText();
        String confirmpassword = txtPswrdCon.getText();
        String email = txtEmail.getText();
        String gender = comboGender.getSelectedItem().toString();
        Date dob = dateDOB.getDate();
        String address = txtAddress.getText();
        long mobile = Long.parseLong(txtContact.getText());

        if (email.equals("Enter Email") || password.equals("Enter Password")
            || confirmpassword.equals("Confirm Password") || name.equals("Enter Full Name")
            || gender.equals(" ") || dob.toString().isEmpty()
            || address.equals("Enter Address") || txtContact.getText().equals("Enter Mobile Number")){
            JOptionPane.showMessageDialog(this, "Please fill all the details");
        }
        else if (!password.equals(confirmpassword)){
            JOptionPane.showMessageDialog(this, "Password doesn't match");
        }
        else{
            userSignup(email,password,name,gender,dob,address,mobile);
        }
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        // TODO add your handling code here:
        btnLogin.setBackground(new Color(192,202,97));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        // TODO add your handling code here:
        btnLogin.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        // TODO add your handling code here:
        if ("Enter Name".equals(txtName.getText())){
            txtName.setText(null);
            txtName.requestFocus();
        }
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
        if(txtName.getText().length()==0){
            txtName.setText("Enter Name");
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactFocusGained

    private void txtContactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusLost
        // TODO add your handling code here:
        if(txtContact.getText().length()==0){
            txtContact.setText("Enter Email Address");
        }
    }//GEN-LAST:event_txtContactFocusLost

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        // TODO add your handling code here:
        if ("Enter Address".equals(txtAddress.getText())){
            txtAddress.setText(null);
            txtAddress.requestFocus();
        }
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
        // TODO add your handling code here:
        if(txtAddress.getText().length()==0){
            txtAddress.setText("Enter Address");
        }
    }//GEN-LAST:event_txtAddressFocusLost

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JComboBox<String> comboGender;
    private com.toedter.calendar.JDateChooser dateDOB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblInvalid;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel rPanel;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPswrd;
    private javax.swing.JPasswordField txtPswrdCon;
    // End of variables declaration//GEN-END:variables

    private void userSignup(String email, String password, String name,String gender,Date dob,
            String address,long mobile) {
        AccountDirectory ac = new AccountDirectory();
        ac.addUserCredential(email, password, "User");
        ac.addPerson(email,name,gender,dob,address,mobile);
        ac.addUser(email,name,gender,dob,address,mobile);

        JOptionPane.showMessageDialog(this, "Account Created Successfully");

        txtPswrd.setText("Enter password");
        txtPswrdCon.setText("Confirm password");
        txtEmail.setText("Email address");
        txtAddress.setText("Enter Address");
        txtContact.setText("Enter Mobile Number");
        dateDOB.setDate(null);
        txtContact.setText("Enter Mobile Number");
        comboGender.setSelectedItem(null);
       
    }
}
