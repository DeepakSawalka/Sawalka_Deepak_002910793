/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirDirectory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Deepak Sawalka
 */
public class CityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CityJPanel
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
    public CityJPanel(PersonDirectory personHistory,PatientDirectory patientHistory,HouseDirectory houseHistory,CommunityDirectory communityHistory,  CityDirectory cityHistory,HospitalDirectory hospitalHistory,HospitalDirDirectory hospitalDirHistory,DoctorDirectory doctorHistory,EncounterHistory encounterHistory) {
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
        populateTableCity();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        citypaneldetailstbl = new javax.swing.JTable();
        citynamelbl = new javax.swing.JLabel();
        zipcodelbl = new javax.swing.JLabel();
        updatebtnc = new javax.swing.JButton();
        citynametxt = new javax.swing.JTextField();
        zipcodetxt = new javax.swing.JTextField();

        citypaneldetailstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "City", "Zip Code"
            }
        ));
        jScrollPane1.setViewportView(citypaneldetailstbl);

        citynamelbl.setText("City Name");

        zipcodelbl.setText("Zip Code");

        updatebtnc.setText("Update");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(citynamelbl)
                            .addComponent(zipcodelbl))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(citynametxt)
                            .addComponent(zipcodetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(updatebtnc)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(citynamelbl)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(updatebtnc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(citynametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipcodelbl)
                    .addComponent(zipcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel citynamelbl;
    private javax.swing.JTextField citynametxt;
    private javax.swing.JTable citypaneldetailstbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updatebtnc;
    private javax.swing.JLabel zipcodelbl;
    private javax.swing.JTextField zipcodetxt;
    // End of variables declaration//GEN-END:variables

private void populateTableCity() {
        DefaultTableModel model=(DefaultTableModel) citypaneldetailstbl.getModel();
        model.setRowCount(0);
        
        for (City c : cityHistory.getCityHistory())
        {
            Object[] col=new Object[2];
            col[0]= c;
            col[1]= c.getZipcodec();
            
             
            
            model.addRow(col);
            
        }


}

}
