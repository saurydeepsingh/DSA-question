import java.util.Arrays;

public class practice {
    public static int choco(int arr[], int m){
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-m+1;i++){
            int diff=arr[i+m-1]-arr[i];
            if(diff<mindiff){
                mindiff=diff;
            }
        }
        return mindiff;
    }
    public static void main(String[] args){
        int arr[]={7, 3, 2, 4, 9, 12, 56};
        System.out.println(choco(arr, 3));
    }
    
}
