/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package employeegui;

import employeemodel.EmployeeDetails;
import employeemodel.EmployeeHistoryDetails;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.regex.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Deepak Sawalka
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    EmployeeHistoryDetails history;
    byte[] img=null;
    String fileName=null;
    
    public CreateJPanel(EmployeeHistoryDetails history) {
        initComponents();
        this.history = history;
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmpId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPosTitle = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        nameval = new javax.swing.JLabel();
        idval = new javax.swing.JLabel();
        ageval = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        levelval = new javax.swing.JLabel();
        postitleval = new javax.swing.JLabel();
        txtCellNum = new javax.swing.JTextField();
        phoneval = new javax.swing.JLabel();
        emailval = new javax.swing.JLabel();
        emailbtn = new javax.swing.JButton();
        txtEmailId = new javax.swing.JTextField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        lblimg = new javax.swing.JLabel();
        btnimgupload = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("                                                     CREATE EMPLOYEE PROFILE");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Level:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Postion Title:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Date:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Contact No. :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Age:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Team Info:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Email-Id:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Emp Id:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Gender:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Image:");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtEmpId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmpIdKeyReleased(evt);
            }
        });

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        txtLevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLevelKeyReleased(evt);
            }
        });

        txtPosTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosTitleActionPerformed(evt);
            }
        });
        txtPosTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPosTitleKeyReleased(evt);
            }
        });

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        nameval.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N

        idval.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N

        ageval.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        levelval.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N

        postitleval.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N

        txtCellNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCellNumKeyReleased(evt);
            }
        });

        emailbtn.setText("Verify");
        emailbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailbtnActionPerformed(evt);
            }
        });

        btnimgupload.setText("Upload Image");
        btnimgupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimguploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ageval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(savebtn)
                                        .addGap(65, 65, 65))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(btnimgupload)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCellNum, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPosTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(postitleval, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(phoneval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEmailId)
                                        .addGap(86, 86, 86)))
                                .addComponent(emailbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailval, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(levelval, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameval)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel11))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(13, 13, 13)
                                                        .addComponent(idval)))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(ageval, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addComponent(levelval, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel3))
                                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(postitleval)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCellNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneval))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailbtn)
                            .addComponent(emailval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addComponent(btnimgupload)
                        .addGap(14, 14, 14)
                        .addComponent(savebtn)))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        String name= txtName.getText();
        int empId= Integer.parseInt(txtEmpId.getText());
        int age= Integer.parseInt(txtAge.getText());
        String gender=txtGender.getText();
        SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
        String date=sdf.format(dateChooser.getDate());  
        String level=txtLevel.getText();
        String teamInfo= txtTeamInfo.getText();
        String posTitle=txtPosTitle.getText();
        String cellNum= txtCellNum.getText();
        String emailId=txtEmailId.getText();
        Byte[] img= lblimg.;
        
        
        EmployeeDetails ed=history.addNewEmployees();
      
        ed.setName(name);
        ed.setEmpId(empId);
        ed.setAge(age);
        ed.setGender(gender);      
        ed.setDate(date);       
        ed.setLevel(level);
        ed.setTeamInfo(teamInfo);
        ed.setPosTitle(posTitle);
        ed.setCellNum(cellNum);
        ed.setEmailId(emailId);
        ed.setImg(img);
        
        JOptionPane.showMessageDialog(this, "New Employee Profile Created.");
        
        txtName.setText("");
        txtEmpId.setText("");
        txtAge.setText("");
        txtGender.setText("");
        dateChooser.setDate(null);
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPosTitle.setText("");
        txtCellNum.setText("");
        txtEmailId.setText("");
        lblimg.set;
        
    }//GEN-LAST:event_savebtnActionPerformed

    private void txtPosTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosTitleActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        String pattern="^[a-zA-Z]{0,25}$";
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(txtName.getText());
        if(!match.matches()){
            nameval.setText("Naming is incorrect!!");
            
        }
        else{
            nameval.setText(null);
        }
            
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmpIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpIdKeyReleased
        // TODO add your handling code here:
        String pattern="^[0-9]{0,3}$";
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(txtEmpId.getText());
        if(!match.matches()){
            idval.setText("Emp Id is incorrect!!");
            
        }
        else{
            idval.setText(null);
        }
    }//GEN-LAST:event_txtEmpIdKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        String pattern="^[1-9]{0,2}$";
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(txtAge.getText());
        if(!match.matches()){
            ageval.setText("Age is incorrect!!");
            
        }
        else{
           ageval.setText(null);
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtLevelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLevelKeyReleased
        // TODO add your handling code here:
        String pattern="^[I1-9]{0,2}$";
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(txtLevel.getText());
        if(!match.matches()){
            levelval.setText("Level is incorrect!!");
            
        }
        else{
           levelval.setText(null);
        }
        
    }//GEN-LAST:event_txtLevelKeyReleased

    private void txtPosTitleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPosTitleKeyReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
        String pattern="^[a-zA-Z]{0,20}$";
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(txtPosTitle.getText());
        if(!match.matches()){
            postitleval.setText("Please Enter correct Position Title.");
            
        }
        else{
           postitleval.setText(null);
        }
    }//GEN-LAST:event_txtPosTitleKeyReleased

    private void txtCellNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellNumKeyReleased
        // TODO add your handling code here:
        String cell=txtCellNum.getText();
        if(cell.matches("^[0-9]*$") && cell.length()==10){
            txtCellNum.setBackground(Color.green);
        }
        else{
            txtCellNum.setBackground(Color.red);
        }
        
    }//GEN-LAST:event_txtCellNumKeyReleased

    private void emailbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailbtnActionPerformed
        // TODO add your handling code here:
        String email=txtEmailId.getText();
        if(email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+.[a-z]$")){
            JOptionPane.showMessageDialog(this, "Valid E-Mail Id");
             return;
        }
             else{
                    JOptionPane.showMessageDialog(this, "Invalid E-Mail Id");
             return; 
                     }
             
    }//GEN-LAST:event_emailbtnActionPerformed

    private void btnimguploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimguploadActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null); 
        File f= chooser.getSelectedFile();
        fileName=f.getAbsolutePath();
        ImageIcon imgicon=new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_SMOOTH));
        lblimg.setIcon(imgicon);
        try{
            File image =new File(fileName);
            FileInputStream fis = new FileInputStream (image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream () ;
            byte[] buf= new byte[1024];
             for (int readNum; (readNum=fis.read (buf ) ) !=-1;) {
                bos.write (buf, 0, readNum);
             }
                    img=bos.toByteArray () ;
        }
        
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            
        }
    }//GEN-LAST:event_btnimguploadActionPerformed
    
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageval;
    private javax.swing.JButton btnimgupload;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton emailbtn;
    private javax.swing.JLabel emailval;
    private javax.swing.JLabel idval;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel levelval;
    private javax.swing.JLabel nameval;
    private javax.swing.JLabel phoneval;
    private javax.swing.JLabel postitleval;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellNum;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosTitle;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

     

    
}
