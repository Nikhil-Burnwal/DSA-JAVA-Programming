/*

Enter the Rows:
11
* * * * * * * * * * *
* *       *       * *
*   *     *     *   *
*     *   *   *     *
*       * * *       *
* * * * * * * * * * *
*       * * *       *
*     *   *   *     *
*   *     *     *   *
* *       *       * *
* * * * * * * * * * *
**
**
**
**
**
**
**
**
**
**
**


*/


import java.util.*;
class Q10 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

	
	}
	public static void printPattern(int n){
		if(n%2==0){
			System.out.println("Pattern is not possible for Even Row!");
			return;
		}
		int mid = n/2+1;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(i==mid || j==mid ||
				   i==1 || i == n || j == 1 || j == n || 
				   i == j || i+j == n+1
					
				){
					System.out.print("* ");
		
				}else{
					System.out.print("  ");

				}
			}
			System.out.println();
		}
		for(int i = 1; i<=n; i++){
			System.out.println("**");
		}

	}

}





 