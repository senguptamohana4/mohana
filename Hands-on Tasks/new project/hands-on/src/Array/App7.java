package Array;

import java.util.Arrays;

public class App7 {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int startIndex = 2;
        int endIndex = 5;

        int[] slicedArray = sliceArray(originalArray, startIndex, endIndex);
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Sliced Array: " + Arrays.toString(slicedArray));
    }

    public static int[] sliceArray(int[] array, int startIndex, int endIndex) {
        
        int size = endIndex - startIndex + 1;

        int[] slicedArray = new int[size];

        
        for (int i = 0; i < size; i++) {
            slicedArray[i] = array[startIndex + i];
        }

        return slicedArray;
    }
}