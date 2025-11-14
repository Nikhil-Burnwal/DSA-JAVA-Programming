/*
 
Enter the Rows: 
7
            1 
          1 0 
        1 0 1 
      1 0 1 0
    1 0 1 0 1
  1 0 1 0 1 0
1 0 1 0 1 0 1

 */


import java.util.*;

class Q36{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

    }
    public static void printPattern(int n){
        int star = 1; int space = n-1;
        for(int i = 1; i <= n; i++){
            // int num=i;
            for(int j = 1;j <= space; j++){
                System.out.print("  ");
            }
            for(int j = 1;j <= star; j++){
                System.out.print(j%2+" ");
            }
            star++;space--;
            System.out.println();
        }
    }
}
