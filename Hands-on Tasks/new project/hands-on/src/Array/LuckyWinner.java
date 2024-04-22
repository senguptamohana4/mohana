package Array;
import java.util.Scanner;

public class LuckyWinner {
	
	
      public static boolean isPalindrome(int num) {
	        int original = num;
	        int reverse = 0;
	        
	        while (num != 0) {
	            int digit = num % 10;
	            reverse = reverse * 10 + digit;
	            num /= 10;
	        }
	        
	        return original == reverse;
	    }

	    
	    public static boolean isEvenSum(int num) {
	        int sum = 0;
	        
	        while (num != 0) {
	            sum += num % 10;
	            num /= 10;
	        }
	        
	        return sum % 2 == 0;
	    }

	    
	    public static String isLuckyWinner(int ticketNumber) {
	        if (isPalindrome(ticketNumber) && isEvenSum(ticketNumber)) {
	            return "Winner";
	        } else {
	            return "Not a winner";
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the ticket number: ");
	        int ticketNumber = scanner.nextInt();
	        scanner.close();

	        
	        String result = isLuckyWinner(ticketNumber);
	        System.out.println(result);
	    }
	}
