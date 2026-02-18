public class largest {
    public static int largestin(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
        
    }
    public static void main(String[] args){
        int arr[]={1,2,3,3,5,6,7,8,4,3,6,};
        // for(int i=0;i<arr.length;i++){
            System.out.print(largestin(arr));
        // }

    }

    
}



// public class largest{
//     public static int largestin(int arr[]){
//         int left=0;
//         int right=arr.length-1;
//         while (left<=right) {
//             if(arr[left]<arr[right]){
//                 left=arr[right];
//             }
//         }
//         return left;

//     }
//     public static void main(String[] args){
//         int arr[]={1,2,3,4,5};
//         // for(int i=0;i<arr.length;i++){
//             System.out.print(largestin(arr));
//         // }

//     }
// }
