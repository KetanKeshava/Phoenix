/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.NGOEnterprise.WorkArea.NGOAdmin;

import business.Business;
import business.Enterprise.Enterprise;
import business.Enterprise.NGOEnterprise;
import business.NGOEnterprise.NGOAdministration.NGOSupervisorProfile;
import business.Organization.NGOAdministrationOrganization;
import business.Organization.Organization;
import business.userAccounts.UserAccount;
import java.awt.CardLayout;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author vishnupaduchuri
 */
public class NGOAdminJPanel extends javax.swing.JPanel {

    JPanel UserMainContainer;
    Business business;
    NGOEnterprise enterprise;
    NGOAdministrationOrganization organization;
    NGOSupervisorProfile currentAuthenticatedUser;
    UserAccount currentUser;
    /**
     * Creates new form NGOAdminJPanel
     * @param UserMainContainer
     */
    public NGOAdminJPanel(JPanel UserMainContainer, Business business, NGOEnterprise enterprise, NGOAdministrationOrganization organization, NGOSupervisorProfile currentAuthenticatedUser, UserAccount currentUser) {
        initComponents();
        DisplayDateAndTime();
        this.UserMainContainer = UserMainContainer;
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        this.currentAuthenticatedUser = currentAuthenticatedUser;
        this.currentUser = currentUser;
    }
    
    public void DisplayDateAndTime() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        dateAndTime.setText("Date: " + dateFormat.format(now));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ngoAdminSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnManageVolunteers = new javax.swing.JButton();
        btnAnalytics = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dateAndTime = new javax.swing.JLabel();

        ngoAdminSplitPane.setDividerLocation(160);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        btnManageVolunteers.setText("Manage Volunteers");
        btnManageVolunteers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVolunteersActionPerformed(evt);
            }
        });

        btnAnalytics.setText("Analytics");
        btnAnalytics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyticsActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnManageVolunteers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAnalytics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnManageVolunteers, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnAnalytics, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        ngoAdminSplitPane.setLeftComponent(jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Welcome NGO Admin");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 6, -1, -1));

        dateAndTime.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        dateAndTime.setText("Date:");
        jPanel2.add(dateAndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 47, -1, -1));

        ngoAdminSplitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ngoAdminSplitPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ngoAdminSplitPane)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        UserMainContainer.remove(this);
        CardLayout layout = (CardLayout) UserMainContainer.getLayout();
        layout.previous(UserMainContainer);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnManageVolunteersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVolunteersActionPerformed
        // TODO add your handling code here:
        ManageNGOVolunteersJPanel manageNGOVolunteers = new ManageNGOVolunteersJPanel(this.business, this.enterprise, this.organization, this.currentAuthenticatedUser, this.currentUser);
        ngoAdminSplitPane.setRightComponent(manageNGOVolunteers);
    }//GEN-LAST:event_btnManageVolunteersActionPerformed

    private void btnAnalyticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyticsActionPerformed
        // TODO add your handling code here:
        ViewAnalyticsJPanel viewAnalytics = new ViewAnalyticsJPanel(this.business, this.enterprise, this.organization, this.currentAuthenticatedUser, this.currentUser);
        ngoAdminSplitPane.setRightComponent(viewAnalytics);
    }//GEN-LAST:event_btnAnalyticsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalytics;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageVolunteers;
    private javax.swing.JLabel dateAndTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane ngoAdminSplitPane;
    // End of variables declaration//GEN-END:variables
}
