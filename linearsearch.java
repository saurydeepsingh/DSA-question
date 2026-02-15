public class linearsearch {
    public static void linearsearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("the key is found at the index of"+" "+i);

            }
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        int key=4;
        linearsearch(arr, key);
    }
    
}
