// For the given array of Strings, print the length
// of all the Strings.
import java.util.*;
public class Q2 {
    public static void main(String[] args){
        String[] str = {"Hello", "World", "Java", "Programming", "is", "fun"};
        printStringLengths(str);
    }
    public static void printStringLengths(String[] str){
        for(String s : str){
            System.out.println("Length of \"" + s + "\" is: " + s.length());
        }
    }
}
