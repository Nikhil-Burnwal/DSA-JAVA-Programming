public class Q_14_15 {

    //Question number 14
    // public static double getSum(int n){
    //     double sum=0;
    //     int i=1;
    //     while(i<=n){
    //         if(i%2==0){
    //             sum += 1.0/(i);
    //         }
    //         i++;
    //     }
    //     return sum;
    // }
    // public static void main(String args[]){
    //         double sum = getSum(100);
    //         System.out.println("Sum of 1/n is :" + sum);
    // }

    //Question number 15
    public static double getSum(int n){
        double sum=0;
        int i=1;
        while(i<=n){
            if(i%2!=0){
                sum += 1.0/(i);
            }
            i++;
        }
        return sum;
    }
    public static void main(String args[]){
            double sum = getSum(100);
            System.out.println("Sum of 1/n is :" + sum);
    }
    
}
