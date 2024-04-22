package variables;

public class StringUtil {
    public static String getMiddleSubstring(String str1, String str2, int length) {
        
        String concatenated = str1.concat(str2);

       StringBuilder reversed = new StringBuilder(concatenated).reverse();

       if (reversed.length() == 0 || length > reversed.length()) {
            return "Invalid input ";
        }

        
        int startIndex = (reversed.length() - length) / 2;

        
        String middleSubstring = reversed.substring(startIndex, startIndex + length);

        return middleSubstring;
    }

    public static void main(String[] args) {
        
        String str1 = "Mohana";
        String str2 = "Sengupta";
        int length= 6;

        String result = getMiddleSubstring(str1, str2, length);
        System.out.println("Middle substring: " + result); 

        
        String emptyStr = "";
        int largeLength = 14;
        String resultEmpty = getMiddleSubstring(emptyStr, str2, largeLength);
        System.out.println("Middle substring with empty string: " + resultEmpty); 
    }
}
