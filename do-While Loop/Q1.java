import java.util.Scanner;
class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the number");
        char c;
        do{
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int fact = getFactorial(n);
            System.out.println("Factorial of "+n+" is: "+fact);
            System.out.println("Do you want to continue press y/Y: ");
            c = sc.next().charAt(0);
        }while(c=='y' || c=='Y');
        System.out.println("programs ends");


    }

    public static int getFactorial(int n){
        int i=1;
        int fact=1;
        
        do{
            fact = fact*i;
            i++;
        }while(i<=n);
        return fact;
    }
}