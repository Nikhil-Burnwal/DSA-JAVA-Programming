  /*
 
Enter the Rows: 
4
1   
3   2
6   5   4
10   9   8   7


 */


import java.util.*;

class Q24{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

    }

    public static void printPattern(int n){
        int star = 1;  int num=1;
        for(int i = 1; i <= n; i++){
             
            for(int j = 1;j <= star; j++){
                System.out.printf(num-- +"   ");
            }
            star++;  num+=2*i+1 ;
            System.out.println();
        }
    }
}