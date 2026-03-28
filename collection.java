// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;
// public class collection {
//     public static void main(String[] args){
//         List<Integer> num=new ArrayList<Integer>();
//         num.add(4);
//         num.add(5);
//         num.add(6);
//         num.add(1);
        
//         // for(int n:num){
//         //     System.out.println(n);
//         // }

//         System.out.println(num);

//     }
    
// }




// import java.util.Set;
// import java.util.HashSet;

// public class collection{
//     public static void main(String[] args){
//         Set<Integer> num=new HashSet<Integer>();
//         num.add(3);
//         num.add(4);
//         num.add(2);
//         num.add(9); 
//         for(int n:num){
//             System.out.println(n);
//         }

//         System.out.println(num);
//     }
// }

// import java.util.HashMap;
// import java.util.Map;

// public class collection{
//     public static void main(String[] args){
//         Map<String,Integer> students=new HashMap<>();
//         students.put("saurydeep_singh", 3);
//         students.put("bittu", 2);
//         students.put("sani",23 );
//         students.put("sunita", 37);


//         System.out.println(students.get("bittu"));
//     }
// }



// import java.util.*;
// import java.util.ArrayList;
// public class collection{
//     public static void main(String[] args){
//         List<Integer> num=new ArrayList<>();
//         num.add(2);
//          num.add(4);
//           num.add(6);
//            num.add(3);
//             num.add(7);
//             int sum=0;

//             System.out.println(num);
//             for(int n: num){
//                 if(n%2==0){
//                     n=n*2;
//                     sum=sum+n;
//                 }
//             }

//             num.forEach(n ->System.out.println(n));

//              System.out.println(sum);

//     }

// }



// import java.util.ArrayList;
// import java.util.List;
// import java.util.stream.Stream;

// public class collection{
//     public static void main(String[] args){
//         List<Integer> nums=new ArrayList<Integer>();
//         nums.add(2);
//           nums.add(4);
//             nums.add(3);
//               nums.add(26);
//                 nums.add(8);
//                   nums.add(9);

//         Stream<Integer> s=nums.stream();
//          Stream<Integer> s1=nums.stream();   
       
//         s.forEach(n -> System.out.println(n));   
//         s1.forEach(n -> System.out.println(n)); 
        
        
//          System.out.println("for each loop end here..."); 
//         for(int n:nums){
//             System.out.println(n);
//         }          


//     }
// }

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class collection{
    public static void main(String[] args){
        List<String> nums= Arrays.asList("name","bittu","sani");
        Optional<String> a=nums.stream();
                .filter(a->a.contains(e))
                .findFirst();
        System.out.println(nums.orElse("not found"));        
        
        
    }
}