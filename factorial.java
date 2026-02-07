import java.util.*;
public class factorial {
    public static int facotial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the factorial number:");
        int a=sc.nextInt();
        
        System.out.println(facotial(a));
         sc.close();
    }
   
    
}
