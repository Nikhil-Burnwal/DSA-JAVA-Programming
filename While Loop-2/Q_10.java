public class Q_10 {
    public static int getSum(int n){
        int sum=0;
        int i=1;
        while(i<=n){
            sum += i*(i+1);
            i++;
        }
        return sum;
    }
    public static void  main(String[] args) {
        int sum = getSum(100);
        System.out.println("Sum of n(n+1) is :" + sum);
    }
}
