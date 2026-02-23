import java.util.Arrays;

public class l {
    public static int larg(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,63,2,4,6};
        System.out.print(larg(arr));
    }
    
}
