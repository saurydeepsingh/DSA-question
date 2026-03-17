// import java.util.Arrays;

// public class largestofarray {
//     public static int largestnumber(int arr[]){
//         Arrays.sort(arr);
//         return arr[arr.length-1];
//     }
//     public static void main(String[] args){
//         int arr[]={1,4,7,9,4,6};
//         System.out.print(largestnumber(arr));
//     }
    
// }

import java.util.Arrays;

public class largestofarray{
    public static int largestis(int arr[] , int key){
        Arrays.sort(arr);

        return arr[arr.length-key];
    }
    public static void main(String[] args){
        int arr[]={1,3,5,7,9};
       System.out.print( largestis(arr, 3));
    }
}