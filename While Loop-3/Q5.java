import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number  : ");
        int n= sc.nextInt() ;
        getNumber(n);
    }

    public static void getNumber(int n){
        int max = n%10;

        while(n>0){
            int rem = n%10;
            if( rem>max){
                max = rem;
                System.out.println(max);    
            }
            n=n/10;
        }
        
    }
}
