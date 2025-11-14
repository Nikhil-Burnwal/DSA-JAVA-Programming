// WAJP to swap two arrays.

import java.util.*;
public class Q1{
    public static void main(String[] args){
        int[] a = {2,3,4,5,6,7};
        int[] b = {10,9,8,7,6,5};
        displayValues(a);
        displayValues(b);

        System.out.println();
        System.out.println();
        int[] temp = a;
        a = b;
        b = temp;
        displayValues(a);
        displayValues(b);
    }
    public static void displayValues(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}