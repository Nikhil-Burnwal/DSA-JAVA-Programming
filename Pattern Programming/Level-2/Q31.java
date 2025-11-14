  /*
 
Enter the Rows: 
5
E  
D  D
C  C  C
B  B  B  B
A  A  A  A  A

 */


import java.util.*;

class Q31{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

    }

    public static void printPattern(int n){
        int star = 1;   int num = 64+n;
        for(int i = 1; i <= n; i++){
            // int num = i+64; 
            for(int j = 1;j <= star; j++){
                System.out.print((char)(num) + "  " );
            }
            star++;  num-- ;
            System.out.println();
        }
    }
}