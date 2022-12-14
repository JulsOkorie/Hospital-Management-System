package hospital.management.system;

import java.sql.DriverManager;
import java.sql.*;
//import Project.ConnectionProvider;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Juliet
 */
public class addDiagnosisInformation extends javax.swing.JFrame {
    public int flag = 0;
    /**
     * Creates new form addDiagnosisInformation
     */
    public addDiagnosisInformation() {
        initComponents();
        doesNotExistLabel.setVisible(false);
        wardTypeLabel.setVisible(false);
        wardTypeComboBox.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pId = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        doesNotExistLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        diagnosisTF = new javax.swing.JTextField();
        medicinesTF = new javax.swing.JTextField();
        symptomsTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        wardTypeLabel = new javax.swing.JLabel();
        wardCheckBox = new javax.swing.JCheckBox();
        wardTypeComboBox = new javax.swing.JComboBox<>();
        SaveBtn = new javax.swing.JButton();
        CloseBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/add new patient background.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/add new patient background.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(780, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pId.setText("Patient ID");
        getContentPane().add(pId, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 64, -1, -1));

        idTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 58, 127, 29));

        SearchBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/search.png"))); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 58, -1, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, 725, 86));

        doesNotExistLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doesNotExistLabel.setForeground(new java.awt.Color(0, 0, 255));
        doesNotExistLabel.setText("Patient ID Does Not Exist!");
        getContentPane().add(doesNotExistLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 116, 203, 37));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Symptoms");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 278, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Diagnosis");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Medicines");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        diagnosisTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(diagnosisTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 340, 260, -1));

        medicinesTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(medicinesTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 400, 260, -1));

        symptomsTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        symptomsTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptomsTFActionPerformed(evt);
            }
        });
        getContentPane().add(symptomsTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 278, 253, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Ward Required?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 282, -1, -1));

        wardTypeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        wardTypeLabel.setText("Type of Ward");
        getContentPane().add(wardTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 347, -1, -1));

        wardCheckBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        wardCheckBox.setText("Yes");
        wardCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(wardCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 278, -1, -1));

        wardTypeComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        wardTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Single", "Duo", " " }));
        getContentPane().add(wardTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 344, 93, -1));

        SaveBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SaveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/save-icon--1.png"))); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 100, -1));

        CloseBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CloseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/Close.png"))); // NOI18N
        CloseBtn.setText("Close");
        CloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CloseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/add new patient background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void symptomsTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptomsTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symptomsTFActionPerformed

    private void wardCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardCheckBoxActionPerformed
        if(wardCheckBox.isSelected()) {
        wardTypeLabel.setVisible(true);
        wardTypeComboBox.setVisible(true);
        }
        else {
            wardTypeLabel.setVisible(false);
            wardTypeComboBox.setVisible(false);
        }
    }//GEN-LAST:event_wardCheckBoxActionPerformed

    
    private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
        setVisible(false); 
    }//GEN-LAST:event_CloseBtnActionPerformed
   
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
       
        String patientID = idTextField.getText();
        try {
            //Connection con = ConnectionProvider.getCon();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospitalmanagementdb","root","");
            st = con.createStatement(); 
            rs = st.executeQuery("select * from PatientTable where PatientID ='"+patientID+"'");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            //if(!rs.first()) 
            if(rs.next()) {
                doesNotExistLabel.setVisible(true);
            }
            else {
                doesNotExistLabel.setVisible(false);
                idTextField.setEditable(false);
                flag = 1;
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

     
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        if(flag == 1) {
            String patientID = idTextField.getText();
            String symptoms = symptomsTF.getText();
            String diagnosis = diagnosisTF.getText();
            String medicines = medicinesTF.getText();
            String wardRequired;
            String wardType;
            if(wardCheckBox.isSelected()) {
                wardRequired = "YES";
                wardType = (String)wardTypeComboBox.getSelectedItem();
            } 
            else {
                wardRequired = "NO";
                wardType = "";
            }
            
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospitalmanagementdb","root","");
                PreparedStatement Add =con.prepareStatement("insert into PatientReportTable values(?,?,?,?,?,?)");
                Add.setString(1, idTextField.getText()); 
                Add.setString(2, symptomsTF.getText());
                Add.setString(3, diagnosisTF.getText());
                Add.setString(4, medicinesTF.getText());
                Add.setString(5, wardCheckBox.getText());
                Add.setString(6, wardTypeComboBox.getSelectedItem().toString());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Patient Record Successfully Updated");
                con.close();
                setVisible(false);
                new addDiagnosisInformation().setVisible(true);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Connection Error"); 
            }
        }
        
        else {
            JOptionPane.showMessageDialog(this, "PatientID Field is empty");
        }
        
    }//GEN-LAST:event_SaveBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDiagnosisInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField diagnosisTF;
    private javax.swing.JLabel doesNotExistLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField medicinesTF;
    private javax.swing.JLabel pId;
    private javax.swing.JTextField symptomsTF;
    private javax.swing.JCheckBox wardCheckBox;
    private javax.swing.JComboBox<String> wardTypeComboBox;
    private javax.swing.JLabel wardTypeLabel;
    // End of variables declaration//GEN-END:variables
}
