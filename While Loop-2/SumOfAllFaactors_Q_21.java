public class SumOfAllFaactors_Q_21 {
    
    public static int getSum(int n){
        int sum = 1;
        int i = 2;
        while(i*i <= n){
            if(n % i == 0){
                int fact1 =i;
                int fact2 = n/i;
                if(fact1 != fact2){
                    sum = sum + fact1 + fact2;
                }else{
                    sum += fact1;
                }
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("sum of factors of 14 is : "+ getSum(14));   
    }
}
