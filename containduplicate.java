import java.lang.reflect.Array;
import java.util.Arrays;

public class containduplicate {
    public static boolean duplicate(int arr[]){
         Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true; 
            }
        }
        System.out.println("all elemnt are not match");
        return false;
        
    }
    public static void main(String[] args){
        int arr[]={1,2,3,1};
        System.out.print(duplicate(arr));
    }
    
}
