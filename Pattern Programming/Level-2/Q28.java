  /*
 
Enter the Rows: 
5
O  
N  M
L  K  J
I  H  G  F
E  D  C  B  A

 */


import java.util.*;

class Q28{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

    }

    public static void printPattern(int n){
        int star = 1;  int num=n*(n+1)/2 + 64;
        for(int i = 1; i <= n; i++){
             
            for(int j = 1;j <= star; j++){
                System.out.print((char)(num--) + "  " );
            }
            star++;   ;
            System.out.println();
        }
    }
}