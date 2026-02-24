public class removeelement {
    public static int removeElement(int arr[], int val) {
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[x]=arr[i];
                x++;
            }
        }
        return x;

        
    }
    public static void main(String[] args){
        int arr[]={0,1,2,2,3,0,4,2};
        int val=2;
        System.out.print(removeElement(arr, val));
    }
}