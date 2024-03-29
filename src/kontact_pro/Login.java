/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontact_pro;

import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static kontact_pro.Registration.decrypt;

/**
 *
 * @author Pasindu
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        signUp = new javax.swing.JButton();
        hint = new javax.swing.JButton();
        passWord = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kontact Pro");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kontact_pro/images/help.png"))); // NOI18N
        jLabel2.setToolTipText("Help");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(820, 450, 43, 50);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("User Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 190, 90, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 240, 90, 30);

        userName.setBackground(new java.awt.Color(203, 221, 253));
        getContentPane().add(userName);
        userName.setBounds(400, 190, 170, 30);

        login.setBackground(new java.awt.Color(182, 203, 252));
        login.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        login.setText("Login");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(340, 300, 180, 40);

        signUp.setBackground(new java.awt.Color(182, 203, 252));
        signUp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        signUp.setText("Sign Up");
        signUp.setToolTipText("Register New User");
        signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        getContentPane().add(signUp);
        signUp.setBounds(250, 385, 180, 25);

        hint.setBackground(new java.awt.Color(182, 203, 252));
        hint.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        hint.setText("Hint");
        hint.setToolTipText("Password Hint");
        hint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintActionPerformed(evt);
            }
        });
        getContentPane().add(hint);
        hint.setBounds(460, 385, 170, 25);

        passWord.setBackground(new java.awt.Color(203, 221, 253));
        getContentPane().add(passWord);
        passWord.setBounds(400, 240, 170, 30);

        jLabel1.setBackground(new java.awt.Color(182, 203, 252));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kontact_pro/images/background.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 910, 540);

        setSize(new java.awt.Dimension(912, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        //open help page
        Help help = new Help();
        help.setLocationRelativeTo(this);
        help.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel2MouseClicked

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        //goto registration page
        Registration reg = new Registration();
        reg.setLocationRelativeTo(this);
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signUpActionPerformed

    private void hintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintActionPerformed

//view password hint
        try {

            //read text file
            File file = new File("UserReg.txt");
            Scanner sc = new Scanner(file);

            List<String> list = new ArrayList<String>();

            while (sc.hasNext()) {
                list.add(sc.nextLine());
            }

            boolean ff = false;
            for (String str : list) {

                String[] arr = str.split("ÿ");
                String usName = decrypt(arr[1].trim());
                
                //check user name already exits
                if (usName.equalsIgnoreCase(userName.getText().trim())) {

                    String usHint = decrypt(arr[4].trim());
                    JOptionPane.showMessageDialog(this, "Hint: " + usHint, "Password: Hint", WIDTH);

                    ff = true;
                    break;
                }

            }

            if (!ff) {
                JOptionPane.showMessageDialog(this, "User Not Found!", "Error", WIDTH);
            }

        } catch (FileNotFoundException ex) {

            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, "No user found!");

        }


    }//GEN-LAST:event_hintActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // user log

        try {
            // read file
            File file = new File("UserReg.txt");
            Scanner sc = new Scanner(file);

            List<String> list = new ArrayList<String>();

            while (sc.hasNext()) {
                list.add(sc.nextLine());
            }

            boolean userCheck = false;
            for (String str : list) {

                String[] arr = str.split("ÿ");
                String usName = decrypt(arr[1].trim());
                String uId = decrypt(arr[1]);
                if (usName.equalsIgnoreCase(userName.getText().trim())) {

                    // user name's password equelity check
                    String usPass = decrypt(arr[2].trim());
                    if (usPass.equals(passWord.getText().trim())) {
                        JOptionPane.showMessageDialog(this, "User Logging successfully!", "Logging", WIDTH);
                        Search_Main seMain = new Search_Main(uId);
                        seMain.setLocationRelativeTo(this);
                        seMain.setVisible(true);
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(this, "Wrong Password!", "Error", WIDTH);

                    }

                    userCheck = true;
                    break;
                }

            }

            if (!userCheck) {
                JOptionPane.showMessageDialog(this, "User Not Found!", "Error", WIDTH);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_loginActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    Thread.sleep(3000);
                } catch (Exception e) {

                }

                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passWord;
    private javax.swing.JButton signUp;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
