// import java.util.Arrays;

// public class repeatandmissing {
//     public static void repeat(int arr[]){
//         Arrays.sort(arr);
//         int n=arr.length;
//         int sum=0;
//         int repeat=-1;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     repeat=arr[i];
//                 }
//             }
//             sum+=arr[i];
            

//         }
//         int expected =n*(n+1)/2;
//         int missing=expected-(sum-repeat);
//          System.out.println(" the repeating value is"+" "+repeat);
//          System.out.println("the missing value is"+" "+missing);
//     }
//     public static void main(String[] args){
//         int arr[]={1,3,5,7,9,9};
//         repeat(arr);
       
        
//     }
    
// }


import java.util.*;

public class MissingNumbers {

    public static void findMissing(int arr[]){
        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length-1];

        for(int i=min; i<=max; i++){
            boolean found = false;

            for(int j=0; j<arr.length; j++){
                if(arr[j] == i){
                    found = true;
                    break;
                }
            }

            if(!found){
                System.out.println("Missing: " + i);
            }
        }
    }

    public static void main(String[] args){
        int arr[] = {1,3,5,7,9,9};
        findMissing(arr);
    }
}
