/*
 
Enter the Rows: 
5
        1   
      2   3
    4   5   6
  7   8   9   10
11  12  13  14  15

 */


import java.util.*;

class Q56{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

    }
    public static void printPattern(int n){
        int star = 1; int space = n-1; int num=1;
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= space; j++){
                System.out.printf("  ");
            }
            for(int j = 1;j <= star; j++){
                System.out.printf("%-4d", num++);
            }
            star++;space--;
            System.out.println();
        }
    }
}