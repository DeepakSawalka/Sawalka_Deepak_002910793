/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CityDirectory;
import model.Community;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirDirectory;
import model.HospitalDirectory;
import model.House;
import model.HouseDirectory;

import model.Patient;
import model.PatientDirectory;
import model.PersonDirectory;

/**
 *
 * @author Deepak Sawalka
 */
public class HouseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HouseJPanel
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
    public HouseJPanel(PersonDirectory personHistory,PatientDirectory patientHistory,HouseDirectory houseHistory,CommunityDirectory communityHistory,  CityDirectory cityHistory,HospitalDirectory hospitalHistory,HospitalDirDirectory hospitalDirHistory,DoctorDirectory doctorHistory,EncounterHistory encounterHistory) {
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
        populateTableHouse();
               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        streetnamelblh = new javax.swing.JLabel();
        zipcodelblh = new javax.swing.JLabel();
        citylblh = new javax.swing.JLabel();
        streetnametxth = new javax.swing.JTextField();
        zipcodetxth = new javax.swing.JTextField();
        citytxth = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        housedetailstblh = new javax.swing.JTable();
        createbtnh = new javax.swing.JButton();
        updatebtnh = new javax.swing.JButton();
        deletebtnh = new javax.swing.JButton();
        searchlblh = new javax.swing.JLabel();
        searchtxth = new javax.swing.JTextField();

        streetnamelblh.setText("Street name");

        zipcodelblh.setText("ZipCode");

        citylblh.setText("City");

        housedetailstblh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Street Name", "ZipCode", "City"
            }
        ));
        housedetailstblh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                housedetailstblhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(housedetailstblh);

        createbtnh.setText("Create");
        createbtnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnhActionPerformed(evt);
            }
        });

        updatebtnh.setText("Update");

        deletebtnh.setText("Delete");
        deletebtnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnhActionPerformed(evt);
            }
        });

        searchlblh.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(streetnametxth, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(streetnamelblh))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zipcodelblh)
                                .addGap(167, 167, 167)
                                .addComponent(citylblh)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zipcodetxth, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(citytxth, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(createbtnh)
                                .addContainerGap(81, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updatebtnh)
                            .addComponent(deletebtnh))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(searchlblh)
                .addGap(35, 35, 35)
                .addComponent(searchtxth, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetnamelblh)
                    .addComponent(zipcodelblh)
                    .addComponent(citylblh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetnametxth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipcodetxth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(citytxth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createbtnh))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchtxth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchlblh))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(updatebtnh)
                        .addGap(64, 64, 64)
                        .addComponent(deletebtnh)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createbtnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnhActionPerformed
        // TODO add your handling code here:
        String Streetname= streetnametxth.getText();
        int zipcode= Integer.parseInt(zipcodetxth.getText());
        String city= citytxth.getText();
        
        House h =houseHistory.addNewHouse();
        h.setStreetname(Streetname);
        h.setZipcode(zipcode);
        h.setCity(city);
        JOptionPane.showMessageDialog(this, "House Registered Successfully!!");
      
        
        streetnametxth.setText("");
        zipcodetxth.setText("");
        citytxth.setText("");
    }//GEN-LAST:event_createbtnhActionPerformed

    private void housedetailstblhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_housedetailstblhMouseClicked
        // TODO add your handling code here:
        
        
        int selectedRowIndex=housedetailstblh.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Data not Found");
             return;}
             
          DefaultTableModel model=(DefaultTableModel) housedetailstblh.getModel();
          Community selectedCommunityH=(Community ) model.getValueAt(selectedRowIndex, 0);
         
          
          streetnametxth.setText(selectedCommunityH.getStreetname());
          zipcodetxth.setText(String.valueOf(selectedCommunityH.getZipcode()));
          citytxth.setText(selectedCommunityH.getCity());
    }//GEN-LAST:event_housedetailstblhMouseClicked

    private void deletebtnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnhActionPerformed
        // TODO add your handling code here:
        /* int i=housedetailstblh.getSelectedRow();
        if (i<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
             return;}
             
          DefaultTableModel model=(DefaultTableModel) housedetailstblh.getModel();
          Community selectedCommunity=(Community) model.getValueAt(i, 0);
          
          communityHistoryH.deleteCommunityH(selectedCommunity);
          JOptionPane.showMessageDialog(this, "House Records Deleted Successfully!!");
          populateTableCommH();
         streetnametxth.setText("");
          zipcodetxth.setText("");
           citytxth.setText("");*/
    }//GEN-LAST:event_deletebtnhActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel citylblh;
    private javax.swing.JTextField citytxth;
    private javax.swing.JButton createbtnh;
    private javax.swing.JButton deletebtnh;
    private javax.swing.JTable housedetailstblh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel searchlblh;
    private javax.swing.JTextField searchtxth;
    private javax.swing.JLabel streetnamelblh;
    private javax.swing.JTextField streetnametxth;
    private javax.swing.JButton updatebtnh;
    private javax.swing.JLabel zipcodelblh;
    private javax.swing.JTextField zipcodetxth;
    // End of variables declaration//GEN-END:variables

    private void populateTableHouse() {
        DefaultTableModel model=(DefaultTableModel) housedetailstblh.getModel();
        model.setRowCount(0);
        
        for (House h: houseHistory.getHouseHistory())
        {
            Object[] col=new Object[3];
            col[0]= h;
            col[1]= h.getZipcode();
            col[2]=h.getCity();
            
                   
            model.addRow(col);
            
        }
}}
