class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int a){
        this();
        System.out.println("in int A");
    }
}
class B extends A{
    public B(){
        super(7);
        System.out.println("in B");
    }
    public B(int b){
        this();
        System.out.println("in int B");
    }
}
public class con {
    public static void main(String[] args){
        B obj=new B(7);

    }
    
}
