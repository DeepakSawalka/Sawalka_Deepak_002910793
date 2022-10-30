/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDir;
import model.HospitalDirDirectory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.PatientDirectory;
import model.PersonDirectory;
import model.VitalSignsHistory;

/**
 *
 * @author Deepak
 */
public class HospitalAdminDJFrame extends javax.swing.JFrame {

    /**
     * Creates new form HospitalAdminDJFrame
     */
    PatientDirectory patientHistory;
    PersonDirectory personHistory;
    HouseDirectory houseHistory;
    CityDirectory cityHistory;
    HospitalDirectory hospitalHistory;
   CommunityDirectory communityHistory;
    HospitalDirDirectory hospitalDirHistory;
    DoctorDirectory doctorHistory;
    EncounterHistory encounterHistory;
     VitalSignsHistory vitalSignsHistory;
    public HospitalAdminDJFrame(PersonDirectory personHistory,PatientDirectory patientHistory,HouseDirectory houseHistory,CommunityDirectory communityHistory,  CityDirectory cityHistory,HospitalDirectory hospitalHistory,HospitalDirDirectory hospitalDirHistory,DoctorDirectory doctorHistory,EncounterHistory encounterHistory,VitalSignsHistory vitalSignsHistory) {
        initComponents();
        this.personHistory=personHistory;
        this.patientHistory=patientHistory;
        this.houseHistory=houseHistory;
        this.communityHistory=communityHistory;
        this.cityHistory=cityHistory;
        this.hospitalHistory=hospitalHistory;
        this.hospitalDirHistory=hospitalDirHistory;
        this.doctorHistory=doctorHistory;
        this.encounterHistory=encounterHistory;
        this.vitalSignsHistory=vitalSignsHistory;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        contactnocdoclbl = new javax.swing.JLabel();
        experiencecdoctxt = new javax.swing.JTextField();
        specialitycdoclbl = new javax.swing.JLabel();
        submitcdocbtn = new javax.swing.JButton();
        emailidcdoclbl = new javax.swing.JLabel();
        experiencecdoclbl = new javax.swing.JLabel();
        gendercdoclbl = new javax.swing.JLabel();
        namecdoctxt = new javax.swing.JTextField();
        gendercdoctxt = new javax.swing.JTextField();
        emailidcdoctxt = new javax.swing.JTextField();
        contactnocdoctxt = new javax.swing.JTextField();
        namecdoclbl = new javax.swing.JLabel();
        degreecdoctxt = new javax.swing.JTextField();
        degreecdoclbl = new javax.swing.JLabel();
        specialitycdoctxt = new javax.swing.JTextField();
        availabilitycdoclbl = new javax.swing.JLabel();
        availabilitycdoctxt = new javax.swing.JTextField();
        hosnamelbl = new javax.swing.JLabel();
        hosaddresslbl = new javax.swing.JLabel();
        zipcodelbl = new javax.swing.JLabel();
        citylbl = new javax.swing.JLabel();
        hosname = new javax.swing.JLabel();
        hosaddress = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        zipcode = new javax.swing.JLabel();
        nextbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contactnocdoclbl.setText("Contact No");

        specialitycdoclbl.setText("Speciality");

        submitcdocbtn.setText("Submit");
        submitcdocbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitcdocbtnActionPerformed(evt);
            }
        });

        emailidcdoclbl.setText("Email ID");

        experiencecdoclbl.setText("Experience");

        gendercdoclbl.setText("Gender");

        namecdoclbl.setText("Doctor Name");

        degreecdoclbl.setText("Degree");

        availabilitycdoclbl.setText("Availability");

        hosnamelbl.setText("Hospital name");

        hosaddresslbl.setText("Hospital Address");

        zipcodelbl.setText("ZipCode");

        citylbl.setText("City");

        nextbtn.setText(">>");
        nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtnActionPerformed(evt);
            }
        });

        backbtn.setText("<<");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(backbtn)
                        .addGap(307, 307, 307)
                        .addComponent(submitcdocbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextbtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hosaddresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hosnamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hosname, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hosaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namecdoclbl)
                            .addComponent(emailidcdoclbl)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(contactnocdoclbl)
                                .addComponent(contactnocdoctxt, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(emailidcdoctxt))
                            .addComponent(gendercdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gendercdoclbl)
                            .addComponent(namecdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(zipcodelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(degreecdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(citylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(degreecdoclbl)
                            .addComponent(experiencecdoclbl)
                            .addComponent(availabilitycdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(experiencecdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(specialitycdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(specialitycdoclbl)
                            .addComponent(availabilitycdoclbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)))
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hosname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hosnamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zipcodelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hosaddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(citylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hosaddresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(degreecdoclbl)
                    .addComponent(namecdoclbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(degreecdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namecdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specialitycdoclbl)
                    .addComponent(gendercdoclbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gendercdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specialitycdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(experiencecdoclbl)
                    .addComponent(emailidcdoclbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailidcdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(experiencecdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactnocdoclbl)
                    .addComponent(availabilitycdoclbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availabilitycdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactnocdoctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextbtn)
                    .addComponent(backbtn)
                    .addComponent(submitcdocbtn))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitcdocbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitcdocbtnActionPerformed
        // TODO add your handling code here:
        
        String hospitalname= hosname.getText();
        String hospitaladdress= hosaddress.getText();
        String hcity= city.getText();
        int hzipcode= Integer.parseInt(zipcode.getText());
        String name= namecdoctxt.getText();
        String gender= gendercdoctxt.getText();
        String emailid= emailidcdoctxt.getText();
        long contactno= Long.parseLong(contactnocdoctxt.getText());
        String degree= degreecdoctxt.getText();
        String speciality= specialitycdoctxt.getText();
        String experience = (experiencecdoctxt.getText());
        String availability=(availabilitycdoctxt.getText());

        HospitalDir hd =hospitalDirHistory.addNewHospitalDir();
        hd.setHospitalname(hospitalname);
        hd.setHospitaladdress(hospitaladdress);
        hd.setCity(hcity);
        hd.setZipcode(hzipcode);
        hd.setDocname(name);
        hd.setDocgender(gender);
        hd.setDocemailid(emailid);
        hd.setDoccontactno(contactno);
        hd.setDegree(degree);
        hd.setSpeciality(speciality);
        hd.setExperience(experience);
        hd.setAvailability(availability);
        JOptionPane.showMessageDialog(this, "Doctor Registered Successfully!!");

        namecdoctxt.setText("");
        gendercdoctxt.setText("");
        emailidcdoctxt.setText("");
        contactnocdoctxt.setText("");
        degreecdoctxt.setText("");
        specialitycdoctxt.setText("");
        experiencecdoctxt.setText("");
        availabilitycdoctxt.setText("");
    }//GEN-LAST:event_submitcdocbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        
        dispose();
        HospitalCAdminJFrame hospitalCAdminJFrame=new HospitalCAdminJFrame(personHistory, patientHistory,houseHistory,communityHistory,cityHistory,hospitalHistory,hospitalDirHistory,doctorHistory,encounterHistory,vitalSignsHistory);
        hospitalCAdminJFrame.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void nextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnActionPerformed
        // TODO add your handling code here:
        
        
        dispose();
        ViewHospitalAdminJFrame v=new ViewHospitalAdminJFrame(personHistory, patientHistory,houseHistory,communityHistory,cityHistory,hospitalHistory,hospitalDirHistory,doctorHistory,encounterHistory,vitalSignsHistory);
        v.setVisible(true);
        
        
    }//GEN-LAST:event_nextbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availabilitycdoclbl;
    private javax.swing.JTextField availabilitycdoctxt;
    private javax.swing.JButton backbtn;
    public javax.swing.JLabel city;
    private javax.swing.JLabel citylbl;
    private javax.swing.JLabel contactnocdoclbl;
    private javax.swing.JTextField contactnocdoctxt;
    private javax.swing.JLabel degreecdoclbl;
    private javax.swing.JTextField degreecdoctxt;
    private javax.swing.JLabel emailidcdoclbl;
    private javax.swing.JTextField emailidcdoctxt;
    private javax.swing.JLabel experiencecdoclbl;
    private javax.swing.JTextField experiencecdoctxt;
    private javax.swing.JLabel gendercdoclbl;
    private javax.swing.JTextField gendercdoctxt;
    public javax.swing.JLabel hosaddress;
    private javax.swing.JLabel hosaddresslbl;
    public javax.swing.JLabel hosname;
    private javax.swing.JLabel hosnamelbl;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel namecdoclbl;
    private javax.swing.JTextField namecdoctxt;
    private javax.swing.JButton nextbtn;
    private javax.swing.JLabel specialitycdoclbl;
    private javax.swing.JTextField specialitycdoctxt;
    private javax.swing.JButton submitcdocbtn;
    public javax.swing.JLabel zipcode;
    private javax.swing.JLabel zipcodelbl;
    // End of variables declaration//GEN-END:variables








}
