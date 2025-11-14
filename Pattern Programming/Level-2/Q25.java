/*
Enter the number of rows :
5

15
13      14
10      11      12
6       7       8       9
1       2       3       4       5
 */


import java.util.*;
public class Q25 {
    
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int n = sc.nextInt();
        printPattern(n);
    }

    public static void printPattern(int n){
          int star = 1;  int num= n*(n+1)/2;
        for(int i = 1; i <= n; i++){
             
            for(int j = 1;j <= star; j++){
                System.out.printf(num++ +"\t");
            }
            star++;  num-=2*i+1 ;
            System.out.println();
        }
    }
}
