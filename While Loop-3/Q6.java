import java.util.Scanner;

public class Q6 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number  : ");
        int n= sc.nextInt() ;
        int result = getNumber(n);
        System.out.println("Difference between max and min digit is : " + result);
    }

    public static int getNumber(int n){
        int max = n%10;
        int min = n%10;
         int diff = 0;
        while(n>0){
            int rem = n%10;
            if( rem > max){
                max = rem;
                
            }if(rem < min){
                min = rem;
                diff = max - min;
            }
            
             
            n=n/10;
        }
        return diff;
        
    }
}
