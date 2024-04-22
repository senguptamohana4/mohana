package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int size = scanner.nextInt();

       
        char[] array = new char[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.next().charAt(0);
        }

       
        int n = scanner.nextInt();

       
        char result = getLastCharacterOccurrence(array, n);

        
        if (result != '\0') {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }

    public static char getLastCharacterOccurrence(char[] array, int n) {
        Map<Character, Integer> charCount = new HashMap<>();

        
        for (char c : array) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        char lastCharacter = '\0';
        int lastOccurrenceCount = 0;

        
        for (char c : array) {
            if (charCount.get(c) == n) {
                lastCharacter = c;
                lastOccurrenceCount++;
            }
        }

      
        return lastOccurrenceCount > 0 ? lastCharacter : '\0';
    }
}

//Output - 8
//a a b c n s d n
//2
//n
