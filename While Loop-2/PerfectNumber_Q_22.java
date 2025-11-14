public class PerfectNumber_Q_22 {

    public static boolean isPerfect(int n){
        int sum = 0;
        int i = 1;
        while(i*i <= n){
            if(n % i == 0){
                int fact1 = i;
                int fact2 = n/i;
                if(fact1 != fact2){
                    sum = sum + fact1 + fact2;
                }else{
                    sum += fact1;
                }
            }
            i++;
        }
        return sum == n
    }
    public static void main(String[] args) {
        
    }
}
