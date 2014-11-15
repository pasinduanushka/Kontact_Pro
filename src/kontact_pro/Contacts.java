/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontact_pro;

/**
 *
 * @author Dumidu
 */
public class Contacts {

    private String contactId; //contact id
    private String fName; //first name
    private String lName; //last name
    private String mobileNo; //mobile no
    private String homeNo; //home no
    private String email; //email address
    private String gender; //gender
    private String bDay; //birth day
    private String userRef; //user of this contact


    public Contacts() {
    }

    public Contacts(String contactId, String fName, String lName, String mobileNo, String homeNo, String email, String gender, String bDay, String userRef) {
        this.contactId = contactId;
        this.fName = fName;
        this.lName = lName;
        this.mobileNo = mobileNo;
        this.homeNo = homeNo;
        this.email = email;
        this.gender = gender;
        this.bDay = bDay;
        this.userRef = userRef;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getbDay() {
        return bDay;
    }

    public void setbDay(String bDay) {
        this.bDay = bDay;
    }
    
    public String getUserRef() {
        return userRef;
    }

    public void setUserRef(String userRef) {
        this.userRef = userRef;
    }

}
