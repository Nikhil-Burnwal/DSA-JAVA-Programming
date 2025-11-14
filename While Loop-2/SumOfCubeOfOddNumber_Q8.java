public class SumOfCubeOfOddNumber_Q8 {
     
    public static int getSumOfCubeOfOddNumber(int n){
        int sum = 0;
        int i = 1;
        while(i <= n){
            if(i % 2 != 0){
                sum = sum + (i * i * i);
            }
            i++;
        }
        return sum;
    }
    public static void main(String args[]){
            int sum = getSumOfCubeOfOddNumber(5);
            System.out.println("Sum of cube of even numbers is :" + sum);
    }
}

