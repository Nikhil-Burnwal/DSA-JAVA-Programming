public class Factorial_Q_19 {

    public static int getFactorial(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("factorial of 5 is :" + getFactorial(5));
    }
}
