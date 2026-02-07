public class linearsearch {
    public static void linear(int number[], int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                System.out.print(i);
            }
            
        }
        System.out.print("not number");
    }
    public static void main(String[] args){
        int number[]={1,2,5,7,3};
        int key=7;
        linear(number, key);
    }
    
}
