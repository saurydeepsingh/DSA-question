public class maximumsubarrya {
    public static int maxsunarrya(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(max, sum);

            if(sum<0){
                sum=0;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int arr[]={5,4,-1,7,8};

        System.out.print(maxsunarrya(arr));

    }
}
