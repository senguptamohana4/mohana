package Array;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input string:");
        String input = sc.nextLine();

      
        String employeeID = extractEmployeeID(input);

        
        System.out.println("Extracted Employee ID: " + employeeID);
    }

    public static String extractEmployeeID(String input) {
      
        String regex = "EMP\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

       if (matcher.find()) {
            return matcher.group();
        } else {
            return "No employee ID found in the input";
        }
    }
}
