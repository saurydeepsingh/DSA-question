import java.util.*;
public class landS  {
    public static int min(int arr[]){
        int maximun=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(minimum>arr[i]){
                minimum=arr[i];
            }
        }
        return minimum;
    }
    public static int max(int arr[]){
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(maximum<arr[i]){
                maximum=arr[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        
       int arr[]={1,4,3,5,8,6};
    
        System.out.println(min(arr));
         System.out.println(max(arr));    
    }
}