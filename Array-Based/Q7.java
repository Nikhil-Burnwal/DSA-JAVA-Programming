/*
 * WAJP for below requirements:
Original array: 2 5 4 3 6
resultant array:360 144 180 240 120
 * 
 */
public class Q7{
    public static void main(String[] args){
        int[] a = {2, 5, 4, 3, 6}; 
        int [] temp = runningSum(a); 
        System.out.println(temp);

    }    
    public static int[]  runningSum(int[] a){
         
        
        for(int i=1; i<a.length; i++){
            a[i] =  a[i] + a[i-1];
        }
        return a;
         
         
        
        
    }
}
