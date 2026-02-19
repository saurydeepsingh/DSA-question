import java.util.Arrays;

public class repeatandmissing {
    public static void repeat(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
        int sum=0;
        int repeat=0;;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    repeat=arr[i];
                }
            }
            sum+=arr[i];
            

        }
        int expected =n*(n+1)/2;
        int missing=expected-(sum-repeat);
         System.out.println(" the repeating value is"+" "+repeat);
         System.out.println("the missing value is"+" "+missing);
    }
    public static void main(String[] args){
        int arr[]={3,1,2,5,3};
        repeat(arr);
       
        
    }
    
}
