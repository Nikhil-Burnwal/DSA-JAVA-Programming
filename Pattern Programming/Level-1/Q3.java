/*

Enter the Rows:
5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5




*/


import java.util.*;
class Q3 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

	
	}
	public static void printPattern(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}