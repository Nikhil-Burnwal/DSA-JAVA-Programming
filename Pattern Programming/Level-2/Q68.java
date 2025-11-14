/*
 
Enter the Rows: 
5
        1 
      2 2 2
    3 3 3 3 3
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5

 */


import java.util.*;

class Q68{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

    }
    public static void printPattern(int n){
        int star = 1; int space = n-1;    
        for(int i = 1; i <= n; i++){
            // int num =i+64;
            for(int j = 1;j <= space; j++){
                System.out.printf("  ");
            }
            for(int j = 1;j <= star; j++){
                System.out.print(i +" ");
            }
            star+=2;space--;
            
            System.out.println();
        }
    }
}