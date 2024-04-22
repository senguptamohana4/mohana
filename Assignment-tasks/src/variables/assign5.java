package variables;

public class assign5 {
    public static int sumArray(int[] arr, int startIndex) {
        
        if (startIndex >= arr.length) {
            return 0;
        }
        
        return arr[startIndex] + sumArray(arr, startIndex + 1);
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = sumArray(array, 0);
        System.out.println("Sum of elements in the array: " + sum);
    }
}