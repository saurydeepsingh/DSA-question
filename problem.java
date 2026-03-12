// import java.util.*;
// abstract class vehicle
// {
//     private String brand;
//     private int speed;
//     public String getbrand(){
//         return brand;
//     }
//     public void setbrand(String brand){
//         this.brand=brand;
//     }
//     public int getspeed(){  
//         return speed;
//     }
//     public void setspeed(int speed){
//         this.speed=speed;
//     }
//     public void showsdetail(){
//         System.out.println("brand:"+brand);
//         System.out.println("speed:"+speed+"km");
//     }
//     abstract void startengine();

// }
// class car extends vehicle{
//     private int numberofdoor;
//     public int getnumberofdoor(){
//         return numberofdoor;
//     }
//     public void setnumberofdoor(int numberofdoor){

//         this.numberofdoor=numberofdoor;
//     }
//     void startengine(){
//         System.out.println("car engine has been start: ");

//     }
//     public void carshowdetails(){
//         showsdetail();
//         System.out.println("number of door:"+numberofdoor);
//     }

// }
// class bike extends vehicle{
//     private int passengerlimit;
//     public int getpassengerlimit(){
//         return passengerlimit;
//     }
//     public void setpassengerlimit(int passengerlimit){
//         this.passengerlimit=passengerlimit;
//     }
//     void startengine(){
//         System.out.println("bike engine has been start:");
//     }
//     public void bikeshowdetails(){
//         showsdetail();
//         System.out.println("passanger limit:"+passengerlimit);
//     }
// }

// public class problem {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         car obj=new car();
        
//         obj.startengine();
//         sc.nextLine();
//         System.out.println("enter brand name:");
//         String objbrand=sc.nextLine();
//         obj.setbrand(objbrand);
//         System.out.println("enter speed:");
//         int objspeed=sc.nextInt();
//         obj.setspeed(objspeed);
//         System.out.println("enter the car number of door:");
//         int numberofdoor=sc.nextInt();
//         obj.setnumberofdoor(numberofdoor);
//         obj.carshowdetails();
       
//         bike obj2=new bike();
//         sc.nextLine();

         
//         obj2.startengine();
//         sc.nextLine();
//         System.out.println("enter brand name:");
//         String obj2brand=sc.nextLine();
//         obj2.setbrand(obj2brand);
//         System.out.println("enter speed:");
//         int obj2speed=sc.nextInt();
//         obj2.setspeed(obj2speed);
//         System.out.println("enter passenger limit:");
//         int passengerlimit=sc.nextInt();
//         obj2.setpassengerlimit(passengerlimit);
       
//         obj2.bikeshowdetails();



//         sc.close();



//     }
    
// }

import java.util.*;
abstract class vehicle{
    private String brand;
    private int speed;
    public String getbrand(){
        return brand;
    }
    public void setbrand(String brand){
        this.brand=brand;
    }
    public int getspeed(){
        return speed;
    }
    public void setspeed(int speed){
        this.speed=speed;
    }
    public void showdetail(){
        System.out.println("brand:"+brand);
        System.out.println("speed:"+speed+"km");
    }
    abstract void startengine();

}
class car extends vehicle{
    private int numberofdoor;
    public int getnumberofdoor(){
        return numberofdoor;
    }
    public void setnumberofdoor(int numberofdoor){
        this.numberofdoor=numberofdoor;
    }
    public void carshowdetail(){
        showdetail();
        System.out.println("number of door:"+numberofdoor);
    }
    void startengine(){
        System.out.println("car enginne has been start with the push button.");
    }
}
class bike extends vehicle{
    private int passengerlimit;
    public int getpassengerlimit(){
        return passengerlimit;
    }
    public void setpassengerlimit(int passengerlimit){
        this.passengerlimit=passengerlimit;
    }
    public void bikeshowdetail(){
        showdetail();
        System.out.println("number of passenger limit:"+passengerlimit);
    }
    void startengine(){
        System.out.println("the bike engine has been start with the help of kick.");
    }
}
public class problem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        car Car=new car();
        Car.startengine();
        System.out.println("enter the car brand name");
        String carbrand=sc.nextLine();
        Car.setbrand(carbrand);
        System.out.println("enter the car speed:");
        int carspeed=sc.nextInt();
        Car.setspeed(carspeed);
        System.out.println("enter the car number of door:");
        int carnumberofdoor=sc.nextInt();
        Car.setnumberofdoor(carnumberofdoor);
        Car.carshowdetail();

        System.out.println();
        
        bike Bike=new bike();
        Bike.startengine();
        sc.nextLine();
        System.out.println("enter the bike brand name:");
        String bikebrand=sc.nextLine();
        Bike.setbrand(bikebrand);
        System.out.println("enter the bike speed:");
        int bikespeed=sc.nextInt();
        Bike.setspeed(bikespeed);
        System.out.println("number of passenger limit in bike:");
        int bikepassengerlimit=sc.nextInt();
        Bike.setpassengerlimit(bikepassengerlimit);

        Bike.bikeshowdetail();

        sc.close();


    }
}