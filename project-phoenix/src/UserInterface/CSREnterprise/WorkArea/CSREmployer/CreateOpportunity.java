/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CSREnterprise.WorkArea.CSREmployer;

import business.Business;
import business.CSREnterprise.CSREmployer.CSREmployerProfile;
import business.Enterprise.CSREnterprise;
import business.Organization.CSREmployerOrganization;
import business.csr.Opportunity;
import business.shelter.EmployableSkills;
import business.userAccounts.UserAccount;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author nagal
 */
public class CreateOpportunity extends javax.swing.JPanel {

    /**
     * Creates new form CreateOpportunity
     */
    Business business;
    CSREnterprise enterprise;
    CSREmployerOrganization organization;
    CSREmployerProfile currentAuthenticatedUser;
    UserAccount currentUser;
    public CreateOpportunity(Business business, CSREnterprise enterprise, CSREmployerOrganization organization, CSREmployerProfile currentAuthenticatedUser, UserAccount currentUser) {
        initComponents();
        
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        this.currentAuthenticatedUser = currentAuthenticatedUser;
        this.currentUser = currentUser;
        
        populateDropDowns();
    }
    
    public void populateDropDowns(){
        DefaultComboBoxModel<EmployableSkills> requiredSkills = new DefaultComboBoxModel<>(EmployableSkills.values());
        cmbRequiredSkill.setModel(requiredSkills);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtJobTitle = new javax.swing.JTextField();
        cmbRequiredSkill = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtJobDescription = new javax.swing.JTextArea();
        spinnerAvailablePositions = new javax.swing.JSpinner();
        btnCreateOpportunity = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 208, 141));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Create Opportunity");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 35, -1, -1));

        jLabel2.setText("Job Title:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 105, -1, -1));

        jLabel3.setText("Required Skill:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel4.setText("Job Description:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 178, -1, -1));

        jLabel5.setText("Available Positions:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 290, -1, -1));
        add(txtJobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 102, 234, -1));

        add(cmbRequiredSkill, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 137, 234, -1));

        txtJobDescription.setColumns(20);
        txtJobDescription.setRows(5);
        jScrollPane1.setViewportView(txtJobDescription);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 178, -1, -1));
        add(spinnerAvailablePositions, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 287, 234, -1));

        btnCreateOpportunity.setText("CREATE OPPORTUNITY");
        btnCreateOpportunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOpportunityActionPerformed(evt);
            }
        });
        add(btnCreateOpportunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 352, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateOpportunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOpportunityActionPerformed
        // TODO add your handling code here:
        String jobTitle = txtJobTitle.getText();
        
        if(jobTitle.isBlank()){
            JOptionPane.showMessageDialog(this, "Job Title is null!");
            return;
        }
        
        
        EmployableSkills selectedSkill = (EmployableSkills) cmbRequiredSkill.getSelectedItem();
        
        if(selectedSkill == null) {
            JOptionPane.showMessageDialog(this, "Required Skill is not selected!");
           return;
        }
        
        String jobDesc = txtJobDescription.getText();
        
        if(jobDesc.isBlank()){
            JOptionPane.showMessageDialog(this, "Job Description is null!");
            return;
        }
        
        String spinnerValue = spinnerAvailablePositions.getValue().toString();
        
        if(spinnerValue.isBlank()) {
           JOptionPane.showMessageDialog(this, "Available Poitions is null!");
           return;
        }
        
        else if(Integer.parseInt(spinnerValue) == 0){
            JOptionPane.showMessageDialog(this, "Available Poitions cannot be set to 0");
            return;
        }
        
        //Add opportunity to master opportunity list at enterprise level
        Opportunity newOpportunity = enterprise.getMasterOpportunityCatalog().createNewOpportunity(currentAuthenticatedUser, jobTitle, selectedSkill, jobDesc, Integer.parseInt(spinnerValue));
        JOptionPane.showMessageDialog(this, "New Opportunity has been successfully created | " + newOpportunity.getOpportunityId());
        
        txtJobTitle.setText("");
        txtJobDescription.setText("");
        spinnerAvailablePositions.setValue(0);
        return;
        
    }//GEN-LAST:event_btnCreateOpportunityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateOpportunity;
    private javax.swing.JComboBox<EmployableSkills> cmbRequiredSkill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinnerAvailablePositions;
    private javax.swing.JTextArea txtJobDescription;
    private javax.swing.JTextField txtJobTitle;
    // End of variables declaration//GEN-END:variables
}
