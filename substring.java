// public class substring {
//     public static String subString(String str, int start, int end){
//         String sub="";
//         for(int i=start;i<end;i++){
//             sub+=str.charAt(i);
//         }
//         return sub;
//     }
//     public static void main(String[] args){
//         String str="helloworld";
//         // System.out.print(subString(str, 0, 6));
//         System.out.print(str.substring(0,4));
//     }
    
// }




// largest of String
public class substring{
    public static void main(String[] args){
        String str[]={"apple","mango","banana"};
        String largest=str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest=str[i];
            }
        }
        System.out.print(largest);
    }
}