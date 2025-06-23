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


// import java.util.*;
// public class One{
//    static int sumOfArray(int arr[]){
//     for(int i:arr){
//         System.out.print(i);
//     }
//         return 0;
//     }
// public static void main (String ar[]){
//     int arr[] = {1,2,3,4,5};
//     sumOfArray(arr);
//     }
// }



    // In Function sum of array
// public class One {
//         static int sumArray(int[] arr) {
//         int sum = 0;
//         for(int i = 0; i < arr.length; i++) {
//             sum = sum+arr[i]; 
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int[] numbers = {10, 20, 30, 40, 50}; 
//         int total = sumArray(numbers);
//         System.out.println("Sum of the array: " + total);
//     }
// }


//reverse array
// public class One {
//      static void reverseArray(int arr[]) {
//         int start = 0;
//         int end = arr.length - 1;
        
//         while(start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }

//     public static void main(String args[]) {
//         int numbers[] = {10, 20, 30, 40, 50};
//         reverseArray(numbers); 
//         System.out.println("\nReversed array:");
//         for(int num : numbers) {
//             System.out.print(num + " ");
//         }
//     }
// }



//pallindrom
// public class One {
//      static boolean isPalindrome(int arr[]) {
//         int start = 0;
//         int end = arr.length - 1;

//         while(start < end) {
//             if(arr[start] != arr[end]) {
//                 return false; 
//             }
//             start++;
//             end--;
//         }
//                  return true; 
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 2, 1};

//         if(isPalindrome(arr)) {
//             System.out.println("The array is a Palindrome");
//         } else {
//             System.out.println("The array is NOT a Palindrome");
//         }
//     }
// }





//print an array
// import java.util.Scanner;
// public class One{
// static void arrinp(int arr[],int size){
//             Scanner obj = new Scanner(System.in);
//             for(int i=0;i<size;i++){
//                 arr[i]=obj.nextInt();
//             }
// }

//  static void display(int arr[]){
//     for(int arr1:arr){
//         System.out.print(arr1);
//     }
// }
    
//     public static void main(String args[]){
//         Scanner obj = new Scanner(System.in);
//         System.out.print("enter the array size");
//         int size;
//         size = obj.nextInt();
//         int arr[] = new int[size];
//         arrinp(arr,size);
//         display(arr);
//     }
// } 




//Assending
// public class One{
// static void Assending(int arr[]){
//     int n=arr.length;
//     for(int i=0;i<n-1;++i){
//         for(int j=0;j<n-1-i;++j){
//             if(arr[j]>arr[j+1]){
//                 int temp=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;
//             }
//         }
//     }
// }
// static void printArrey(int arr[]){
//     for(int num:arr){
//         System.out.print(num+" ");
//     }
//     System.out.println();
// }
//     public static void main(String args[]){
       
//        int number[]={3,4,6,2,7,8};
//     //    System.out.println("original arrey");
//     //    printArrey(number);
//        Assending(number);
//        System.out.println(" aseending arrey");
//        printArrey(number);
//     }

// }






//maximum
// public class One{
// static int Maximum(int arr[]){
//     int n = arr.length;
//     int max = arr[0];

//     for(int i =0 ; i<n ;i++){
//         if(arr[i]>max){
//             max = arr[i];
//         }
//     }
//     return max;
// }
// public static void main(String args[]){
// int arr[] = {3,7,5,9,1};
// int max = Maximum(arr);
// System.out.print(max);
//     }
// }





//Minimum
// public class One{
// static int Maximum(int arr[]){
//     int n = arr.length;
//     int max = arr[0];

//     for(int i =0 ; i<n ;i++){
//         if(arr[i]<max){
//             max = arr[i];
//         }
//     }
//     return max;
// }
// public static void main(String args[]){
// int arr[] = {3,7,5,9,1};
// int max = Maximum(arr);
// System.out.print(max);
//     }
// }






//move zero
// public class One{
// static int Maximum(int arr[]){
//     int n = arr.length;
//    int j=0;

//     for(int i =0 ; i<n ;i++){
//         if(arr[i]!=0){
//            arr[j]=arr[i];
//            j++;
//         }
//     }
//     for(int i=j;i<n;i++){
//         arr[i]=0;
//     }
//     return j;
// }
// public static void main(String args[]){
// int arr[] = {3,0,5,0,1};
// Maximum(arr);
// for(int ans:arr){
//     System.out.print(ans);
// }
//     }
// }




// find Duplicate
// public class One{
// static boolean Maximum(int arr[]){
//     int n = arr.length;

//     for(int i =0 ; i<n ;i++){
//         boolean dup = false;
//         for(int j=i+1;j<n;j++){
//             if(arr[i]==arr[j] && arr[i]!=-1){
//                 dup =true ;
//                 arr[j]=-1;
//         }
//         }
       
//        if(dup==true ){
//         System.out.print(arr[i]);
//        }
       
//     }
//     return true;
// }
// public static void main(String args[]){
// int arr[] = {3,6,4,3,6};
// Maximum(arr);
//     }
// }










// remove Duplicate
// public class One{
// static boolean Maximum(int arr[]){
//     int n = arr.length;

//     for(int i =0 ; i<n ;i++){
//         boolean dup = false;
//         for(int j=i+1;j<n;j++){
//             if(arr[i]==arr[j] && arr[i]!=-1){
//                 dup =true ;
//                 arr[j]=-1;
//         }
//         }
       
//        if(dup=true && arr[i]!=-1){
//         System.out.print(arr[i]);
//        }
       
//     }
//     return true;
// }
// public static void main(String args[]){
// int arr[] = {3,4,3,4,2};
// Maximum(arr);
//     }
// }










//unique
// public class One{
// static boolean Maximum(int arr[]){
//     int n = arr.length;

//     for(int i =0 ; i<n ;i++){
//         boolean dup = false;
//         for(int j=i+1;j<n;j++){
//             if(arr[i]==arr[j] && arr[i]!=-1){
//                 dup =true ;
//                 arr[j]=-1;
//         }
//         }
       
//        if(dup!=true && arr[i]!=-1){
//         System.out.print(arr[i]);
//        }
       
//     }
//     return true;
// }
// public static void main(String args[]){
// int arr[] = {3,4,3,4,2};
// Maximum(arr);
//     }
// }







//kth and second largest
// public class One{
// static int Maximum(int arr[]){
//     int n = arr.length;
//     for(int i =0 ; i<n ;i++){
//         for(int j=i+1;j<n;j++){
//             if(arr[j]>arr[i]){
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//     }
//     return 0;
// }
// public static void main(String args[]){
// int arr[] = {3,7,5,9,8};
// int k=4;
//  Maximum(arr);
//  for(int i=k-1;i<k;i++){
// System.out.print(arr[k-1]);

//  }
//     }
// }













 //one missing number
// public class One{
//     static int Missing(int arr[]){
//         int n = arr.length;
//         for(int i=0;i<n-1;i++){
//             if(arr[i+1]-arr[i]>1){
//             }
//         }
//         return 0;
//     }
//     public static void main(String args[]){
//         int arr[]={1,3,5,9,11};
//         Missing(arr);
//         for(int i=0;i<4;i++){
//         System.out.print(arr[i]+1);
//         }
//     }
// }










//multi missing number
// public class One{
//     static int Missing(int arr[]){
//         int n = arr.length;
//         for(int i=0;i<n-1;i++){
//             if(arr[i+1]-arr[i]>1){
//                 for(int j=arr[i]+1;j<arr[i+1];j++){
//                     System.out.print(j+" ");
//                 }
//             }
//         }
//         return 0;
//     }
//     public static void main(String args[]){
//         int arr[]={1,3,9,11,15};
//         Missing(arr);
//     }
// }







//frequency
// public class One{
// static void Maximum(int arr[]){
//     int n = arr.length;
//     int feq[] = new int[n];
//     for(int i =0 ; i<n ;i++){
//         feq[i]  = -1;   
//     }
//     for(int i=0;i<n;i++){
//         if(feq[i]!=-1)
//             continue;
//             int count =1;
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     count ++;
//                     feq[j]=0;
//                 }
//             }
//             feq[i]=count;
//     }
//         for(int i=0;i<n;i++){
//             if(feq[i]!=0){
//                 System.out.println(arr[i]+" is "+feq[i]+" times ");
//         }
//         } 
// }
// public static void main(String args[]){
// int arr[] = {1,3,1,5,3};
// Maximum(arr);
//     }
// }
