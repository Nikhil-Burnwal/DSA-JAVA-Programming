  /*
 
Enter the Rows: 
5
A  
B  B
C  C  C
D  D  D  D
E  E  E  E  E

 */


import java.util.*;

class Q29{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

    }

    public static void printPattern(int n){
        int star = 1;   
        for(int i = 1; i <= n; i++){
            int num = i+64; 
            for(int j = 1;j <= star; j++){
                System.out.print((char)(num) + "  " );
            }
            star++;   ;
            System.out.println();
        }
    }
}