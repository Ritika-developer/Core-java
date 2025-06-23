import java.util.*;
public class One
{
public static void main(String ar[])
    {


// how to print output
// System.out.println("hello manish");
// System.out.print("hello vaishnavi");
  
//   how to take input
// Scanner obj=new Scanner(System.in);
// System.out.println("enter value");
// int a;
// a=obj.nextInt();
// System.out.println(a);



//     }
// }

// public=to acceess current class by external packages
// class=keyword(predefined definition)
// classsname=One(pascal)/filename=class name
// reason(jvm search file->class);


// method/function

// datatype void  functionname  main()
// {

// }

// class->member function,member variable
// acess->object
// static->no object required

// class=by default private(c++)
// // by default=default
// class PrintStream
// {
//   void print(String a)  
//   {
//        }
// }
// class System{
//      static PrintStream out
// }

// System.out.print("hello")


// constructor=to initialize values in object



//hollow rectangle
// for(int i=1 ;i<=4;i++){
//      for(int j=1;j<=5;j++){
//            if(i==1 || j==1 || i==4 || j==5 ){
//             System.out.print("*");
//            }else{
//             System.out.print(" ");
//            }
//         }
    
//       System.out.println(" ");
// }



//half pyramid
// for(int i=1 ;i<=4;i++){
//     for(int j=0;j<=4;j++){
//         if(i<=j){
//             System.out.print(" ");
//         }
//         else{
//             System.out.print("*");
//         }
//     }
//     System.out.println(" ");
// }


//or

// for(int i=1 ;i<=4;i++){
//     for(int j=1;j<=i;j++){
//             System.out.print("*");
//     }
//     System.out.println(" ");
// }


//inveted left half pyramid
// for(int i=4 ;i>=1;i--){
//     for(int j=1;j<=i;j++){
//             System.out.print("*");
//     }
//     System.out.println(" ");
// }




//inverted right half pyramid
// int n=4;
// for(int i=1 ;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println(" ");
// }



//half pyramid with number
// for(int i=1 ;i<=5;i++){
//     for(int j=1;j<=i;j++){
//             System.out.print(j);
//     }
//     System.out.println(" ");
// }


//left half number pyramid
// for(int i=4 ;i>=1;i--){
//     for(int j=1;j<=i;j++){
//             System.out.print(j);
//     }
//     System.out.println(" ");
// }




//Floyd's triangle
// int number = 1;
// for(int i=1 ;i<=5;i++){
//     for(int j=1;j<=i;j++){
//             System.out.print(number + " ");
//             number++;
//     }
//     System.out.println(" ");
// }




//0-1 triangle
// for(int i=1 ;i<=5;i++){
//     for(int j=1;j<=i;j++){
//         if((i+j)%2==0){
//             System.out.print("1");
//         }
//         else{
//             System.out.print("0");

//         }
//     }
//     System.out.println(" ");
// }








//butterfly
// int n=4;
// //upper part
// for(int i=1 ;i<=n;i++){
//     for(int j=1;j<=i;j++){
//     System.out.print("*");
//     }

//     int space  = 2*(n-i);
//     for(int j=1;j<=space;j++){
//         System.out.print(" ");
//     }

//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println(" ");
// }

// //lower part
// for(int i=n ;i>=1;i--){
//     for(int j=1;j<=i;j++){
//     System.out.print("*");
//     }

//     int space  = 2*(n-i);
//     for(int j=1;j<=space;j++){
//         System.out.print(" ");
//     }

//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println(" ");
// }






//solid rhombus
// for(int r=1;r<=5;r++){
//     for(int c=1;c<=5;c++){
//         if(c<=5-r){
//             System.out.print(" ");
//         }
//         else{
//         System.out.print("*");
//         }
//     }
//      for(int c=1;c<=5;c++){
//         if(c>=6-r){
//             System.out.print(" ");
//         }
//         else{
//         System.out.print("*");
//         }
//     }
    
//     System.out.println(" ");
// }



//or
// int n=5;
// for(int r=1;r<=n;r++){
//     for(int c=1;c<=n-r;c++){
//             System.out.print(" ");
//         }
//     for(int c=1;c<=5;c++){
//         System.out.print("*");
//     }
    
//     System.out.println();
// }
    


//number pyramid
// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }

//     for(int j=1;j<=i;j++){
//         System.out.print(i+" ");
//     }
//     System.out.println();
// }




//palindrom pyramid
// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }

//     for(int j=i;j>=1;j--){
//         System.out.print(j);
//     }

//     for(int j=2;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }







 }
    }