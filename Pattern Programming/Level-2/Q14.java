/*
Write a program to print the following pattern for the given N number of rows.
Enter the Rows: 
5
* * * * * 
* * * * 
* * * 
* * 
* 

 */


import java.util.*;

class Q14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

    }
    public static void printPattern(int n){
        int star = n;
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= star; j++){
                System.out.print("* ");
            }
            star--;
            System.out.println();
        }
    }
}
