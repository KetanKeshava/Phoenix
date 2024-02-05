/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CSREnterprise.WorkArea.CSREmployer;

import business.Business;
import business.CSREnterprise.CSREmployer.CSREmployerProfile;
import business.Enterprise.CSREnterprise;
import business.Enterprise.Enterprise;
import business.Organization.CSREmployerOrganization;
import business.Organization.Organization;
import business.person.Ethnicity;
import business.person.Gender;
import business.person.Person;
import business.userAccounts.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static utils.BusinessUtils.isValidEmail;
import static utils.BusinessUtils.isValidPassword;
import static utils.BusinessUtils.isValidPhoneNumber;

/**
 *
 * @author ketan
 */
public class CSREmployerManageProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CSREmployerManageProfileJPanel
     */
    Business business;
    CSREnterprise enterprise;
    CSREmployerOrganization organization;
    CSREmployerProfile currentAuthenticatedUser;
    UserAccount currentUser;
    
    public CSREmployerManageProfileJPanel(Business business, CSREnterprise enterprise, CSREmployerOrganization organization, CSREmployerProfile currentAuthenticatedUser, UserAccount currentUser) {
        initComponents();
        
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        this.currentAuthenticatedUser = currentAuthenticatedUser;
        this.currentUser = currentUser;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUserName = new javax.swing.JTextField();
        labelFirstName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ethnicityComboBox = new javax.swing.JComboBox<>();
        txtEmailId = new javax.swing.JTextField();
        labelLastName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        spinnerAge = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();

        setBackground(new java.awt.Color(167, 219, 154));

        labelFirstName.setText("First Name:");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setText("User Credentials:");

        jLabel7.setText("Address:");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("CSR Employer Personal Information:");

        labelLastName.setText("Last Name:");

        genderComboBox.setToolTipText("");

        jLabel5.setText("Phone Number:");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Manage Profile");

        labelAge.setText("Age:");

        jLabel13.setText("Password:");

        jLabel6.setText("Email:");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel3.setText("Gender:");

        spinnerAge.setModel(new javax.swing.SpinnerNumberModel(0, 0, 120, 1));

        jLabel4.setText("Ethnicity:");

        jLabel12.setText("User Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(282, 282, 282)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(219, 219, 219)
                            .addComponent(jLabel8))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(labelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(183, 183, 183)
                            .addComponent(jLabel12)
                            .addGap(36, 36, 36)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(labelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(189, 189, 189)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(labelAge)
                            .addGap(29, 29, 29)
                            .addComponent(spinnerAge, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(jLabel3)
                            .addGap(33, 33, 33)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(ethnicityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(jLabel6)
                            .addGap(31, 31, 31)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel7)
                            .addGap(34, 34, 34)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(379, 379, 379)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(49, 49, 49)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel8))
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(labelFirstName))
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel12))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(labelLastName))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel13))
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(labelAge))
                        .addComponent(spinnerAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel3))
                        .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel4))
                        .addComponent(ethnicityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel5))
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel6))
                        .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel7))
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:

        String patientFirstName = txtFirstName.getText();
        String patientLastName = txtLastName.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String emailId = txtEmailId.getText();
        String address = txtAddress.getText();
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        String spinnerValue = spinnerAge.getValue().toString();

        if(spinnerValue.isBlank()) {
            JOptionPane.showMessageDialog(this, "CSR Employers Age is null!");
            return;
        }

        if(patientFirstName.isBlank()) {
            JOptionPane.showMessageDialog(this, "CSR Employers First Name can't be null!");
            return;
        }

        if(patientLastName.isBlank()) {
            JOptionPane.showMessageDialog(this, "CSR Employers Last Name can't be null!");
            return;
        }

        if(phoneNumber.isBlank()) {
            JOptionPane.showMessageDialog(this, "CSR Employers Phone number can't be null!");
            return;
        }

        if(emailId.isBlank()) {
            JOptionPane.showMessageDialog(this, "CSR Employers Email ID can't be null!");
            return;
        }

        if(address.isBlank()) {
            JOptionPane.showMessageDialog(this, "CSR Employers address can't be null!");
            return;
        }

        if(userName.isBlank()){
            JOptionPane.showMessageDialog(this, "CSR Employers User Name can't be null!");
            return;
        }

        if(password.isBlank()){
            JOptionPane.showMessageDialog(this, "CSR Employers password can't be null!");
            return;
        }

        if(!isValidPassword(password)) {
            JOptionPane.showMessageDialog(this, "CSR Employers password is not valid!");
            return;
        }

        if(!isValidEmail(emailId)) {
            JOptionPane.showMessageDialog(this, "CSR Employers Email ID is invalid!");
            return;
        }

        if(!isValidPhoneNumber(phoneNumber)){
            JOptionPane.showMessageDialog(this, "CSR Employers Phone number is invalid!");
            return;
        }

        Gender selectedGender = (Gender) genderComboBox.getSelectedItem();

        if(selectedGender == null) {
            JOptionPane.showMessageDialog(this, "CSR Employers Gender is not selected!");
            return;
        }

        Ethnicity selectedEthnicity = (Ethnicity) ethnicityComboBox.getSelectedItem();

        if(selectedEthnicity == null) {
            JOptionPane.showMessageDialog(this, "CSR Employers Ethnicity is not selected!");
            return;
        }

        boolean isExistingUser = business.isExistingUserByUserName(userName);

        if(isExistingUser) {
            JOptionPane.showMessageDialog(this, "UserName Already exists");
            return;
        }

        //Signup Shelter Supervisor
        Person p = new Person();
        p.setFirstName(patientFirstName);
        p.setLastName(patientLastName);
        p.setGender(selectedGender);
        p.setEthnicity(selectedEthnicity);
        p.setAge(Integer.parseInt(spinnerValue));
        p.setPhoneNum(phoneNumber);
        p.setEmail(emailId);
        p.setAddress(address);

        CSREmployerProfile csrEmployer = new CSREmployerProfile(p);

        Enterprise supportedEnterprise = business.getEnterpriseCatalog().getSupportedEnterpriseGivenRole(csrEmployer.getRole());
        Organization supportedOrganization = supportedEnterprise.getOrganizationGivenRole(csrEmployer.getRole());

        UserAccount csrEmployerUser = supportedOrganization.getOrganizationUserDirectory().createUserAccount(csrEmployer, userName, password, true);

        JOptionPane.showMessageDialog(this, "CSR Employer has been successfully Registered!! | " + csrEmployerUser);

        txtFirstName.setText("");
        txtLastName.setText("");
        txtPhoneNumber.setText("");
        txtEmailId.setText("");
        txtAddress.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        spinnerAge.setValue(0);
    }//GEN-LAST:event_btnRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<Ethnicity> ethnicityComboBox;
    private javax.swing.JComboBox<Gender> genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JSpinner spinnerAge;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}