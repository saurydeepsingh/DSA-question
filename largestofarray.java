import java.util.Arrays;

public class largestofarray {
    public static int largestnumber(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args){
        int arr[]={1,4,7,9,4,6};
        System.out.print(largestnumber(arr));
    }
    
}
