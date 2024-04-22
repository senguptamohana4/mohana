package Array;
import java.util.Scanner;

public class LongestEvenSequence {
	
	

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        scanner.close();

	        int maxLength = 0;
	        int startIndex = -1;
	        int currentLength = 0;
	        int currentStart = -1;

	        for (int i = 0; i < n; i++) {
	            if (arr[i] % 2 == 0) { 
	                if (currentStart == -1) { 
	                    currentStart = i;
	                }
	                currentLength++;
	                if (currentLength > maxLength) { 
	                    maxLength = currentLength;
	                    startIndex = currentStart;
	                }
	            } else { 
	                currentLength = 0;
	                currentStart = -1;
	            }
	        }

	        System.out.println("Length of the longest running even number sequence: " + maxLength);
	        System.out.println("Starting index of the longest running even number sequence: " + startIndex);
	    }
	}
