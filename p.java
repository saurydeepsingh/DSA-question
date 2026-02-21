import java.util.Arrays;

public class p {
    public static int klargest(int arr[], int key){
        Arrays.sort(arr);
        return arr[arr.length-key];
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,50,6};
        int key=3;
        System.out.println(klargest(arr, key));
    }
    
}
