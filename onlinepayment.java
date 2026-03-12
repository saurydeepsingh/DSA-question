import java.util.*;
abstract class payment{
    private long accountnumber;
    private int amount;
    public long getaccountnumber(){
        return accountnumber;
    }
    public void setaccountnumber(long accountnumber){
        this.accountnumber=accountnumber;
    }
    public int getamount(){
        return amount;
    }
    public void setamount(int amount){
        this.amount=amount;
    }
    public void showpayment(){
        System.out.println("amount:"+amount);
        System.out.println("account number:"+accountnumber);
    }
    abstract void processpayment();

}
class creditcard extends payment{
    public void creditcardpayment(){
        showpayment();
    }
    void processpayment(){
        System.out.println("credit card payment successfull.");
    }
    
}
class debitcard extends payment{
    public void debitcardpayment(){
        showpayment();
    }
    void processpayment(){
        System.out.println("Debit card payment succesfull.");
    }
}
class upi extends payment{
    public void upipayment(){
        showpayment();
    }
    void processpayment(){
        System.out.println("upi payment successfull.");
    }
}
public class onlinepayment {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        creditcard C=new creditcard();
        System.out.print("the amount to be credit is:");
        int creditcard=sc.nextInt();
        C.setamount(creditcard);
        System.out.println("enter the credit card account number");
        long creditaccountnumber=sc.nextLong();
        C.setaccountnumber(creditaccountnumber);
        C.showpayment();
        C.processpayment();

        
        debitcard D=new debitcard();
        System.out.print("the amount to be debit is:");
        int debitcard=sc.nextInt();
        D.setamount(debitcard);
        System.out.println("enter the debit card account number");
        long debitaccountnumber=sc.nextLong();
        D.setaccountnumber(debitaccountnumber);
        D.showpayment();
        D.processpayment();



        upi U=new upi();
        System.out.print("the amount to be upi is:");
        int upi=sc.nextInt();
        U.setamount(upi);
        System.out.println("enter the upi account number");
        long upiaccountnumber=sc.nextLong();
        U.setaccountnumber(upiaccountnumber);
        U.showpayment();
        U.processpayment();

        sc.close();



    }
    
}
