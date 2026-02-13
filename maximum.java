public class maximum {
    public static int max(int arr[]){
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(maximum<arr[i]){
                maximum=arr[i];
            }
        }
       return maximum;

    }
    public static void main(String[] args){
        int arr[]={1,4,6,8,2,4};
        // max(arr);
        System.out.println(max(arr));
    }
    
}
