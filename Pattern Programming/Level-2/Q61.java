/*
 
Enter the Rows: 
5
        A   
      B   B
    C   C   C
  D   D   D   D
E   E   E   E   E

 */


import java.util.*;

class Q61{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

    }
    public static void printPattern(int n){
        int star = 1; int space = n-1;
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= space; j++){
                System.out.print("  ");
            }
            for(int j = 1;j <= star; j++){
                System.out.print( (char)(i+64)+"   ");
            }
            star++;space--;
            System.out.println();
        }
    }
}