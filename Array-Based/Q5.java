
/*
 * For the given array of Strings, print and count
     all the Strings which has even number of
    characters.
 */
import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        String[] str = { "Hello", "World", "Java", "Programming", "is", "fun" };
        EvenStringLengths(str);
    }

    public static void EvenStringLengths(String[] str) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() % 2 == 0) {
                System.out.println("Even Length String: " + str[i]);
                count++; 
            }
        }
        System.out.println("Total Even Length Strings are : " + count);
    }
}
