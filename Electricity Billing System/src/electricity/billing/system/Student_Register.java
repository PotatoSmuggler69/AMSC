/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package electricity.billing.system;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author abhis
 */
public class Student_Register extends javax.swing.JFrame {

    /**
     * Creates new form Student_Register
     */
    public Student_Register() {
        initComponents();
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
        UnivRoll = new com.raven.swing.TextField();
        CPassword = new com.raven.swing.TextField();
        FullName = new com.raven.swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        Password = new com.raven.swing.TextField();
        materialButton1 = new necesario.MaterialButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SideBar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UnivRoll.setForeground(new java.awt.Color(87, 12, 148));
        UnivRoll.setText("1760031XXXX");
        UnivRoll.setDisabledTextColor(new java.awt.Color(87, 12, 148));
        UnivRoll.setLabelText("University Roll Number");
        UnivRoll.setLineColor(new java.awt.Color(87, 12, 148));
        UnivRoll.setSelectionColor(new java.awt.Color(87, 12, 148));
        UnivRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnivRollActionPerformed(evt);
            }
        });
        jPanel1.add(UnivRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 270, -1));

        CPassword.setForeground(new java.awt.Color(87, 12, 148));
        CPassword.setText("********");
        CPassword.setLabelText("Confirm Password\n");
        CPassword.setLineColor(new java.awt.Color(87, 12, 148));
        CPassword.setSelectionColor(new java.awt.Color(87, 12, 148));
        CPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(CPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 270, -1));

        FullName.setForeground(new java.awt.Color(87, 12, 148));
        FullName.setText("Full Name");
        FullName.setDisabledTextColor(new java.awt.Color(87, 12, 148));
        FullName.setLabelText("Full Name");
        FullName.setLineColor(new java.awt.Color(87, 12, 148));
        FullName.setSelectionColor(new java.awt.Color(87, 12, 148));
        FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameActionPerformed(evt);
            }
        });
        jPanel1.add(FullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 270, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(87, 12, 148));
        jLabel1.setText("Student Registration Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 430, 50));

        Password.setForeground(new java.awt.Color(87, 12, 148));
        Password.setText("********");
        Password.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Password.setLabelText("Password");
        Password.setLineColor(new java.awt.Color(87, 12, 148));
        Password.setSelectionColor(new java.awt.Color(87, 12, 148));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 270, -1));

        materialButton1.setBackground(new java.awt.Color(87, 12, 148));
        materialButton1.setForeground(new java.awt.Color(255, 255, 255));
        materialButton1.setText("Submit");
        materialButton1.setAutoscrolls(true);
        materialButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materialButton1MouseClicked(evt);
            }
        });
        materialButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(materialButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(87, 12, 148));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 20, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/quote_bigger.PNG"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 330, 450));

        SideBar.setForeground(new java.awt.Color(153, 153, 153));
        SideBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pexels-anni-roenkae-14016239.jpg"))); // NOI18N
        SideBar.setText("jLabel2");
        jPanel2.add(SideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(866, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UnivRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnivRollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnivRollActionPerformed

    private void CPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPasswordActionPerformed

    private void FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void materialButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialButton1MouseClicked
        String university_roll = UnivRoll.getText();
        String full_name = FullName.getText();
        String password = Password.getText();
        String cpassword = CPassword.getText();
        
        try{
            if(!password.equals(cpassword)) throw new CustomException2("Passwords doesnot match");  
            Conn c = new Conn();
            String query = "insert into register values ('"+university_roll+"', '"+full_name+"', '"+password+"', '"+cpassword+"')";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Account Creared Successfully");
            setVisible(false);
            dispose();
            new LoginUI().setVisible(true);
        }
        catch(CustomException2 e){
            System.out.println("Error: "+e);
            JOptionPane.showMessageDialog(null,"Error : "+e.getMessage());
        }
        catch(SQLIntegrityConstraintViolationException e){
            String[] message = e.getMessage().split(" ");
            if(message[0].equals("Duplicate") && message[1].equals("entry")){
                System.out.println("Error: "+e);
                JOptionPane.showMessageDialog(null,"User Already Registered : "+university_roll);
            }
            else JOptionPane.showMessageDialog(null,"Error : "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error occured in Student Submit Page : "+e);
            JOptionPane.showMessageDialog(null,"Error : "+e.getMessage());
        }
        
    }//GEN-LAST:event_materialButton1MouseClicked

    private void materialButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.TextField CPassword;
    private com.raven.swing.TextField FullName;
    private com.raven.swing.TextField Password;
    private javax.swing.JLabel SideBar;
    private com.raven.swing.TextField UnivRoll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private necesario.MaterialButton materialButton1;
    // End of variables declaration//GEN-END:variables
}
class CustomException2  extends Exception  
{  
    public CustomException2 (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}