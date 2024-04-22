package Array;
import java.util.Scanner;

    public class NsmallestElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array values separated by space:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        // Create an array to store the smallest elements
        int[] smallest = new int[n];

        // Initialize the smallest array with maximum values
        for (int i = 0; i < n; i++) {
            smallest[i] = Integer.MAX_VALUE;
        }

        // Traverse the input array and update the smallest array accordingly
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < smallest[j]) {
                    for (int k = n - 1; k > j; k--) {
                        smallest[k] = smallest[k - 1];
                    }
                    smallest[j] = arr[i];
                    break;
                }
            }
        }

        // Print the first n smallest elements
        System.out.print("First " + n + " smallest elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(smallest[i] + " ");
        }
    }
}
