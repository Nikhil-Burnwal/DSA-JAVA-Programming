
// For the given array of Strings, print the largest
// ]string.
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        String[] str = { "Hello", "World", "Java", "Programming", "is", "fun" };
        largestStringLengths(str);
    }

    public static void largestStringLengths(String[] str) {
        int maxLength = Integer.MIN_VALUE;
        String largestString = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > maxLength) {
                maxLength = str[i].length();
                largestString = str[i];
                 
            }
        }
        System.out.println("The largest String among the given strings is: " +largestString+ "\n and its length is : " + maxLength);
    }
}
