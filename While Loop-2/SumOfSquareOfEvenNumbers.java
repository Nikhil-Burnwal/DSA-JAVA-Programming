 
    public class SumOfSquareOfEvenNumbers{
      public static int getSum(int n){
        int sum = 0;
        int i = 1;
        while(i <= n){
            if(i % 2 == 0){
                sum += i*i;
            }
            i++;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("the sum of square of even number till 10 is :"+getSum(10));
    }
}

