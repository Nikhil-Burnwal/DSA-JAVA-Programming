/*

Enter the Rows:
5
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1



*/


import java.util.*;
class Q4 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

	
	}
	public static void printPattern(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}

}