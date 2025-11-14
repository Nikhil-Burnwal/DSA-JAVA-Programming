/*
 
Enter the Rows: 
5
        1   
      2   1
    3   2   1   
  4   3   2   1
5   4   3   2   1

 */


import java.util.*;

class Q58{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

    }
    public static void printPattern(int n){
        int star = 1; int space = n-1;  
        for(int i = 1; i <= n; i++){
            int num=i;
            for(int j = 1;j <= space; j++){
                System.out.printf("  ");
            }
            for(int j = 1;j <= star; j++){
                System.out.printf("%-4d", num--);
            }
            star++;space--;
             
            System.out.println();
        }
    }
}