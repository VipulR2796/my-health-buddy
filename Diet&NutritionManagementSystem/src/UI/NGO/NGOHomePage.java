/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.NGO;

import Model.Enterprise.NGO.NGODirectory;
import Model.Organization.HospitalResearchTeam;
import UI.NutritionAdmin.*;
import UI.Main.*;
import UI.User.*;
import Model.People.User;
import Model.People.UserDirectory;
import Model.Organization.ProductDirectory;
import UI.Authenticate.LoginFrame;
import UI.SystemAdmin.SAHomePage;
import java.awt.Color;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author vipul
 */
public class NGOHomePage extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    UserDirectory records = new UserDirectory();
    private TableRowSorter sorter;
    public NGOHomePage() {
        initComponents();
        
        show_overall_stats();
        HospitalResearchTeam pd = new HospitalResearchTeam();
        List<String> hospList = pd.getAllHospitals("CDC");
        generateHospitalDropdown(hospList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGender = new javax.swing.ButtonGroup();
        btnGroupDiabetes = new javax.swing.ButtonGroup();
        pnlTitleBar = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlSideOptions = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pnlWorkArea = new javax.swing.JPanel();
        panelMedical1 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        lblPending = new javax.swing.JLabel();
        lblApproved = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        comboHospital = new javax.swing.JComboBox<>();
        btnView1 = new javax.swing.JButton();
        panelMedical2 = new javax.swing.JPanel();
        lblTotal1 = new javax.swing.JLabel();
        lblPending1 = new javax.swing.JLabel();
        lblApproved1 = new javax.swing.JLabel();
        lblTotal2 = new javax.swing.JLabel();
        lblApproved2 = new javax.swing.JLabel();
        lblPending2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(66, 179, 172));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTitleBar.setBackground(new java.awt.Color(100, 129, 152));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/icons8_menu_48px_1.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/male_user_50px.png"))); // NOI18N
        jLabel4.setText("Welcome");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Diet Management System");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlTitleBarLayout = new javax.swing.GroupLayout(pnlTitleBar);
        pnlTitleBar.setLayout(pnlTitleBarLayout);
        pnlTitleBarLayout.setHorizontalGroup(
            pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleBarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 575, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
            .addGroup(pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitleBarLayout.createSequentialGroup()
                    .addContainerGap(842, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(59, 59, 59)))
        );
        pnlTitleBarLayout.setVerticalGroup(
            pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleBarLayout.createSequentialGroup()
                .addGroup(pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTitleBarLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlTitleBarLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitleBarLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addContainerGap()))
        );

        getContentPane().add(pnlTitleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        pnlSideOptions.setBackground(new java.awt.Color(51, 51, 51));
        pnlSideOptions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(192, 202, 97));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/icons8_Exit_26px_2.png"))); // NOI18N
        jLabel1.setText("   Logout");
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, -1));

        pnlSideOptions.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 190, 45));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel11.setText("  Home Page");
        jPanel11.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        jPanel7.setBackground(new java.awt.Color(255, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel8.setText("  Home Page");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 45));

        jPanel9.setBackground(new java.awt.Color(255, 51, 51));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel9.setText("  Home Page");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel10.setBackground(new java.awt.Color(255, 51, 51));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/adminIcons/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel10.setText("  Home Page");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 45));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 45));

        jPanel11.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 45));

        pnlSideOptions.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 45));

        getContentPane().add(pnlSideOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 620));

        pnlWorkArea.setBackground(new java.awt.Color(255, 255, 255));
        pnlWorkArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMedical1.setBackground(new java.awt.Color(255, 255, 255, 255));
        panelMedical1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 3, 10))); // NOI18N
        panelMedical1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total Hospitals", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 170, 70));

        lblPending.setBackground(new java.awt.Color(255, 255, 255));
        lblPending.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblPending.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPending.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total Research Dietitians", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical1.add(lblPending, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 210, 70));

        lblApproved.setBackground(new java.awt.Color(255, 255, 255));
        lblApproved.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblApproved.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApproved.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total Dietitians", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical1.add(lblApproved, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 170, 70));

        pnlWorkArea.add(panelMedical1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 770, 120));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel14.setText("Select Hospital to view data");
        pnlWorkArea.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, 40));

        pnlWorkArea.add(comboHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 170, 40));

        btnView1.setBackground(new java.awt.Color(255, 51, 51));
        btnView1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnView1.setForeground(new java.awt.Color(255, 255, 255));
        btnView1.setText("View Statistics");
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });
        pnlWorkArea.add(btnView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 170, 40));

        panelMedical2.setBackground(new java.awt.Color(255, 255, 255, 255));
        panelMedical2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 3, 10))); // NOI18N
        panelMedical2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotal1.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblTotal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diabetes Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical2.add(lblTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 170, 70));

        lblPending1.setBackground(new java.awt.Color(255, 255, 255));
        lblPending1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblPending1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPending1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cholesterol Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical2.add(lblPending1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 170, 70));

        lblApproved1.setBackground(new java.awt.Color(255, 255, 255));
        lblApproved1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblApproved1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApproved1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BP Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical2.add(lblApproved1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 170, 70));

        lblTotal2.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblTotal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Weight Loss", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical2.add(lblTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 170, 70));

        lblApproved2.setBackground(new java.awt.Color(255, 255, 255));
        lblApproved2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblApproved2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApproved2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Weight Gain", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical2.add(lblApproved2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 170, 70));

        lblPending2.setBackground(new java.awt.Color(255, 255, 255));
        lblPending2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblPending2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPending2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Core Strengthening", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        panelMedical2.add(lblPending2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 170, 70));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel13.setText("Diet-Type wise Users Distribution");
        panelMedical2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 260, -1));

        pnlWorkArea.add(panelMedical2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 770, 240));

        getContentPane().add(pnlWorkArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 63, 820, 610));

        setSize(new java.awt.Dimension(1012, 673));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    public void generateHospitalDropdown(List<String> foodList) {
        
        String[] foodDropdown = foodList.toArray(new String[foodList.size()]);
        DefaultComboBoxModel<String> yearsSDropdownModel = new DefaultComboBoxModel<>(foodDropdown);
        comboHospital.setModel(yearsSDropdownModel);
        comboHospital.setSelectedIndex(-1);
        
    }
    
    public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setForeground(Color.red);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jLabel3.setForeground(Color.white);
    }//GEN-LAST:event_jLabel3MouseExited

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        if(comboHospital.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this,
                "Please select a Hospital to view data",
                "Select Hospital",
                JOptionPane.ERROR_MESSAGE);
        }
        else{
            show_stats();
        }

    }//GEN-LAST:event_btnView1ActionPerformed
    
    private void show_stats(){
        NGODirectory ngo = new NGODirectory();
            
            String res4 = ngo.getDiabetesUsersForHospital(comboHospital.getSelectedItem().toString());
            String res5 = ngo.getBPUsersForHospital(comboHospital.getSelectedItem().toString());
            String res6 = ngo.getCholestrolUsersForHospital(comboHospital.getSelectedItem().toString());
            String res7 = ngo.getWeightLossUsersForHospital(comboHospital.getSelectedItem().toString());
            String res8 = ngo.getWeightGainUsersForHospital(comboHospital.getSelectedItem().toString());
            String res9 = ngo.getCoreUsersForHospital(comboHospital.getSelectedItem().toString());
            
            lblTotal1.setText(res4);
            lblApproved1.setText(res5);
            lblPending1.setText(res6);
            lblTotal2.setText(res7);
            lblApproved2.setText(res8);
            lblPending2.setText(res9);
            
            
    }
    
    private void show_overall_stats(){
        NGODirectory ngo = new NGODirectory();
            String res1 = ngo.getOverallHospitals();
            String res2 = ngo.getOverallDietitians();
            String res3 = ngo.getResearchDietitians();
            lblTotal.setText(res1);
            lblApproved.setText(res2);
            lblPending.setText(res3);
            
            
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NGOHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupDiabetes;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.JButton btnView1;
    private javax.swing.JComboBox<String> comboHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblApproved;
    private javax.swing.JLabel lblApproved1;
    private javax.swing.JLabel lblApproved2;
    private javax.swing.JLabel lblPending;
    private javax.swing.JLabel lblPending1;
    private javax.swing.JLabel lblPending2;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblTotal2;
    private javax.swing.JPanel panelMedical1;
    private javax.swing.JPanel panelMedical2;
    private javax.swing.JPanel pnlSideOptions;
    private javax.swing.JPanel pnlTitleBar;
    private javax.swing.JPanel pnlWorkArea;
    // End of variables declaration//GEN-END:variables
}
