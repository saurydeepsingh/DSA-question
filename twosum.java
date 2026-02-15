// import java.util.Arrays;

// public class twosum {
//     public static void twosum(int arr[], int target){
//         // Arrays.sort(arr);
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]+arr[i+1]==target){
//                 System.out.println(i+","+(i+1));
//             }
//         }
//     }
//     public static void main(String[] args){
//         int arr[]={3,3};
//         int target=6;
//         twosum(arr, target);

//     }
    
// }


public class twosum{
    public static int twosum(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+","+j);
                    return 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] ags){
        int arr[]={3,3};
        int target=6;
        System.out.println(twosum(arr, target));
    }
}