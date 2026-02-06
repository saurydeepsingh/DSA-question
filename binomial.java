import java.util.*;
public class binomial {
    public static int Fact1(int a){
        int f1=1;
        for(int i=1;i<=a;i++){
            f1=f1*i;
        }
        return f1;
    }
    public static int biocoff(int n , int m){
        int fact2=Fact1(n);
        int fact3=Fact1(m);
        int bio=Fact1(n-m);

        int biocofficient=fact2/(fact3*bio);
        return biocofficient; 

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();

        System.out.println(biocoff(a,b));
    }
    
}
