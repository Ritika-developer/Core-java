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
// String str = "ritika";
// rev(str);
// }
// }





//reverse
public class One{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++){
            
            int front = i;
            int back = sb.length()-1-i;//5-1-0=4

            char frontchar = sb.charAt(front);      
            char backchar = sb.charAt(back);

            sb.setCharAt(front,backchar);          
            sb.setCharAt(back,frontchar);          
        }
        //reverse
        System.out.println(sb);
        //length
        System.out.print(sb.length());
    }
}











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




//uppercase lowercase
// public class One{
//     static char uppercase(String str){
//         char arr[] = str.toCharArray();
//         for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]>='a' && arr[i]<='z'){
//             arr[i] = (char)(arr[i]-32);
//             }
//             else if(arr[i]>='A' && arr[i]<='Z'){
//             arr[i] = (char)(arr[i]+32);}
//             System.out.print(arr[i]);
            
//         }
//         return 0;
// }
//     public static void main(String arr[]){
//         String str = "RiTiKa";
//         uppercase(str);
//     }
// }








//subsequence
// public class One{
//     static boolean subseq(String str,String str2){
//         int i=0;
//         int j=0;
//         while(i<str.length() && j<str2.length()){
//             if(str.charAt(i)==str2.charAt(j)){
//                 j++;
//         }
//         i++; 
//     }
//     return j==str2.length();
// }
// public static void main(String args[]){
//     String str1 = "abcde";
//     String str2 = "bcde";

//     if(subseq(str1,str2)){
//         System.out.print("subsequence");
//     }
//     else{
//         System.out.print("not a subsequence");
//     }
//     }
// }






//valid parenthesses
// public class One{
//     static boolean subseq(String str){
//         int i=0;
//         int curly = 0;
//         int square =0;
//         int circle = 0;
//         while(i<str.length()){
//             char ch = str.charAt(i);
//             if(ch=='['){
//                 square++;
//             }
//             else if(ch==']'){
//                 square --;
//             }

//             else if(ch=='('){
//                 circle ++;
//             }
//             else if(ch==')'){
//                 circle --;
//             }

//             else if(ch=='{'){
//                 curly ++;
//             }
//             else if(ch=='}'){
//                 curly --;
//             }
//             i++;
//         }
//         return curly==0 && circle==0 && square==0;
// }
// public static void main(String args[]){
// String str = "{[()]}";
// if(subseq(str)){
//     System.out.print("yes");
// }
// else {
//     System.out.print("no");
// }
// }
// }










//anagram
// public class One{
//     static boolean anagram(String str1=abcde,String str2=ebcda){
//         if(str1.length()!=str2.length()) 
//         return false;
//         int count[]= new int[26];
//         for(int i=0;i<str1.length();i++){
//             count[str1.charAt(i)-'a']++;
//             count[str2.charAt(i)-'a']--;
//         }
//       for(int i=0;i<26;i++){
//         if(count[i]!=0)
//         return false;
//       }
//       return true;
// }
// public static void main(String args[]){
// String str1 = "abcde";
// String str2 = "ebcd";

// if(anagram(str1,str2)){
// System.out.print("anagram");
// }
// else{
//     System.out.print("not a anagram");
// }
// }
// }