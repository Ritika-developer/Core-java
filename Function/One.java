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
//         public static int sumArray(int[] arr) {
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
//     public static void reverseArray(int[] arr) {
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

//     public static void main(String[] args) {
//         int[] numbers = {10, 20, 30, 40, 50};
//         reverseArray(numbers); 
//         System.out.println("\nReversed array:");
//         for(int num : numbers) {
//             System.out.print(num + " ");
//         }
//     }
// }



//pallindrom
public class One {
    public static boolean isPalindrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            if(arr[start] != arr[end]) {
                return false; 
            }
            start++;
            end--;
        }
                 return true; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};

        if(isPalindrome(arr)) {
            System.out.println("The array is a Palindrome");
        } else {
            System.out.println("The array is NOT a Palindrome");
        }
    }
}



//hw:- sum of array 
// reverse
// pallindrom