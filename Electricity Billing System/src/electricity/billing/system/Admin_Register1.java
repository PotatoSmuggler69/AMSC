
package electricity.billing.system;

import java.sql.*;
import javax.swing.*;

public class Admin_Register1 extends javax.swing.JFrame {

   
    public Admin_Register1() {
        initComponents();
    }


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
        Employee_reg_confirm = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UnivRoll.setForeground(new java.awt.Color(87, 12, 148));
        UnivRoll.setText("1760031XXXX");
        UnivRoll.setDisabledTextColor(new java.awt.Color(87, 12, 148));
        UnivRoll.setLabelText("Employee ID");
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
        jLabel1.setText("Employee Registration Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 460, 50));

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
        jPanel1.add(materialButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(87, 12, 148));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 20, 30));

        Employee_reg_confirm.setForeground(new java.awt.Color(87, 12, 148));
        Employee_reg_confirm.setText("All the information are to the best of my knowledge");
        Employee_reg_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee_reg_confirmActionPerformed(evt);
            }
        });
        jPanel1.add(Employee_reg_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 320, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Admin_register_quote.PNG"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 350, 410));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/admin_register_page_image.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -270, 380, 870));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
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
        String employee_id = UnivRoll.getText();
        String full_name = FullName.getText();
        String password = Password.getText();
        String cpassword = CPassword.getText();
        boolean confirm = Employee_reg_confirm.isSelected();
        
        try{
            if(!password.equals(cpassword)) throw new CustomException("Passwords doesnot match");
            if(!confirm) throw new CustomException("Please select confirm and then submit");
            Conn c = new Conn();
            String query = "insert into employee_register(emp_id,full_name,pass,cpass) values('"+employee_id+"','"+full_name+"','"+password+"','"+cpassword+"');";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Employee account Creared Successfully");
            setVisible(false);
            dispose();
            new AdminLogin().setVisible(true);
        }
        catch(CustomException e){
            System.out.println("Error: "+e);
            JOptionPane.showMessageDialog(null,"Error : "+e.getMessage());
        }
        catch(SQLIntegrityConstraintViolationException e){
            String[] message = e.getMessage().split(" ");
            if(message[0].equals("Duplicate") && message[1].equals("entry")){
                System.out.println("Error: "+e);
                JOptionPane.showMessageDialog(null,"User Already Registered : "+employee_id);
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

    private void Employee_reg_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee_reg_confirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Employee_reg_confirmActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Register1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.TextField CPassword;
    private javax.swing.JCheckBox Employee_reg_confirm;
    private com.raven.swing.TextField FullName;
    private com.raven.swing.TextField Password;
    private com.raven.swing.TextField UnivRoll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private necesario.MaterialButton materialButton1;
    // End of variables declaration//GEN-END:variables
}
class CustomException  extends Exception  
{  
    public CustomException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}