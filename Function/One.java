//return type
// import java.util.*;
// public class One{
//     static int display(){
//         return 10;
//     }
// public static void main (String ar[]){
// System.out.print(display());
// }
// }



//string type
// import java.util.*;
// public class One{
//     static String display(){
//         return "ritika";
//     }
// public static void main (String ar[]){
// System.out.print(display()+" "+"choudhary");
// }
// }


// parameter with non return
// import java.util.*;
// public class One{
//    static void sum(int a,int b){
//         System.out.print(a+b);
//     }
// public static void main (String ar[]){
// sum(10,11);
// }
// }


//parameter with return
// import java.util.*;
// public class One{
//    static int sum(int a,int b){
//         return a+b;
//     }
// public static void main (String ar[]){
// System.out.print(sum(10,11));
// }
// }


import java.util.*;
public class One{
   static int sumOfArray(int arr[]){
    for(int i:arr){
        System.out.print(i);
    }
        return 0;
    }
public static void main (String ar[]){
    int arr[] = {1,2,3,4,5};
    sumOfArray(arr);
    }
}
