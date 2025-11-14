/*


Enter the Rows:
4
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4




*/


import java.util.*;
class Q1 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows: ");
     		int n=sc.nextInt();
      		printPattern(n);

	
	}
	public static void printPattern(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}