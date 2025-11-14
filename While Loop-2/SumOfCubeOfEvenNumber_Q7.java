public class SumOfCubeOfEvenNumber_Q7 {

    public static int getSumOfCubeOfEvenNumber(int n){
        int sum = 0;
        int i = 1;
        while(i <= n){
            if(i % 2 == 0){
                sum = sum + (i * i * i);
            }
            i++;
        }
        return sum;
    }
    public static void main(String args[]){
            int sum = getSumOfCubeOfEvenNumber(5);
            System.out.println("Sum of cube of even numbers is :" + sum);
    }
}
