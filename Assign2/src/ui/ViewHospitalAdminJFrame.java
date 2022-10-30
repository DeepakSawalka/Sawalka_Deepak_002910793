/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDir;
import model.HospitalDirDirectory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSignsHistory;

/**
 *
 * @author Deepak
 */
public class ViewHospitalAdminJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewHospitalAdminJFrame
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
    public ViewHospitalAdminJFrame(PersonDirectory personHistory,PatientDirectory patientHistory,HouseDirectory houseHistory,CommunityDirectory communityHistory,  CityDirectory cityHistory,HospitalDirectory hospitalHistory,HospitalDirDirectory hospitalDirHistory,DoctorDirectory doctorHistory,EncounterHistory encounterHistory,VitalSignsHistory vitalSignsHistory) {
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
        populateTableVDoc();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewhospdoctordetailstbl = new javax.swing.JTable();
        gendervdoclblhos = new javax.swing.JLabel();
        docnamevdoclblhos = new javax.swing.JLabel();
        emailidvdoclblhos = new javax.swing.JLabel();
        experiencevdoclblhos = new javax.swing.JLabel();
        specialityvdoclblhos = new javax.swing.JLabel();
        degreevdoclblhos = new javax.swing.JLabel();
        contactnovdoclblhos = new javax.swing.JLabel();
        namevdoctxthos = new javax.swing.JTextField();
        gendervdoctxthos = new javax.swing.JTextField();
        degreevdoctxthos = new javax.swing.JTextField();
        emailidvdoctxthos = new javax.swing.JTextField();
        experiencevdoctxthos = new javax.swing.JTextField();
        contactnovdoctxthos = new javax.swing.JTextField();
        specialityvdoctxthos = new javax.swing.JTextField();
        updatevdocbtn = new javax.swing.JButton();
        availabilitylbl = new javax.swing.JLabel();
        availibilitytxthos = new javax.swing.JTextField();
        namelblhosp = new javax.swing.JLabel();
        addresslblhosp = new javax.swing.JLabel();
        zipcodelblhosp = new javax.swing.JLabel();
        citylblhosp = new javax.swing.JLabel();
        nametxthosp = new javax.swing.JTextField();
        addresstxthosp = new javax.swing.JTextField();
        citytxthop = new javax.swing.JTextField();
        zipcodetxthosp = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewhospdoctordetailstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Hospital Address", "Zip code", "City", "Doctor Name", "Gender", "Email Id", "Contact No", "Degree", "Speciality", "Experience", "Availability"
            }
        ));
        viewhospdoctordetailstbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewhospdoctordetailstblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewhospdoctordetailstbl);

        gendervdoclblhos.setText("Gender");

        docnamevdoclblhos.setText("Doctor Name");

        emailidvdoclblhos.setText("Email Id");

        experiencevdoclblhos.setText("Experience");

        specialityvdoclblhos.setText("Speciality");

        degreevdoclblhos.setText("Degree");

        contactnovdoclblhos.setText("Contact No");

        specialityvdoctxthos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialityvdoctxthosActionPerformed(evt);
            }
        });

        updatevdocbtn.setText("Update");
        updatevdocbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatevdocbtnActionPerformed(evt);
            }
        });

        availabilitylbl.setText("Availability");

        namelblhosp.setText("Hospital Name");

        addresslblhosp.setText("Address");

        zipcodelblhosp.setText("ZipCode");

        citylblhosp.setText("City");

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namelblhosp)
                            .addComponent(addresslblhosp)
                            .addComponent(citylblhosp)
                            .addComponent(zipcodelblhosp))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nametxthosp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addresstxthosp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(citytxthop, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipcodetxthosp, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(backbtn)))
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(docnamevdoclblhos)
                        .addGap(26, 26, 26)
                        .addComponent(namevdoctxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(contactnovdoclblhos)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updatevdocbtn)
                            .addComponent(contactnovdoctxthos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(emailidvdoclblhos)
                        .addGap(55, 55, 55)
                        .addComponent(emailidvdoctxthos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(gendervdoclblhos)
                        .addGap(59, 59, 59)
                        .addComponent(gendervdoctxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(degreevdoclblhos)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(experiencevdoclblhos)
                            .addGap(51, 51, 51)
                            .addComponent(experiencevdoctxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(specialityvdoclblhos)
                                .addComponent(availabilitylbl))
                            .addGap(52, 52, 52)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(availibilitytxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(specialityvdoctxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(degreevdoctxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(experiencevdoctxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(experiencevdoclblhos))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(degreevdoctxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(degreevdoclblhos))
                                .addGap(62, 62, 62))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nametxthosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namelblhosp)
                                    .addComponent(docnamevdoclblhos)
                                    .addComponent(namevdoctxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gendervdoclblhos)
                                    .addComponent(gendervdoctxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addresstxthosp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addresslblhosp))
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(citytxthop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(citylblhosp)
                            .addComponent(emailidvdoclblhos)
                            .addComponent(emailidvdoctxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(zipcodetxthosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(zipcodelblhosp))
                                .addGap(230, 230, 230))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(contactnovdoctxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contactnovdoclblhos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(updatevdocbtn)
                                    .addComponent(backbtn))
                                .addGap(90, 90, 90))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(specialityvdoctxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(specialityvdoclblhos))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(availibilitytxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availabilitylbl))
                        .addGap(232, 232, 232))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewhospdoctordetailstblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewhospdoctordetailstblMouseClicked
        // TODO add your handling code here:

        int selectedRowIndex=viewhospdoctordetailstbl.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;}

        DefaultTableModel model=(DefaultTableModel) viewhospdoctordetailstbl.getModel();
        HospitalDir selectedHospitalDir=(HospitalDir) model.getValueAt(selectedRowIndex, 0);

        
        nametxthosp.setText(selectedHospitalDir.getHospitalname());
        addresstxthosp.setText(selectedHospitalDir.getHospitaladdress());
        citytxthop.setText(selectedHospitalDir.getCity());
        zipcodetxthosp.setText(String.valueOf(selectedHospitalDir.getZipcode()));   
        
        namevdoctxthos.setText(selectedHospitalDir.getDocname());
        gendervdoctxthos.setText(selectedHospitalDir.getDocgender());
        emailidvdoctxthos.setText(selectedHospitalDir.getDocemailid());
        contactnovdoctxthos.setText(String.valueOf(selectedHospitalDir.getDoccontactno()));
        experiencevdoctxthos.setText(selectedHospitalDir.getExperience());
        degreevdoctxthos.setText(selectedHospitalDir.getDegree());
        specialityvdoctxthos.setText(selectedHospitalDir.getSpeciality());
        availibilitytxthos.setText(selectedHospitalDir.getAvailability());

    }//GEN-LAST:event_viewhospdoctordetailstblMouseClicked

    private void specialityvdoctxthosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialityvdoctxthosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specialityvdoctxthosActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        dispose();
        HospitalAdminJFrame hospitalAdminJFrame=new HospitalAdminJFrame(personHistory, patientHistory,houseHistory,communityHistory,cityHistory,hospitalHistory,hospitalDirHistory,doctorHistory,encounterHistory,vitalSignsHistory);
        hospitalAdminJFrame.setVisible(true);
        
    }//GEN-LAST:event_backbtnActionPerformed

    private void updatevdocbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatevdocbtnActionPerformed
        // TODO add your handling code here:
         int i=viewhospdoctordetailstbl.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) viewhospdoctordetailstbl.getModel();
        
        
      HospitalDir selectedHospitalDir=(HospitalDir) hospitalDirHistory.getHospitalDirAt(i);
        selectedHospitalDir.setHospitalname(nametxthosp.getText());
        selectedHospitalDir.setHospitaladdress(addresstxthosp.getText());
        selectedHospitalDir.setCity(citytxthop.getText());
        selectedHospitalDir.setZipcode(Integer.parseInt(zipcodetxthosp.getText()));
        
        selectedHospitalDir.setDocname(namevdoctxthos.getText());
        selectedHospitalDir.setDocgender(gendervdoctxthos.getText());
        selectedHospitalDir.setDocemailid(emailidvdoctxthos.getText());
        selectedHospitalDir.setDoccontactno(Long.parseLong(contactnovdoctxthos.getText()));
        selectedHospitalDir.setExperience(experiencevdoctxthos.getText());
         selectedHospitalDir.setDegree(degreevdoctxthos.getText());
        selectedHospitalDir.setSpeciality(specialityvdoctxthos.getText());
        selectedHospitalDir.setAvailability(availibilitytxthos.getText());
  
        
        
        
        if(i<0)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
          
            model.setValueAt(nametxthosp.getText(), i, 0);
            model.setValueAt(addresstxthosp.getText(), i, 1);
            model.setValueAt(zipcodetxthosp.getText(), i, 2);
            model.setValueAt(citytxthop.getText(), i, 3);
            model.setValueAt(namevdoctxthos.getText(), i, 4);
            model.setValueAt(gendervdoctxthos.getText(), i, 5);
            model.setValueAt(emailidvdoctxthos.getText(), i, 6);
            model.setValueAt(String.valueOf(contactnovdoctxthos.getText()), i, 7);
            model.setValueAt(degreevdoctxthos.getText(), i, 8);
            model.setValueAt(specialityvdoctxthos.getText(), i, 9);
            model.setValueAt(experiencevdoctxthos.getText(), i, 10);
            
            
            
            model.setValueAt(availibilitytxthos.getText(), i, 11);
            JOptionPane.showMessageDialog(this, "Details Updated Successfully!!");
            
            
       
    }//GEN-LAST:event_updatevdocbtnActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addresslblhosp;
    private javax.swing.JTextField addresstxthosp;
    private javax.swing.JLabel availabilitylbl;
    private javax.swing.JTextField availibilitytxthos;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel citylblhosp;
    private javax.swing.JTextField citytxthop;
    private javax.swing.JLabel contactnovdoclblhos;
    private javax.swing.JTextField contactnovdoctxthos;
    private javax.swing.JLabel degreevdoclblhos;
    private javax.swing.JTextField degreevdoctxthos;
    private javax.swing.JLabel docnamevdoclblhos;
    private javax.swing.JLabel emailidvdoclblhos;
    private javax.swing.JTextField emailidvdoctxthos;
    private javax.swing.JLabel experiencevdoclblhos;
    private javax.swing.JTextField experiencevdoctxthos;
    private javax.swing.JLabel gendervdoclblhos;
    private javax.swing.JTextField gendervdoctxthos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namelblhosp;
    private javax.swing.JTextField nametxthosp;
    private javax.swing.JTextField namevdoctxthos;
    private javax.swing.JLabel specialityvdoclblhos;
    private javax.swing.JTextField specialityvdoctxthos;
    private javax.swing.JButton updatevdocbtn;
    private javax.swing.JTable viewhospdoctordetailstbl;
    private javax.swing.JLabel zipcodelblhosp;
    private javax.swing.JTextField zipcodetxthosp;
    // End of variables declaration//GEN-END:variables

    private void populateTableVDoc() {
        DefaultTableModel model=(DefaultTableModel) viewhospdoctordetailstbl.getModel();
        model.setRowCount(0);
        
        for (HospitalDir hd  : hospitalDirHistory.getHospitalDirHistory())
        {
            Object[] col=new Object[12];
            col[0]= hd;
            col[1]= hd.getHospitaladdress();
            col[2]=hd.getZipcode();
            col[3]=hd.getCity();
            col[4]=hd.getDocname();
            col[5]= hd.getDocgender();
            col[6]= hd.getDocemailid();
            col[7]= hd.getDoccontactno();
            col[8]= hd.getDegree();
            col[9]= hd.getSpeciality();
            col[10]= hd.getExperience();
            col[11]= hd.getAvailability();
            
           
                   
            model.addRow(col);
            
        }



    }

}
