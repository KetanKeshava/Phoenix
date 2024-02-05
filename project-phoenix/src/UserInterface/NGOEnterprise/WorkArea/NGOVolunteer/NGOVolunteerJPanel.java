package UserInterface.NGOEnterprise.WorkArea.NGOVolunteer;

import business.Business;
import business.Enterprise.Enterprise;
import business.Enterprise.NGOEnterprise;
import business.NGOEnterprise.NGOVolunteer.NGOVolunteerProfile;
import business.Organization.NGOAdministrationOrganization;
import business.Organization.NGOVolunteerOrganization;
import business.Organization.Organization;
import business.userAccounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author vishnupaduchuri
 */
public class NGOVolunteerJPanel extends javax.swing.JPanel {

    JPanel UserMainContainer;
    Business business;
    NGOEnterprise enterprise;
    NGOVolunteerOrganization organization;
    NGOVolunteerProfile currentAuthenticatedUser;
    UserAccount currentUser;

    /**
     * Creates new form NGOVolunteerJPanel
     * @param UserMainContainer
     * @param business
     * @param enterprise
     * @param organization
     * @param currentAuthenticatedUser
     * @param currentUser
     */
    public NGOVolunteerJPanel(JPanel UserMainContainer, Business business, NGOEnterprise enterprise, NGOVolunteerOrganization organization, NGOVolunteerProfile currentAuthenticatedUser, UserAccount currentUser) {
        initComponents();
        this.UserMainContainer = UserMainContainer;
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        this.currentAuthenticatedUser = currentAuthenticatedUser;
        this.currentUser = currentUser;
        showHomePage();
    }
    
    public void showHomePage() {
        VolunteerHomePageJPanel homePage = new VolunteerHomePageJPanel(this.business, this.enterprise, this.organization, this.currentAuthenticatedUser, this.currentUser);
        volunteerSplitPane.setRightComponent(homePage);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volunteerSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnSignUpPatient = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnUpdateSelf = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        volunteerSplitPane.setDividerLocation(160);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSignUpPatient.setText("Sign Up Patients");
        btnSignUpPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpPatientActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUpPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 160, 50));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 511, 160, 50));

        btnUpdateSelf.setText("Update Profile");
        btnUpdateSelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSelfActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateSelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 160, 50));

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 160, 51));

        volunteerSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        volunteerSplitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volunteerSplitPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volunteerSplitPane)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpPatientActionPerformed
        // TODO add your handling code here:
        SignUpPatientsJPanel signUpPatients = new SignUpPatientsJPanel(this.business, this.enterprise, this.organization, this.currentAuthenticatedUser, this.currentUser);
        volunteerSplitPane.setRightComponent(signUpPatients);
    }//GEN-LAST:event_btnSignUpPatientActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        UserMainContainer.remove(this);
        CardLayout layout = (CardLayout) UserMainContainer.getLayout();
        layout.previous(UserMainContainer);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnUpdateSelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSelfActionPerformed
        // TODO add your handling code here:
        UpdateSelfJPanel updateSelfPanel = new UpdateSelfJPanel(this.business, this.enterprise, this.organization, this.currentAuthenticatedUser, this.currentUser);
        volunteerSplitPane.setRightComponent(updateSelfPanel);
    }//GEN-LAST:event_btnUpdateSelfActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        showHomePage();
    }//GEN-LAST:event_btnHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSignUpPatient;
    private javax.swing.JButton btnUpdateSelf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane volunteerSplitPane;
    // End of variables declaration//GEN-END:variables
}
