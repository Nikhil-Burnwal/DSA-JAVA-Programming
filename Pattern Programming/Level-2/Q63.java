/*
 
Enter the Rows: 
5
        E   
      D   D
    C   C   C
  B   B   B   B
A   A   A   A   A

 */


import java.util.*;

class Q63{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

    }
    public static void printPattern(int n){
        int star = 1; int space = n-1;   int num=n; 
        for(int i = 1; i <= n; i++){
             
            for(int j = 1;j <= space; j++){
                System.out.printf("  ");
            }
            for(int j = 1;j <= star; j++){
                System.out.print((char)(num+64)+"   ");
            }
            star++;space--;
            num--;
             
            System.out.println();
        }
    }
}