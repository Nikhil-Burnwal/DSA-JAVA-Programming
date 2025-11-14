  /*
 
Enter the Rows: 
5
A  
B  C
D  E  F
G  H  I  J
K  L  M  N  O


 */


import java.util.*;

class Q27{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

    }

    public static void printPattern(int n){
        int star = 1;  char c = 'A';
        for(int i = 1; i <= n; i++){
             
            for(int j = 1;j <= star; j++){
                System.out.print(c++ +"  ");
            }
            star++;   ;
            System.out.println();
        }
    }
}