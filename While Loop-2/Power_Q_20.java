public class Power_Q_20 {

    public static int getPower(int a, int b){
        int pow = 1;
        int i =1;
        while(i<=b){
            pow = pow*a;
            i++;
        }
        return pow;
    }
    public static void main(String[] args) {
         System.out.println(" 3 to the power of 3  is :" + getPower(3, 3));
    }
}
