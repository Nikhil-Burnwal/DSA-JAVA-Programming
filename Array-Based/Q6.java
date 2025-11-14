/*
 * WAJP for below requirements:
Original array: 2 5 4 3 6
resultant array:18 15 16 17 14
 * 
 */
public class Q6 {
    public static void main(String[] args){
        int[] a = {2, 5, 4, 3, 6}; 
        resultantArray(a);  

    }    
    public static void resultantArray(int[] a){
        int sum = 0;
        int[] res = new int[a.length];
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        for(int i=0; i<a.length; i++){
            res[i] = sum -a[i];
            System.out.print(res[i] + " ");
        }
         
        
        
    }
}
