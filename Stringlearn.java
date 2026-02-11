import java.util.*;
public class Stringlearn {
    public static void hello(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args){

        // concatination of string
        String fullname="Bittu";
        String lastname="Singh";
        String name=fullname+" "+lastname;
        System.out.println(name);
        System.out.println("the length of the String is"+" "+fullname.length());
        System.out.println(fullname.charAt(1));

        hello(lastname);
    }
    
}
