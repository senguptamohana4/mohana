package Array;
import java.util.Scanner;
import java.util.Arrays;

public class MaxProductNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array values separated by space:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int maxProduct = -1;

        Arrays.sort(arr); // Sorting the array to ensure larger numbers come later

        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    int product = arr[i] * arr[j];
                    if (product == arr[i] || product == arr[j]) {
                        maxProduct = Math.max(maxProduct, arr[i]);
                        break; // No need to continue checking for this number
                    }
                }
            }
            if (maxProduct != -1) // If a valid product is found, no need to check further
                break;
        }

        System.out.println("Maximum product number: " + maxProduct);
    }
}
		
	


