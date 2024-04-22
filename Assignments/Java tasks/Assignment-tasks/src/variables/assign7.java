package variables;

public class assign7 {
    public static int performLinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }
    
    public static void main(String[] args) {
        int[] array = {3, 9, 4, 2, 7, 5};
        int target = 7;
        
        int index = performLinearSearch(array, target);
        
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
