public class Q_11 {
    public static long getSum(long n){
        long sum=0;
        long i=1;
        while(i<=n){
            sum += i*(i+1)*(i+1);
            i++;
        }
        return sum;
    }
    public static void  main(String[] args) {
        long sum = getSum(100);
        System.out.println("Sum of n(n+1)^2 is :" + sum);
    }
}
