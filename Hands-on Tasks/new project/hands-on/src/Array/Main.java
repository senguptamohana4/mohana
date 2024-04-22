package Array;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Validate Website");
        System.out.println("2. Validate Mobile number");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter the Website to be validated:");
            sc.nextLine(); // Consume newline
            String website = sc.nextLine();
            if (validateWebsite(website)) {
                System.out.println("Website is valid");
            } else {
                System.out.println("Website is invalid");
            }
        } else if (choice == 2) {
            System.out.println("Enter the Mobile no. to be validated:");
            sc.nextLine(); // Consume newline
            String mobileNo = sc.nextLine();
            if (validateMobile(mobileNo)) {
                System.out.println("Mobile number is valid");
            } else {
                System.out.println("Mobile number is invalid");
            }
        } else {
            System.out.println("Invalid choice");
        }
    }

    public static boolean validateWebsite(String website) {
        String regex = "^(https?://)(www\\.)?([a-zA-Z]+)\\.([a-zA-Z]{2,6})(\\.[a-zA-Z]{2,6})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(website);
        return matcher.matches();
    }

    public static boolean validateMobile(String mobileNo) {
        String regex = "^\\+91\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNo);
        return matcher.matches();
    }
}