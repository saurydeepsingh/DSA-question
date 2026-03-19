// // bubble sort
// public class sorting {
//     public static void sort(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args){
//         int arr[]={1,4,3,7,9,3,2,5};
//         sort(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
    
// }




// Selection Sort
// public class sorting{
//     public static void selectionsort(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             int minpos=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[minpos]>arr[j]){
//                     minpos=j;

//                 }
//             }
//             // swap
//             int temp=arr[minpos];
//             arr[minpos]=arr[i];
//             arr[i]=temp;
//         }

            
//         }
//     public static void main(String[] args){
//         int arr[]={1,4,2,5,7,4,3};
//         selectionsort(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
        
//     }
// }


// insertion sort
// public class sorting{
//     public static void insertion(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             int curr=arr[i];
//             int prev=i-1;
//             while (prev>=0 && arr[prev] > curr) {
//                 arr[prev+1]= arr[prev];
//                 prev--;
                
//             }
//             arr[prev+1]=curr;
//         }
//     }
//     public static void main(String[] args){
//         int arr[]={1,5,2,8,5,0,6};
//         insertion(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }

//     }
// }