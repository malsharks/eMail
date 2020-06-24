package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPasswordLength = 7;
    private int mailboxCapacity;
    private String alternateEmail;


    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created:" + this.firstName + this.lastName);
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Department: " + this.department);
        System.out.println("Your Password is " + password);
    }


    private String setDepartment() {
        System.out.print("Enter the department:\n1 for Sales\n2 for Instructors\n3 for Technology\n4 for Office\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Teachers";
        } else if (depChoice == 3) {
            return "Tech";
        } else {
            return "";
        }
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int)( Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}



