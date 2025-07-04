import java.util.*;

//hcf  lcm

//user sai input laina
// public class Prac{
//     public static void main(String args[]){
//         Scanner obj = new Scanner(System.in);
//         System.out.print("enter a number");
//         int a;
//         a=obj.nextInt();
//         System.out.print(a);
//     }
// }


//print data type
// public class Prac{
//     public static void main(String args[]){
//         char ch  = 'r';
//         String str = "ritika";
//         float f = 12.472687f;
//         double d = 12.4467462746744324242;
//         int i = 12;
//         Boolean b = true;


//         System.out.println("character " + " " + ch);
//         System.out.println("string " + " " + str);
//         System.out.println("float " + " " + f);
//         System.out.println("double " + " " + d);
//         System.out.println("int " + " " + i);
//         System.out.println("boolean " + " " + b);
        
//     }
// }





//print with operator
// public class Prac{
//     public static void main(String args[]){
//        int a = 4;
//        int b = 5;
//         System.out.println(a&b);
//         System.out.println(a|b);
//         System.out.println(a^b);
//     }
// }




//print all datatype from user
// public class Prac{
//     public static void main(String args[]){
//       Scanner obj = new Scanner(System.in);
//         System.out.println("enter a string");
//         String str = obj.nextLine();

//         System.out.println("enter a int");
//         int i = obj.nextInt();

//         System.out.println("enter a character");
//         char ch = obj.next().charAt(0);

//         System.out.println("enter a boolean");
//         boolean b = obj.nextBoolean();

//         System.out.println("enter a float");
//         float f = obj.nextFloat();


//         System.out.println("here ia your answer");
//         System.out.println("String = "+ str);
//         System.out.println("int = " + i);
//         System.out.println("character = " + ch);
//         System.out.println("boolean = " + b);
//         System.out.println("float = " + f);
//     }
// }




//print table
// public class Prac{
//     public static void main(String args[]){
//       int a= 2;
//       for(int i = 1 ; i<=10 ; i++){
//         System.out.println(i*a);
//       }
//     }
// }

//multiple table
// public class Prac{
//     public static void main(String args[]){
//       for(int j=2 ; j<=10; j++){
//       for(int i = 1 ; i<=10 ; i++){
//         System.out.print(i*j+" " );
//       }
//       System.out.println();
//       }
//     }
// }



//sum n natutal number
// public class Prac{
//     public static void main(String args[]){
//       int n=10;
//       int sum  = 0;
//       for(int i = 1 ; i<=10 ; i++){
//          sum = sum+i;
//       }
//         System.out.println(sum);

//     }
// }



//factorial
// public class Prac{
//     public static void main(String args[]){
//       int n=5;
//       int sum  = 1;
//       for(int i = 1 ; i<=n ; i++){
//          sum = sum*i;
//       }
//         System.out.println(sum);

//     }
// }



//factor
// public class Prac{
//     public static void main(String args[]){
//       int n=15;
//       for(int i = 1 ; i<=n ; i++){
//          if(n%i==0){
//             System.out.println(i);
//          }
//       }
//     }
// }




//hcf 
// public class Prac{
//     public static void main(String args[]){
//     int num1 = 12;
//     int num2 = 16;
//    int  hcf = 0;
//     for(int i=1 ; i<=num1 && i<=num2 ; i++){
//         if(num1%i==0 && num2%i==0){
//                 hcf = i;
//         }
//     }
//            System.out.print(hcf);
//     }
// }





//lcm
// public class Prac{
//     public static void main(String args[]){
//     int num1 = 16;
//     int num2 = 18;
//    int  mx = (num1>num2)?num1:num2;
//    int i=mx;
//     while(true){
//         if(i%num1==0 && i%num2==0){
//                 break;
//         } 
//         i=i+mx;
//     }
//            System.out.print(i);
//     }
// }



//find largest digit 
// public class Prac{
//     public static void main(String args[]){
//     int num = 2451;
//     int ans = 0;
//     while(num!=0){
//     int digit = num%10;//4
//     if(ans<digit){
//         ans = digit;
//     }
//     num = num/10;//123
//     }
//        System.out.print(ans);
//     }
// }




//reverse
// public class Prac{
//     public static void main(String args[]){
//     int num = 1234;
//     int rev = 0;
//     while(num!=0){
//     int digit = num%10;//4
//     rev = rev*10+digit;
//     num = num/10;//123
//     }
//        System.out.print(rev);
//     }
// }



//prime number
// public class Prac{
//     public static void main(String args[]){
//     int num = 5;
//     int count = 0;
//     for(int i=1 ; i<=num ; i++){
//         if(num%i==0){
//             count++;
//         }
//     }
//     if(count == 2){
//         System.out.print("prime");
//     }
//     else{
//         System.out.print("not prime");
//     }
   
//     }
// }




//amstrong
// public class Prac{
//     public static void main(String args[]){
//     int num = 153;
//     int org = num;
//     int sum = 0;
//     while(num!=0){
//         int digit = num%10;
//         sum = sum+digit*digit*digit;
//         num = num/10;
//     }
//     if(sum == org){
//         System.out.print("amstrong");
//     }
//     else{
//         System.out.print("not amstrong");
//     }
  
//     }
// }



//pallindrome
// public class Prac{
//     public static void main(String args[]){
//     int num = 151;
//     int org = num;
//     int sum = 0;
//     while(num!=0){
//         int digit = num%10;
//         sum = sum*10+digit;
//         num = num/10;
//     }
//     if(sum == org){
//         System.out.print("pallindrome");
//     }
//     else{
//         System.out.print("not pallindrome");
//     }
//     }
// }




//ap series
// public class Prac{
//     public static void main(String args[]){
//     int a = 1;
//     int d = 2;
//     int n = 6;
//    for(int i=a ; i<=n ; i++){
//      System.out.print(a+i*d +" ");
//    }
//     }
// }


//gp series
// public class Prac{
//     public static void main(String args[]){
//     int a = 1;
//     int r = 3;
//     int n = 6;
//    for(int i=0 ; i<n ; i++){
//      System.out.print(a+" ");
//      a=r*a;
//    }
//     }
// }




//fabonacci
// public class Prac{
//     public static void main(String args[]){
//    int fir = 0;
//    int sec = 1; 
//    for(int i=0;i<8;i++){
//     if(i==0){
//     System.out.print(fir+" ");
//     continue;
//     }
//     else if(i==1){
//     System.out.print(sec+" ");
//     continue;
//     }
//        int next = fir+sec;
//         fir = sec;
//         sec = next;
//         System.out.print(next +" ");
//    }
//     }
// }




//right pattern
// public class Prac{
//     public static void main(String args[]){
//    for(int r=1;r<=5;r++){
//     for(int c=1 ; c<=5 ; c++){
//         if(c<=r){
//             System.out.print("*");
//         }
        // else{   
        //     System.out.print(" ");
        // }
//     }
//                 System.out.println(" ");
//    }
//     }
// }



//inverted left
// public class Prac{
//     public static void main(String args[]){
//    for(int r=1;r<=5;r++){
//     for(int c=1 ; c<=5 ; c++){
//         if(c>=r){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//                 System.out.println(" ");
//    }
//     }
// }




//inverted right
// public class Prac{
//     public static void main(String args[]){
//    for(int r=1;r<=5;r++){
//     for(int c=1 ; c<=5 ; c++){
//         if(c<=6-r){
//             System.out.print("*");
//         }
//         else{
//                System.out.print(" "); 
//         }
//     }
//                 System.out.println(" ");
//    }
//     }
// }




//left
// public class Prac{
//     public static void main(String args[]){
//    for(int r=1;r<=5;r++){
//     for(int c=1 ; c<=5 ; c++){
//         if(c>=6-r){
//             System.out.print("*");
//         }
//         else{
//                System.out.print(" "); 
//         }
//     }
//                 System.out.println(" ");
//    }
//     }
// }





//pyramid
// public class Prac{
//     public static void main(String args[]){
//    for(int r=1;r<=5;r++){
//     for(int c=1 ; c<=9 ; c++){
//         if(c>=6-r && c<=4+r){
//             System.out.print("*");
//         }
//         else{
//                System.out.print(" "); 
//         }
//     }
//                 System.out.println(" ");
//    }
//     }
// }




                                                //ARRAY

//print array from user
// public class Prac{
//         public static void main(String args[]){
//            Scanner obj = new Scanner(System.in);
//            System.out.print("enter a size of array ");
//            int size = obj.nextInt();

//            int arr[] = new int[size];
//            System.out.print("enter a value of array ");
//            for(int i=0 ; i<arr.length ; i++){
//                 arr[i]  = obj.nextInt();
//            }

//            for(int arr1:arr){
//                 System.out.print(arr1);
//            }
//         }
// }




//sum of array
// public class Prac{
//     public static void main(String args[]){
//         int arr[] = {1,4,5,2,3};
//         int sum =0;
//         for(int i=0 ; i<arr.length ; i++){
//                 sum = sum+arr[i];
//         }
//         System.out.print(sum);
//     }
// }



//reverse
// public class Prac{
//     public static void main(String args[]){
//     int arr[] = {2,5,4,8,3};
//     for(int i=0 ; i<arr.length/2;i++){
//         int temp  = arr[arr.length-i-1];
//         arr[arr.length-i-1] = arr[i];
//         arr[i] = temp;
//     }

//     for(int arr1:arr){
//         System.out.print(arr1);
//     }
//     }
// }





//pallindrome
// public class Prac{
//     public static void main(String args[]){
//     int arr[] = {2,3,4,3,2};
//     boolean pallindrome = true;
//     for(int i=0 ; i<arr.length-1;i++){
//         if(arr[i]!= arr[arr.length-1-i]){
//                 pallindrome = false;
//                 break;
//         }
//     }
//     if(pallindrome){
//         System.out.print("pallindrome");
//     }
//     else{
//         System.out.print("not pallindrome");
//     }
//     }
// }





//