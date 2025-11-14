   /*
 
Enter the Rows: 
5
            O  
         M  N
      J  K  L
   F  G  H  I
A  B  C  D  E 

 */


import java.util.*;

class Q50{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

    }

    public static void printPattern(int n){
        int star = 1;  int space = n-1;
        int num=n*(n+1)/2+64 ; 
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= space; j++){
                System.out.print("   ");
            }
            for(int j = 1;j <= star; j++){
                System.out.print((char)num++ +"  ");
            }
            star++;space-- ; 
            num -= 2*i+1 ;
            
            System.out.println();
        }
    }
}