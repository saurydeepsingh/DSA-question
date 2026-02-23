import java.util.Arrays;

public class kthminimumarray {
    public static int minimum(int arr[], int key){
        Arrays.sort(arr);
        return arr[key-1];
        
    }
    public static void main(String[] args){
        int arr[]={1,3,5,7,33,55,77,9933};
        int key=3;
        System.out.println(minimum(arr, key));
    }
    
}
