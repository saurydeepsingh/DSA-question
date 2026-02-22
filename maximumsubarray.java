public class maximumsubarray{
    public static int maxsub(int arr[]){
        int max=arr[0];
        int min=arr[0];
        int result=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){

                int temp=max;
                max=min;
                min=max;
            }
            max=Math.max(arr[i],arr[i]*max);
            min=Math.min(arr[i], arr[i]*min);
            result=Math.max(result, max);
        }
        return result;
    }
    public static void main(String[] args){
        int arr[]={2,3,-2,4};
        System.out.println(maxsub(arr));
    }
}

