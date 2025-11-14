// Enter the Rows: 
// 7
//                   7  
//                6  6  6
//             5  5  5  5  5
//          4  4  4  4  4  4  4
//             3  3  3  3  3
//                2  2  2
//                   1

import java.util.Scanner;

public class Q154 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     	int n=sc.nextInt();
      	printPattern(n);

    }
    public static void printPattern(int n){
        int star = 1; int space = n-1;
        int mid = n/2;
        int num = n;
        for(int i =1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=star; j++){
                System.out.printf( "%-3d", num);
            }
            
             if(i<=mid){
                star+=2; space--;
             } else {
                star-=2; space++;
             }
             num--;
            System.out.println();
        }
    }
}
