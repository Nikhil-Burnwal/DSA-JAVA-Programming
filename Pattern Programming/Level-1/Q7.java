/*

Enter the Rows:
5

*       *
  *   *
    *
  *   *
*       *


*/


import java.util.*;
class Q7 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

	
	}
	public static void printPattern(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(i==j || i+j==n+1){
					System.out.print("* ");
		
				}else{
					System.out.print("  ");

				}
			}
			System.out.println();
		}
	}

}




