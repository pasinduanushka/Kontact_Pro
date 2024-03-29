/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontact_pro;

import java.awt.Toolkit;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dumidu
 */
public class Details_Edit extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Details_Edit() {
        initComponents();

    }

    Details_Edit(String uId, String contId) throws ParseException {
        initComponents();
        setIcon(); //set favicon icon
        account.setText(uId); //set account name
        contactID.setText(contId);

        // add months to combo box
        monthBday.addItem("January");
        monthBday.addItem("February");
        monthBday.addItem("March");
        monthBday.addItem("April");
        monthBday.addItem("May");
        monthBday.addItem("June");
        monthBday.addItem("July");
        monthBday.addItem("August");
        monthBday.addItem("Septempber");
        monthBday.addItem("October");
        monthBday.addItem("November");
        monthBday.addItem("December");

        //add days to cobo box
        for (int i = 1; i < 32; i++) {
            dayBday.addItem(i);
        }

        Core core = new Core();
        int size = core.dataLoad(uId);

        ArrayList<Contacts> list = core.getList();

        // print the result searching
        for (int i = 0; i < size; i++) {

            String cId = list.get(i).getContactId();
            if (cId.equals(contId)) {

                fName.setText(list.get(i).getfName());
                lName.setText(list.get(i).getlName());

                mobileNo.setText(list.get(i).getMobileNo());
                homeNo.setText(list.get(i).getHomeNo());
                eMail.setText(list.get(i).getEmail());

                //get selected gender
                if (list.get(i).getGender().equalsIgnoreCase("m")) {
                    maleB.setSelected(true);
                } else {
                    femaleB.setSelected(true);
                }

                String date = list.get(i).getbDay();

                String[] arr = date.split("/");

                int monthindex = Integer.parseInt(arr[1]) - 1;
                int dayindex = Integer.parseInt(arr[2]) - 1;

                yearBday.setText(arr[0]);
                monthBday.setSelectedIndex(monthindex);
                dayBday.setSelectedIndex(dayindex);

            }

        }

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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        account = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        lName = new javax.swing.JTextField();
        mobileNo = new javax.swing.JTextField();
        homeNo = new javax.swing.JTextField();
        eMail = new javax.swing.JTextField();
        maleB = new javax.swing.JRadioButton();
        femaleB = new javax.swing.JRadioButton();
        yearBday = new javax.swing.JTextField();
        monthBday = new javax.swing.JComboBox();
        dayBday = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        contactID = new javax.swing.JLabel();

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
        jLabel4.setBounds(100, 20, 43, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kontact_pro/images/home.png"))); // NOI18N
        jLabel3.setToolTipText("Home");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 20, 40, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kontact_pro/images/bday.png"))); // NOI18N
        jLabel5.setToolTipText("Birthday Reminders");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 20, 50, 43);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kontact_pro/images/help.png"))); // NOI18N
        jLabel6.setToolTipText("Help");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(250, 20, 50, 40);

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

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 140, 130, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Mobile Number");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 190, 130, 30);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Home Number");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(200, 240, 130, 30);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Email Address");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(200, 290, 130, 30);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("Gender");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(200, 340, 130, 30);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setText("Birthday");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(200, 390, 130, 30);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kontact_pro/images/logout.png"))); // NOI18N
        jLabel19.setToolTipText("Log Out");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel19);
        jLabel19.setBounds(840, 40, 40, 40);

        fName.setBackground(new java.awt.Color(203, 221, 253));
        fName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        fName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fNameKeyPressed(evt);
            }
        });
        getContentPane().add(fName);
        fName.setBounds(380, 140, 140, 30);

        lName.setBackground(new java.awt.Color(203, 221, 253));
        lName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lNameKeyPressed(evt);
            }
        });
        getContentPane().add(lName);
        lName.setBounds(540, 140, 160, 30);

        mobileNo.setBackground(new java.awt.Color(203, 221, 253));
        mobileNo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        getContentPane().add(mobileNo);
        mobileNo.setBounds(380, 190, 190, 30);

        homeNo.setBackground(new java.awt.Color(203, 221, 253));
        homeNo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        getContentPane().add(homeNo);
        homeNo.setBounds(380, 240, 190, 30);

        eMail.setBackground(new java.awt.Color(203, 221, 253));
        eMail.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        getContentPane().add(eMail);
        eMail.setBounds(380, 290, 190, 30);

        buttonGroup1.add(maleB);
        maleB.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        maleB.setText("Male");
        getContentPane().add(maleB);
        maleB.setBounds(380, 340, 70, 25);

        buttonGroup1.add(femaleB);
        femaleB.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        femaleB.setText("Female");
        getContentPane().add(femaleB);
        femaleB.setBounds(470, 340, 93, 25);

        yearBday.setBackground(new java.awt.Color(203, 221, 253));
        yearBday.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        yearBday.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yearBdayKeyPressed(evt);
            }
        });
        getContentPane().add(yearBday);
        yearBday.setBounds(380, 390, 90, 30);

        getContentPane().add(monthBday);
        monthBday.setBounds(490, 390, 140, 30);

        dayBday.setToolTipText("");
        getContentPane().add(dayBday);
        dayBday.setBounds(650, 390, 70, 30);

        jButton2.setBackground(new java.awt.Color(182, 203, 252));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton2.setText("Save");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 440, 190, 40);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(590, 190, 300, 160);

        jButton1.setBackground(new java.awt.Color(182, 203, 252));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(510, 440, 170, 40);

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kontact_pro/images/background.png"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(0, 0, 920, 550);
        getContentPane().add(contactID);
        contactID.setBounds(810, 440, 40, 20);

        setSize(new java.awt.Dimension(912, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        //goto add new contact page
        String uId = account.getText();
        Add_Contact add = new Add_Contact(uId);
        add.setLocationRelativeTo(this);
        add.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        //got omain search page
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

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // log out
        JOptionPane.showMessageDialog(this, "Log Out Successfully!", "Log Out", WIDTH);
        Login login = new Login();
        login.setLocationRelativeTo(this);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void fNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fNameKeyPressed
        // when user type more than 20 chars
        if (fName.getText().length() >= 20) {
            fName.setText(fName.getText().substring(0, 19));
        }
    }//GEN-LAST:event_fNameKeyPressed

    private void yearBdayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearBdayKeyPressed
        // when user enter more than 4 numbers

        if (yearBday.getText().length() >= 4) {
            yearBday.setText(yearBday.getText().substring(0, 3));
        }
    }//GEN-LAST:event_yearBdayKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String gender = "";
        String uId = account.getText().toLowerCase(); //get loged user id
        String contact = contactID.getText(); //get current contact details id
        int contID = Integer.parseInt(contact);

        //get data from jfields
        String fname = fName.getText();
        String lname = lName.getText();
        String mobile = mobileNo.getText();
        String home = homeNo.getText();
        String email = eMail.getText();

        String bdYear = yearBday.getText();
        String bdMonth = Integer.toString(monthBday.getSelectedIndex() + 1);
        String bdDay = Integer.toString(dayBday.getSelectedIndex() + 1);

        String fullContactName = fname + "" + lname; //get full name
        String bDay = bdYear + "/" + bdMonth + "/" + bdDay; //create birthday to date format

        // check which radio button is selectes
        boolean male = maleB.isSelected();
        boolean female = femaleB.isSelected();

        //check selected radion button
        if (male) {
            gender = "m";
        } else {
            gender = "f";
        }

        //get the len of data
        int mobileLen = mobile.length();
        int homeLen = home.length();
        int yearLen = bdYear.length();
        int emailLen = email.length();

        
        Core core = new Core();
        int size = core.dataLoad(uId);

        ArrayList<Contacts> list = core.getList();

        //remove old contact data
        list.get(contID).setContactId(contact);
        list.get(contID).setfName(null);
        list.get(contID).setlName(null);
        list.get(contID).setMobileNo(null);
        list.get(contID).setHomeNo(null);
        list.get(contID).setEmail(null);
        list.get(contID).setGender(null);
        list.get(contID).setbDay(null);

        // check contact name already exits
        boolean alreadyExitName = false;
        for (int i = 0; i < size; i++) {

            String fullName = list.get(i).getfName() + list.get(i).getlName();
            if (fullName.trim().equalsIgnoreCase(fullContactName.trim())) {

                alreadyExitName = true;
            }

        }

        // check contact mobile number already exits
        boolean alreadyExitMobile = false;
        for (int i = 0; i < size; i++) {

            if (mobile.equalsIgnoreCase(list.get(i).getMobileNo())) {

                alreadyExitMobile = true;
            }

        }

        // check contact mobile number already exits
        boolean alreadyExitHome = false;
        for (int i = 0; i < size; i++) {

            if (home.equalsIgnoreCase(list.get(i).getHomeNo())) {

                alreadyExitHome = true;
            }

        }

        //data validity check
        if (!(core.validContactName(fname))) {
            JOptionPane.showMessageDialog(this, "First Name should be more 4 characters", "Invalid Input", WIDTH);
        } else if (!(core.validContactName(lname))) {
            JOptionPane.showMessageDialog(this, "Last Name should be more 4 characters", "Invalid Input", WIDTH);
        } else if (alreadyExitName) {
            JOptionPane.showMessageDialog(this, "Contact Name already exits", "Invalid Input", WIDTH);
        } else if (mobileLen < 1 && homeLen < 1) {
            JOptionPane.showMessageDialog(this, "You should enter at least one phone number", "Invalid Input", WIDTH);
        } else if ((mobileLen > 0) && (!(core.validNumber(mobile)))) {
            JOptionPane.showMessageDialog(this, "Mobile number should contain only numbers", "Invalid Input", WIDTH);
        } else if ((mobileLen > 0) && (!(core.validPhoneNo(mobile)))) {
            JOptionPane.showMessageDialog(this, "Invalid Mobile phone number", "Invalid Input", WIDTH);
        } else if ((mobileLen > 0) && (alreadyExitMobile)) {
            JOptionPane.showMessageDialog(this, "Mobile Phone numbers already exits", "Invalid Input", WIDTH);
        } else if ((homeLen > 0) && (!(core.validNumber(home)))) {
            JOptionPane.showMessageDialog(this, "Home number should contain only numbers", "Invalid Input", WIDTH);
        } else if ((homeLen > 0) && (!(core.validPhoneNo(home)))) {
            JOptionPane.showMessageDialog(this, "Invalid Home phone number", "Invalid Input", WIDTH);
        } else if ((homeLen > 0) && (alreadyExitHome)) {
            JOptionPane.showMessageDialog(this, "Home Phone numbers already exits", "Invalid Input", WIDTH);
        } else if ((emailLen > 0) && (!(core.validEmail(email)))) {
            JOptionPane.showMessageDialog(this, "Please input valid email address", "Invalid Input", WIDTH);
        } else if (!(male) && !(female)) {
            JOptionPane.showMessageDialog(this, "Please select the gender", "Invalid Input", WIDTH);
        } else if (yearLen != 4) {
            JOptionPane.showMessageDialog(this, "Please enter valid year", "Invalid Input", WIDTH);
        } else if (!(core.validNumber(bdYear))) {
            JOptionPane.showMessageDialog(this, "Please enter valid year", "Invalid Input", WIDTH);
        } else if (!(core.validDate(bDay))) {
            JOptionPane.showMessageDialog(this, "Please enter valid date", "Invalid Input", WIDTH);
        } else {

            //add new data to the arraylist
            list.get(contID).setfName(fname);
            list.get(contID).setlName(lname);
            list.get(contID).setMobileNo(mobile);
            list.get(contID).setHomeNo(home);
            list.get(contID).setEmail(email);
            list.get(contID).setGender(gender);
            list.get(contID).setbDay(bDay);

            ///////////clear the file////////////////////
            File file = new File("Contacts_" + uId + ".txt");
            PrintWriter writer;
            try {
                writer = new PrintWriter(file);
                writer.print("");
                writer.close();
            } catch (FileNotFoundException ex) {
                System.out.println("file not found");
                Logger.getLogger(Details_Edit.class.getName()).log(Level.SEVERE, null, ex);
            }

            //add array data to new file
            FileWriter fw = null;
            try {
                File flie = new File("Contacts_" + uId + ".txt");
                fw = new FileWriter(flie, true);

                PrintWriter pw = new PrintWriter(fw);

                String all = "";
                for (int i = 0; i < size; i++) {

                    //write new contact details in text file
                    pw.println(list.get(i).getContactId() + "ÿ" + core.encrypt(list.get(i).getfName()) + "ÿ" + core.encrypt(list.get(i).getlName()) + "ÿ" + core.encrypt(list.get(i).getMobileNo()) + "ÿ" + core.encrypt(list.get(i).getHomeNo()) + "ÿ" + core.encrypt(list.get(i).getEmail()) + "ÿ" + core.encrypt(list.get(i).getGender()) + "ÿ" + core.encrypt(list.get(i).getbDay()) + "ÿ" + core.encrypt(uId));

                }
                pw.flush();
                JOptionPane.showMessageDialog(this, "Contact Saved Successfully!", "Saved", WIDTH);

                Search_Main seMain = new Search_Main(uId);
                seMain.setLocationRelativeTo(this);
                seMain.setVisible(true);
                this.dispose();

            } catch (IOException ex) {
                Logger.getLogger(Add_Contact.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Add_Contact.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // goto bday reminder page
        String uId = account.getText();
        BirthDay_Reminder bday = new BirthDay_Reminder(uId);
        bday.setLocationRelativeTo(this);
        bday.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void lNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lNameKeyPressed
        // when user type more than 20 chars

        if (fName.getText().length() >= 20) {
            fName.setText(fName.getText().substring(0, 19));
        }
    }//GEN-LAST:event_lNameKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String uId = account.getText();

            String item = contactID.getText();
            
        User_Details usDetails = new User_Details(uId, item);
        usDetails.setLocationRelativeTo(this);
        usDetails.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Details_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Details_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Details_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Details_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Details_Edit().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel account;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel contactID;
    private javax.swing.JComboBox dayBday;
    private javax.swing.JTextField eMail;
    private javax.swing.JTextField fName;
    private javax.swing.JRadioButton femaleB;
    private javax.swing.JTextField homeNo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lName;
    private javax.swing.JRadioButton maleB;
    private javax.swing.JTextField mobileNo;
    private javax.swing.JComboBox monthBday;
    private javax.swing.JTextField yearBday;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
