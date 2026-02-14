import java.util.Arrays;

public class Chocolate_Distribution_Problem {
    public static int distributed(int arr[], int m){
        int diffmax=Integer.MAX_VALUE;
         Arrays.sort(arr);
        for(int i=0;i+m-1<arr.length;i++){
            int diff=arr[i+m-1]-arr[i];

            if(diff<diffmax){
                diffmax=diff;
            }
        }
        return diffmax;
    }
    public static void main(String[] args){
        int arr[]={7, 3, 2, 4, 9, 12, 56};
        System.out.println(distributed(arr, 3));
    }
    
    
}
