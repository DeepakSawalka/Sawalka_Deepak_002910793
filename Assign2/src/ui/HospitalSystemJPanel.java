/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.Hospital;
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
public class HospitalSystemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalSystemJPanel
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
    public HospitalSystemJPanel(PersonDirectory personHistory,PatientDirectory patientHistory,HouseDirectory houseHistory,CommunityDirectory communityHistory,  CityDirectory cityHistory,HospitalDirectory hospitalHistory,HospitalDirDirectory hospitalDirHistory,DoctorDirectory doctorHistory,EncounterHistory encounterHistory,VitalSignsHistory vitalSignsHistory) {
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
        populateTableHosSystem();
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
        namelblhos = new javax.swing.JLabel();
        addresslblhos = new javax.swing.JLabel();
        zipcodelblhos = new javax.swing.JLabel();
        citylblhos = new javax.swing.JLabel();
        nametxthos = new javax.swing.JTextField();
        addresstxthos = new javax.swing.JTextField();
        zipcodetxthos = new javax.swing.JTextField();
        citytxthos = new javax.swing.JTextField();
        createbtnhos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitaldetailstbl = new javax.swing.JTable();
        updatebtnhos = new javax.swing.JButton();
        searchbtnhos = new javax.swing.JLabel();
        searchtxthos = new javax.swing.JTextField();
        deletebtnhos = new javax.swing.JButton();

        namelblhos.setText("Name");

        addresslblhos.setText("Address");

        zipcodelblhos.setText("ZipCode");

        citylblhos.setText("City");

        createbtnhos.setText("Create");
        createbtnhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnhosActionPerformed(evt);
            }
        });

        hospitaldetailstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Hospital Address", "ZipCode", "City"
            }
        ));
        hospitaldetailstbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hospitaldetailstblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hospitaldetailstbl);

        updatebtnhos.setText("Update");
        updatebtnhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnhosActionPerformed(evt);
            }
        });

        searchbtnhos.setText("Search");

        searchtxthos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxthosActionPerformed(evt);
            }
        });
        searchtxthos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxthosKeyReleased(evt);
            }
        });

        deletebtnhos.setText("Delete");
        deletebtnhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnhosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(createbtnhos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updatebtnhos)
                            .addGap(62, 62, 62)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(deletebtnhos)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(zipcodelblhos)
                                        .addComponent(citylblhos))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(citytxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(192, 192, 192))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(zipcodetxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(49, 49, 49))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(searchbtnhos)
                            .addGap(55, 55, 55)
                            .addComponent(searchtxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(289, 289, 289)))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namelblhos)
                    .addComponent(addresslblhos))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addresstxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelblhos)
                    .addComponent(zipcodelblhos)
                    .addComponent(nametxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipcodetxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addresslblhos)
                    .addComponent(addresstxthos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(citylblhos)
                        .addComponent(citytxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createbtnhos)
                    .addComponent(updatebtnhos)
                    .addComponent(deletebtnhos))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchtxthos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtnhos))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createbtnhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnhosActionPerformed
        // TODO add your handling code here:
        String hospitalname= nametxthos.getText();
        String hospitaladdress= addresstxthos.getText();
        String hcity= citytxthos.getText();
        int hzipcode= Integer.parseInt(zipcodetxthos.getText());

        Hospital hos =hospitalHistory.addNewHospital();

        hos.setHospitalname(hospitalname);
        hos.setHospitaladdress(hospitaladdress);
        hos.setCity(hcity);
        hos.setZipcode(hzipcode);
        JOptionPane.showMessageDialog(this, "Registered Successfully!!");

    }//GEN-LAST:event_createbtnhosActionPerformed

    private void hospitaldetailstblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hospitaldetailstblMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex=hospitaldetailstbl.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Data not Found");
            return;}

        DefaultTableModel model=(DefaultTableModel) hospitaldetailstbl.getModel();
        Hospital selectedHospital=(Hospital ) model.getValueAt(selectedRowIndex, 0);

        nametxthos.setText(selectedHospital.getHospitalname());
        addresstxthos.setText(selectedHospital.getHospitaladdress());
        zipcodetxthos.setText(String.valueOf(selectedHospital.getZipcode()));
        citytxthos.setText(selectedHospital.getCity());
    }//GEN-LAST:event_hospitaldetailstblMouseClicked

    private void updatebtnhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnhosActionPerformed
        // TODO add your handling code here:

        int i=hospitaldetailstbl.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) hospitaldetailstbl.getModel();

        Hospital selectedHospital=(Hospital) hospitalHistory.getHospitalAt(i);

        selectedHospital.setHospitalname(nametxthos.getText());
        selectedHospital.setHospitaladdress(addresstxthos.getText());
        selectedHospital.setZipcode(Integer.parseInt(zipcodetxthos.getText()));
        selectedHospital.setCity(citytxthos.getText());

        if(i<0)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }

        model.setValueAt(nametxthos.getText(), i, 0);
        model.setValueAt(addresstxthos.getText(), i, 1);
        model.setValueAt(zipcodetxthos.getText(), i, 2);
        model.setValueAt(citytxthos.getText(), i, 3);

        JOptionPane.showMessageDialog(this, "Details Updated Successfully!!");
    }//GEN-LAST:event_updatebtnhosActionPerformed

    private void searchtxthosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxthosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxthosActionPerformed

    private void searchtxthosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxthosKeyReleased
        // TODO add your handling code here:

        DefaultTableModel model=(DefaultTableModel) hospitaldetailstbl.getModel();
        TableRowSorter<DefaultTableModel> rowsort=new TableRowSorter<DefaultTableModel>(model);
        hospitaldetailstbl.setRowSorter(rowsort);
        rowsort.setRowFilter(RowFilter.regexFilter(searchtxthos.getText().trim()));
    }//GEN-LAST:event_searchtxthosKeyReleased

    private void deletebtnhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnhosActionPerformed
        // TODO add your handling code here:
        
        int i=hospitaldetailstbl.getSelectedRow();
        if (i<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
             return;}
             
          DefaultTableModel model=(DefaultTableModel) hospitaldetailstbl.getModel();
          Hospital selectedHospital=(Hospital) hospitalHistory.getHospitalAt(i);
          int response=JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
          if(response==JOptionPane.YES_OPTION){
             
          hospitalHistory.deleteHospital(selectedHospital);
          JOptionPane.showMessageDialog(this, "Hospital Records Deleted Successfully!!");
          }
          else {
              JOptionPane.showMessageDialog(this, "OK!!");
          }
          populateTableHosSystem();
         nametxthos.setText("");
          addresstxthos.setText("");
           zipcodetxthos.setText("");
            citytxthos.setText("");
    }//GEN-LAST:event_deletebtnhosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addresslblhos;
    private javax.swing.JTextField addresstxthos;
    private javax.swing.JLabel citylblhos;
    private javax.swing.JTextField citytxthos;
    private javax.swing.JButton createbtnhos;
    private javax.swing.JButton deletebtnhos;
    private javax.swing.JTable hospitaldetailstbl;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namelblhos;
    private javax.swing.JTextField nametxthos;
    private javax.swing.JLabel searchbtnhos;
    private javax.swing.JTextField searchtxthos;
    private javax.swing.JButton updatebtnhos;
    private javax.swing.JLabel zipcodelblhos;
    private javax.swing.JTextField zipcodetxthos;
    // End of variables declaration//GEN-END:variables


private void populateTableHosSystem() {
        DefaultTableModel model=(DefaultTableModel) hospitaldetailstbl.getModel();
        model.setRowCount(0);
        
        for (Hospital h : hospitalHistory.getHospitalHistory())
        {
            Object[] col=new Object[12];
            col[0]= h;
            col[1]= h.getHospitaladdress();
            col[2]= h.getZipcode();
            col[3]= h.getCity();
            
           
                   
            model.addRow(col);
            
        }

}




}
