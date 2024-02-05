/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.ClinicEnterprise.WorkArea.ClinicDoctor;

import business.Business;
import business.ClinicEnterprise.ClinicAdministration.ClinicStaffProfile;
import business.ClinicEnterprise.ClinicDoctor.ClinicDoctorProfile;
import business.Enterprise.ClinicEnterprise;
import business.Enterprise.Enterprise;
import business.Organization.ClinicDoctorOrganization;
import business.Organization.Organization;
import business.userAccounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nagal
 */
public class ClinicDoctorWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form ClinicDoctorJPanel
     */
    
    JPanel UserMainContainer; 
    Business business;
    ClinicEnterprise enterprise;
    ClinicDoctorOrganization organization;
    ClinicDoctorProfile currentAuthenticatedUser;
    UserAccount currentUser;
    public ClinicDoctorWorkArea(JPanel UserMainContainer, Business business, ClinicEnterprise enterprise, ClinicDoctorOrganization organization, ClinicDoctorProfile currentAuthenticatedUser, UserAccount currentUser) {
        initComponents();
        
        this.UserMainContainer = UserMainContainer;
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        this.currentAuthenticatedUser = currentAuthenticatedUser;
        this.currentUser = currentUser;
        renderDoctorName();
        showHomePage();
    }
    
    public void renderDoctorName() {
        lblTitle.setText("Welcome Doctor, " + currentAuthenticatedUser.getPerson().getFirstName());
    }
    
    public void showHomePage() {
        TreatPatientsJPanel treatPatients = new TreatPatientsJPanel(this.business, this.enterprise, this.organization, this.currentAuthenticatedUser, this.currentUser);
        clinicDoctorSplitPane.setRightComponent(treatPatients);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clinicDoctorSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnManageProfile2 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();

        clinicDoctorSplitPane.setDividerLocation(150);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jButton1.setText("Treat Patients");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnManageProfile2.setText("Update Self");
        btnManageProfile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProfile2ActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addComponent(btnManageProfile2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageProfile2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        clinicDoctorSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(167, 219, 154));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("Welcome Clinic Doctor!");
        jPanel2.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 17, -1, -1));

        clinicDoctorSplitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clinicDoctorSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clinicDoctorSplitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        UserMainContainer.remove(this);
        CardLayout layout = (CardLayout) UserMainContainer.getLayout();
        layout.previous(UserMainContainer);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        showHomePage();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnManageProfile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProfile2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageProfile2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageProfile2;
    private javax.swing.JSplitPane clinicDoctorSplitPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
