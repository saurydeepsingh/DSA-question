// second largest of an array
// public class such {
//     public static void largestofarray(int number[]){
//         int larg=Integer.MIN_VALUE;
//         int secondlarg=Integer.MIN_VALUE;
//         for(int i=0;i<number.length;i++){
//             if(larg<number[i]){
//                 secondlarg=larg;
//                 larg=number[i];
                
//             }
//             else if(number[i]> secondlarg && number[i] != larg){
//                 secondlarg=number[i];
//             }
//         }
//         System.out.println(secondlarg);
        
//     }
//     public static void main(String[] args){
//         int number[]={2,4,6,8,3,5};
//         largestofarray(number);
        
//     }
    
// }




// add of an array
public class such{
    public static void add(int number[]){
        int sum=0;
        for(int i=0;i<number.length;i++){
            sum+=number[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        add(arr);
    }
}






