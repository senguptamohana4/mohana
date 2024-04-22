package Array;
import java.util.Scanner;
public class App10 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		
		System.out.println("Enter the index");
		int index = sc.nextInt();
		
		char result = findCharacterAtIndex(s, index);
        if (result != '\0') {
            System.out.println("Character at index " + index + ": " + result);
        } else {
            System.out.println("Invalid");
        }
    }

    public static char findCharacterAtIndex(String s, int index) {
        if (index < 0) {
            return '\0'; 
        }
        int length = s.length();
        int repeatedLength = length;
        while (repeatedLength <= index) {
            repeatedLength += length; 
        }
        int actualIndex = index % length; 
        return s.charAt(actualIndex);
    }
}

// Output - Enter the string
//Amphibian
//25
//Character at index 25 : a