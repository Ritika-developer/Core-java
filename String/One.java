//reverse
// import java.util.*;
// public class One{

//    static void rev(String str){
//         char arr[] = new char[str.length()];
//         for(int i=0;i<str.length();i++){
//             arr[i] =str.charAt(i);
//         }

//     int right  = str.length()-1;
//     int left = 0;

//     while(left<right){
//     char temp = arr[left];
//     arr[left]=arr[right];
//     arr[right]= temp;

//     right--;
//     left++;
// }

//         for(char i:arr){
//             System.out.print(i+" ");
//         }
//     }

// public static void main (String ar[]){
// String str = "Ritika";
// rev(str);
// }
// }














//second type of reverse
// import java.util.*;
// public class One{

//    static void rev(String str){
//       char arr[]=str.toCharArray();

//     int right  = str.length()-1;
//     int left = 0;

//     while(left<right){
//     char temp = arr[left];
//     arr[left]=arr[right];
//     arr[right]= temp;

//     right--;
//     left++;
// }

//         for(char i:arr){
//             System.out.print(i+" ");
//         }
//     }

// public static void main (String ar[]){
// String str = "Ritika";
// rev(str);
// }
// }
















//palindrom
// import java.util.*;
// public class One{

//    static boolean rev(String str){
//     int right  = str.length()-1;
//     int left = 0;

//     while(left<right){
//     if(str.charAt(right)!=str.charAt(left)){
//         return false;
//     }

//     right--;
//     left++;
// }
//     return true;
//     }
// public static void main (String ar[]){
// String str = "naman";
// if(rev(str)){
//     System.out.println("pallindrom");
// }
// else{
//      System.out.println("not pallindrom");
// }
// }
// }




