package variables;

import java.util.Arrays;

public class sliceArray {
    public static int[] SliceArray(int[] arr, int start, int end) {
       
        if (start < 0 || end > arr.length || start >= end) {
            return null;
        }

        
        return Arrays.copyOfRange(arr, start, end);
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int startIndex = 2;
        int endIndex = 7;
        int[] slicedArray = SliceArray(myArray, startIndex, endIndex);

        
        System.out.println(Arrays.toString(slicedArray)); 
    }
}