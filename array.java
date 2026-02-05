// public class array {
//     public static void update(int marks[] ){
//         for(int i=0;i<marks.length;i++){
//             marks[i]=marks[i]+1;
//         }
//     }
//     public static void main(String[] args){
//         int marks[] = {2,3,4};
//         update(marks);
//         for(int i=0;i<marks.length;i++){
//             System.out.println(marks[i]+" ");
//         }
//         System.out.println();
//     }
    
// }


// Linear Search

public class array{
    public static int linearsearch(int number[] , int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int number[]={111,33,55,77,34,67,96,92};
        int key=77;

        int index=linearsearch(number, key);
        if(index== -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("index is:"+index);

        }

        
    }
}