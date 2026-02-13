public class minimum {
    public static int min(int arr[]){
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(minimum>arr[i]){
                minimum=arr[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args){
        int arr[]={4,2,6,1,8,5};
        System.out.println(min(arr));
    }
    
}
