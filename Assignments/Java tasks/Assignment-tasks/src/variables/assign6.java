package variables;

public class assign6 {
    public static void bruteForceSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void initializeArray(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100); 
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] array = new int[10]; 
        
        System.out.println("Array before sorting:");
        initializeArray(array); 
        printArray(array); 
        
        bruteForceSort(array); 
        
        System.out.println("Array after sorting:");
        printArray(array); 
    }
}
