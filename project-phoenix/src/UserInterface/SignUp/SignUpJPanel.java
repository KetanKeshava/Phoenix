/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SignUp;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nagal
 */
public class SignUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
    private JPanel UserMainContainer;
    Business business;
    
    public SignUpJPanel(JPanel UserMainContainer, Business business) {
        initComponents();
        this.UserMainContainer = UserMainContainer;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUpSplitPane = new javax.swing.JSplitPane();
        navbarJPanel = new javax.swing.JPanel();
        btnNGOSupervisorSignUp = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();
        btnNGOVolunteerSignUp = new javax.swing.JButton();
        btnShelterSupervisorSignUp = new javax.swing.JButton();
        btnShelterNurseSignUp = new javax.swing.JButton();
        btnClinicStaff = new javax.swing.JButton();
        btnClinicDoctor = new javax.swing.JButton();
        btnTrainer = new javax.swing.JButton();
        btnCSRSupervisorSiguUp = new javax.swing.JButton();
        btnCSREmployerSignUp = new javax.swing.JButton();
        signUpWorkAreaJPanel = new javax.swing.JPanel();

        navbarJPanel.setBackground(new java.awt.Color(210, 201, 201));

        btnNGOSupervisorSignUp.setText("NGO Supervisor");
        btnNGOSupervisorSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNGOSupervisorSignUpActionPerformed(evt);
            }
        });

        btnGoBack.setText("Go Back");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        btnNGOVolunteerSignUp.setText("NGO Volunteer");
        btnNGOVolunteerSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNGOVolunteerSignUpActionPerformed(evt);
            }
        });

        btnShelterSupervisorSignUp.setText("Shelter Supervisor");
        btnShelterSupervisorSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShelterSupervisorSignUpActionPerformed(evt);
            }
        });

        btnShelterNurseSignUp.setText("Shelter Nurse");
        btnShelterNurseSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShelterNurseSignUpActionPerformed(evt);
            }
        });

        btnClinicStaff.setText("Clinic Staff");
        btnClinicStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClinicStaffActionPerformed(evt);
            }
        });

        btnClinicDoctor.setText("Clinic Doctor");
        btnClinicDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClinicDoctorActionPerformed(evt);
            }
        });

        btnTrainer.setText("Shelter Trainer");
        btnTrainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrainerActionPerformed(evt);
            }
        });

        btnCSRSupervisorSiguUp.setText("CSR Supervisor");
        btnCSRSupervisorSiguUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSRSupervisorSiguUpActionPerformed(evt);
            }
        });

        btnCSREmployerSignUp.setText("CSR Employer");
        btnCSREmployerSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSREmployerSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navbarJPanelLayout = new javax.swing.GroupLayout(navbarJPanel);
        navbarJPanel.setLayout(navbarJPanelLayout);
        navbarJPanelLayout.setHorizontalGroup(
            navbarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNGOSupervisorSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNGOVolunteerSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnShelterSupervisorSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
            .addComponent(btnShelterNurseSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGoBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClinicStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClinicDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTrainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCSRSupervisorSiguUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCSREmployerSignUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navbarJPanelLayout.setVerticalGroup(
            navbarJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarJPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnNGOSupervisorSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNGOVolunteerSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShelterSupervisorSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShelterNurseSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClinicStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClinicDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCSRSupervisorSiguUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCSREmployerSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        signUpSplitPane.setLeftComponent(navbarJPanel);

        javax.swing.GroupLayout signUpWorkAreaJPanelLayout = new javax.swing.GroupLayout(signUpWorkAreaJPanel);
        signUpWorkAreaJPanel.setLayout(signUpWorkAreaJPanelLayout);
        signUpWorkAreaJPanelLayout.setHorizontalGroup(
            signUpWorkAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        signUpWorkAreaJPanelLayout.setVerticalGroup(
            signUpWorkAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        signUpSplitPane.setRightComponent(signUpWorkAreaJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpSplitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNGOSupervisorSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNGOSupervisorSignUpActionPerformed
        // TODO add your handling code here:
        NGOSupervisorSignUpJPanel ngoSupervisorSignUpPanel = new NGOSupervisorSignUpJPanel(UserMainContainer, business);
        signUpSplitPane.setRightComponent(ngoSupervisorSignUpPanel);
    }//GEN-LAST:event_btnNGOSupervisorSignUpActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        UserMainContainer.remove(this);
        CardLayout layout = (CardLayout) UserMainContainer.getLayout();
        layout.previous(UserMainContainer);
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnNGOVolunteerSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNGOVolunteerSignUpActionPerformed
        // TODO add your handling code here:
        NGOVolunteerSignUpJPanel ngoVolunteerSignUpPanel = new NGOVolunteerSignUpJPanel(UserMainContainer, business);
        signUpSplitPane.setRightComponent(ngoVolunteerSignUpPanel);
    }//GEN-LAST:event_btnNGOVolunteerSignUpActionPerformed

    private void btnShelterSupervisorSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShelterSupervisorSignUpActionPerformed
        // TODO add your handling code here:
        ShelterSupervisorSignUpJPanel shelterSupervisorSignUpPanel = new ShelterSupervisorSignUpJPanel(UserMainContainer, business);
        signUpSplitPane.setRightComponent(shelterSupervisorSignUpPanel);
    }//GEN-LAST:event_btnShelterSupervisorSignUpActionPerformed

    private void btnShelterNurseSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShelterNurseSignUpActionPerformed
        // TODO add your handling code here:
        ShelterNurseSignUpJPanel shelterNurseSignUpPanel = new ShelterNurseSignUpJPanel(UserMainContainer, business);
        signUpSplitPane.setRightComponent(shelterNurseSignUpPanel);
    }//GEN-LAST:event_btnShelterNurseSignUpActionPerformed

    private void btnTrainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainerActionPerformed
        // TODO add your handling code here:
        ShelterTrainerSignUpJPanel shelterTrainerSignUpPanel = new ShelterTrainerSignUpJPanel(UserMainContainer, business);
        signUpSplitPane.setRightComponent(shelterTrainerSignUpPanel);
    }//GEN-LAST:event_btnTrainerActionPerformed

    private void btnClinicStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClinicStaffActionPerformed
        // TODO add your handling code here:
        ClinicStaffSignUpJPanel clinicStaff = new ClinicStaffSignUpJPanel(UserMainContainer, business);
        signUpSplitPane.setRightComponent(clinicStaff);
    }//GEN-LAST:event_btnClinicStaffActionPerformed

    private void btnClinicDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClinicDoctorActionPerformed
        // TODO add your handling code here:
        ClinicDoctorJPanel clinicDoctor = new ClinicDoctorJPanel(UserMainContainer, business);
        signUpSplitPane.setRightComponent(clinicDoctor);
    }//GEN-LAST:event_btnClinicDoctorActionPerformed

    private void btnCSRSupervisorSiguUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSRSupervisorSiguUpActionPerformed
        // TODO add your handling code here:
        CSRSupervisorJPanel csrSupervisor = new CSRSupervisorJPanel(UserMainContainer, business);
        signUpSplitPane.setRightComponent(csrSupervisor);
    }//GEN-LAST:event_btnCSRSupervisorSiguUpActionPerformed

    private void btnCSREmployerSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSREmployerSignUpActionPerformed
        // TODO add your handling code here:
        CSREmployerJPanel csrEmployer = new CSREmployerJPanel(UserMainContainer, business);
        signUpSplitPane.setRightComponent(csrEmployer);
    }//GEN-LAST:event_btnCSREmployerSignUpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCSREmployerSignUp;
    private javax.swing.JButton btnCSRSupervisorSiguUp;
    private javax.swing.JButton btnClinicDoctor;
    private javax.swing.JButton btnClinicStaff;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnNGOSupervisorSignUp;
    private javax.swing.JButton btnNGOVolunteerSignUp;
    private javax.swing.JButton btnShelterNurseSignUp;
    private javax.swing.JButton btnShelterSupervisorSignUp;
    private javax.swing.JButton btnTrainer;
    private javax.swing.JPanel navbarJPanel;
    private javax.swing.JSplitPane signUpSplitPane;
    private javax.swing.JPanel signUpWorkAreaJPanel;
    // End of variables declaration//GEN-END:variables
}
