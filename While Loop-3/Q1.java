import java.util.*;

class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number  : ");
        int n= sc.nextInt() ;
        getNumber(n);
    }

    public static void getNumber(int n){
        while(n>0){
            int rem = n%10;
            System.out.println(rem);
            n=n/10;
        }
        
    }
}