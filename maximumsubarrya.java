public class maximumsubarrya {
    public static int max(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int arr[]={1,3,5,7};
        // max(arr);
        // for(int i=0;i<arr.length;i++){
            System.out.print(max(arr));
        // }
    }
    
}
