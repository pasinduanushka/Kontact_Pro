package kontact_pro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dumidu
 */
public class Core {

    //Array list for keep contacts details
    public static ArrayList<Contacts> contact = new ArrayList<Contacts>();

    /*
     This method help to keep all user contact of specific
     user in Contact data type arraylist
     */
    public static int dataLoad(String uId) {

        int count = 0;

        try {

            //read text file
            File file = new File("Contacts_" + uId + ".txt");
            Scanner sc = new Scanner(file);

            List<String> list = new ArrayList<String>();

            while (sc.hasNext()) {
                list.add(sc.nextLine());
            }

            for (String str : list) {

                String[] arr = str.split("ÿ");

                Contacts contacts = new Contacts();

                if (uId.equalsIgnoreCase(decrypt(arr[8]))) {
                
                //put data to the arraylist
                contacts.setContactId(arr[0]);
                contacts.setfName(decrypt(arr[1]));
                contacts.setlName(decrypt(arr[2]));
                contacts.setMobileNo(decrypt(arr[3]));
                contacts.setHomeNo(decrypt(arr[4]));
                contacts.setEmail(decrypt(arr[5]));
                contacts.setGender(decrypt(arr[6]));
                contacts.setbDay(decrypt(arr[7]));
                contacts.setUserRef(decrypt(arr[8]));
                contact.add(count, contacts);

                count++;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("No contact found!");
        }

        return count;

    }

    // to get user define arrylist with data
    public ArrayList<Contacts> getList() {
        return contact;
    }

    //to get contact id from contact name
    public static String contactId(String uId, String fullName) {

        int size = dataLoad(uId);

        String contactId = "0";

        String cont = "";
        int count = 1;

        for (int i = 0; i < size; i++) {

            String fName = contact.get(i).getfName();
            String lName = contact.get(i).getlName();

            String contactName = fName + " " + lName;

            if (fullName.equalsIgnoreCase(contactName)) {

                contactId = contact.get(i).getContactId();

            }
        }

        return contactId;

    }

    // encrypt data to secure
    public static String encrypt(String str) {

        int len = str.length();
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < len; i++) {
            String sub = str.substring(i, i + 1);

            char c = sub.charAt(0);
            int val = (int) c;
            int val2 = val - i + 2;

            char[] c2 = Character.toChars(val2);

            String sub2 = String.valueOf(c2);
            list.add(i, sub2);
        }

        String ans = "";
        for (String xyz : list) {

            ans = ans + xyz;
        }

        return ans;
    }

    // decrypt to get encrypted data
    public static String decrypt(String str) {

        int len = str.length();
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < len; i++) {
            String sub = str.substring(i, i + 1);

            char c = sub.charAt(0);
            int val = (int) c;
            int val2 = val + i - 2;

            char[] c2 = Character.toChars(val2);

            String sub2 = String.valueOf(c2);
            list.add(i, sub2);
        }

        String ans = "";
        for (String xyz : list) {

            ans = ans + xyz;
        }

        return ans;
    }

    
    
    /*
    *Data validation
    *Pasindu
    */

    // to check validity of number
    public static boolean validNumber(String num) {

        boolean ans = true;
        int len = num.length();

        for (int i = 0; i < len; i++) {
            String sub = (String) num.subSequence(i, i + 1);

            if (sub.equals("0") || sub.equals("1") || sub.equals("2") || sub.equals("3") || sub.equals("4") || sub.equals("5") || sub.equals("6") || sub.equals("7") || sub.equals("8") || sub.equals("9") || sub.equals("-")) {

                ans = true;
            } else {
                ans = false;
            }

        }

        return ans;
    }

    // to check validity of contact name
    public static boolean validContactName(String name) {

        boolean valid = true;
        int len = name.length();

        if (len < 4) {
            valid = false;
        }

        return valid;
    }

    // check validy of email
    public static boolean validEmail(String email) {

        Pattern pa = Pattern.compile(".+@.+\\.[a-z]+.");
        Matcher ma = pa.matcher(email);
        boolean matchFound = ma.matches();

        return matchFound;
    }

    //check validity of a date
    public static boolean validDate(String date) {

        boolean valid = true;
        String[] arr = date.split("/");

        int yearLen = arr[0].length();
        int monthLen = arr[1].length();
        int dayLen = arr[2].length();

        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        if (yearLen != 4) {
            valid = false;
        } else if (monthLen > 2 || monthLen < 1) {
            valid = false;
        } else if (dayLen > 2 || dayLen < 1) {
            valid = false;
            //31 days months
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

            if (day > 31 || day < 1) {
                valid = false;
            }
            //30 days months
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {

            if (day > 30 || day < 1) {
                valid = false;
            }

            //when february
        } else if (month == 2) {

            //leap year
            if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
                if (day > 29 || day < 1) {
                    valid = false;
                }
                //not leap year
            } else {
                if (day > 28 || day < 1) {
                    valid = false;
                }
            }

        }

        return valid;
    }

    //check validity of a phone number
    public static boolean validPhoneNo(String phone) {

        boolean valid = true;
        int len = phone.length();

        if (len < 10 || len > 20) {
            valid = false;
        }

        return valid;
    }

}
