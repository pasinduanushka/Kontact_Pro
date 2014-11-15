/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontact_pro;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Pasindu
 */
public class Log_Help extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Log_Help() {
        initComponents();

    }

    Log_Help(String uId) {
        initComponents();
        setIcon();
        account.setText(uId);

        //set help text
        jLabel2.setText("<html><body>"
                + "<h2>Add contacts</h2>"
                + "<p>You can easily add new contacts using the Add new contact icon at the "
                + "<br>top of the main page. Enter correct details in the "
                + "<br>fields and click on the save button.</p><br><hr>"
                + "<h2>Search</h2>"
                + "<p>You can search your contact from the search bar on the main"
                + "<br> page. When you start typing the name, you can see your contact"
                + "<br> comes to the list below the search bar. By selecting the "
                + "<br>contact, you can view the contact details.</p><br><hr>"
                + "<h2>Edit or Delete contacts</h2>"
                + "<p>Go to the contact details page that you wish to edit or "
                + "<br>delete. By clicking edit icon on the contact page, you can "
                + "<br>update details of the contact and if you wish to delete the "
                + "<br>contact, you can click on the delete icon on the contact page.</p><br><hr>"
                + "<h2>Birthday Reminder</h2>"
                + "<p>You can simply see today’s birthdays by clicking the birthday"
                + "<br> icon on the bottom of the page. If the list is empty, there are"
                + "<br> no birthdays on today.</p><br><hr>"
                + "<h2>Navigating</h2>"
                + "<p>You can simply navigate within pages by clicking the Home, "
                + "<br>Add new contact, Birthday Reminders or help button that appears "
                + "<br>in the bottom of the page.</p><br>"
                + "</body></html>");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        account = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kontact Pro");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kontact_pro/images/addnew.png"))); // NOI18N
        jLabel4.setToolTipText("Add New Contact");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 15, 43, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kontact_pro/images/home.png"))); // NOI18N
        jLabel3.setToolTipText("Home");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 15, 40, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kontact_pro/images/bday.png"))); // NOI18N
        jLabel5.setToolTipText("Birthday Reminders");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 15, 50, 43);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kontact_pro/images/help.png"))); // NOI18N
        jLabel6.setToolTipText("Help");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(250, 15, 50, 40);

        account.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        account.setForeground(new java.awt.Color(255, 255, 255));
        account.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        account.setToolTipText("");
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
        });
        getContentPane().add(account);
        account.setBounds(760, 0, 130, 40);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kontact_pro/images/logout.png"))); // NOI18N
        jLabel12.setToolTipText("Log Out");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(840, 40, 40, 40);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jScrollPane1.setViewportView(jLabel2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 120, 560, 340);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kontact_pro/images/background.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 910, 540);

        setSize(new java.awt.Dimension(912, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        //add new contact page
        String uId = account.getText();
        Add_Contact add = new Add_Contact(uId);
        add.setLocationRelativeTo(this);
        add.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        //goto search page
        String uId = account.getText();
        Search_Main seMain = new Search_Main(uId);
        seMain.setLocationRelativeTo(this);
        seMain.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        //goto help page
        String uId = account.getText();
        Log_Help help = new Log_Help(uId);
        help.setLocationRelativeTo(this);
        help.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_accountMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // log out
        JOptionPane.showMessageDialog(this, "Log Out Successfully!", "Log Out", WIDTH);
        Login login = new Login();
        login.setLocationRelativeTo(this);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // goto the bday reminder page
        String uId = account.getText();
        BirthDay_Reminder bday = new BirthDay_Reminder(uId);
        bday.setLocationRelativeTo(this);
        bday.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Log_Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_Help().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel account;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
