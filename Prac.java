//print an array
import java.util.*;
// public class Prac{
//         public static void main(String args[]){
//                 Scanner obj = new Scanner(System.in);

//                 System.out.print("enter a size of array");
//                 int size = obj.nextInt();

//                 int arr[] = new int[size];
//                 System.out.print("enter an array");
//                 for(int i=0;i<arr.length;i++){
//                         arr[i] = obj.nextInt();
//                 }

//                 for(int a:arr){
//                         System.out.print(a);
//                 }
//         }
// }









//sum of array
// public class Prac{
//         public static void main(String args[]){
//                 int arr[] = {2,6,3,7,4};
//                 int sum = 0;

//                 for(int i=0;i<arr.length;i++){
//                         sum = sum+arr[i];
//                 }

//                 System.out.print(sum);
//         }
// }




//reverse
// public class Prac{
//         public static void main(String args[]){
//                 int arr[] = {1,2,3,4};

//                 for(int i=0;i<arr.length/2;i++){
//                         int temp = arr[arr.length-i-1];
//                         arr[arr.length-i-1] = arr[i];
//                         arr[i] = temp;
//                 }

//                 for(int a:arr){
//                         System.out.print(a);
//                 }
//         }
// }







//pallindrome
// public class Prac{
//         public static void main(String args[]){
//                 int arr[] = {2,3,4,2};
//                 boolean pallindrome = true;
//                 int j=arr.length-1;
//                 for(int i=0;i<arr.length;i++){
//                         if(arr[i]!=arr[j]){
//                           pallindrome = false;
//                         }
//                         j--;
//                 }
//                 if(pallindrome){
//                         System.out.print("pallindrome");
//                 }
//                 else{
//                         System.out.print("not pallindrome");
//                 }
//         }
// }






//assending
// public class Prac{
//         public static void main(String args[]){
//                 int arr[] = {5,3,8,2,4};
//                 for(int i=0;i<arr.length;i++){
//                         for(int j=i+1;j<arr.length;j++){
//                                 if(arr[i]>arr[j]){
//                                         int temp = arr[i];
//                                         arr[i] = arr[j];
//                                         arr[j] = temp;
//                                 }
//                         }
//                 }
//               for(int a:arr){
//                 System.out.print(a);
//               }
//         }
// }






//maximum
// public class Prac{
//         public static void main(String args[]){
//                 int arr[] = {5,3,8,2,4};
//                 int mx = 0;
//                 for(int i=0;i<arr.length;i++){
//                        if(arr[i]>mx){
//                         mx=arr[i];
//                        }
//                         }
//                         System.out.print(mx);
//         }
//         }







//move zero at last
// public class Prac{
//         public static void main(String args[]){
//                 int arr[] = {5,0,8,0,4};

//                 for(int i=0;i<arr.length;i++){
//                         for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==0){
//                         int temp = arr[i];
//                         arr[i] = arr[j];
//                         arr[j] = temp;
//                 }
//                         }
//         }
//         for(int a:arr){
//                 System.out.print(a);
//         }
//         }
// }









//find duplicate
// public class Prac{
//         public static void main(String args[]){
//                 int arr[] = {5,4,8,5,4};

//                 for(int i=0;i<arr.length;i++){
//                         for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                         arr[j] = -1;
//                 }
//                         }
//         }
//         for(int a:arr){
//                 System.out.print(a);
//         }
//         }
// }











//remove duplicate
// public class Prac{
//         public static void main(String args[]){
//                 int arr[] = {5,4,8,5,4};

//                 for(int i=0;i<arr.length;i++){
//                         for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                         arr[j] = -1;
//                 }
//                         }
//                         if(arr[i]!=-1){
//                                 System.out.print(arr[i]);
//                         }
//         }

//         }
// }







//frequency
// public class Prac{
//         public static void main(String args[]){
//                 int arr[] = {5,4,8,5,4};

//                 for(int i=0;i<arr.length;i++){
//                         int count =1;
//                         for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                         arr[j]  =-1;
//                       count++;
//                 }
//                         }
//                 if(arr[i]!=-1){
//                System.out.println(arr[i] + " is " + count);
//                 }
//         }
// }}







//unique
// public class Prac{
//         public static void main(String args[]){
//                 int arr[] = {5,4,8,5,4};

//                 for(int i=0;i<arr.length;i++){
//                         int count =1;
//                         for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                         arr[j]  =-1;
//                       count++;
//                 }
//                         }
//                 if(arr[i]!=-1 && count==1){
//                System.out.println(arr[i]);
//                 }
//         }
// }}




//second largest
// public class Prac{
//         public static void main(String args[]){
//                 int arr[] = {5,2,8,6,4};
//                       for(int i=0;i<arr.length;i++){
//                         for(int j=i+1;j<arr.length;j++){
//                                 if(arr[i]<arr[j]){
//                                 int temp = arr[i];
//                                 arr[i] = arr[j];
//                                 arr[j] = temp;
//                                 }
//                         }
//         }
//         for(int i=1;i<2;i++){
//                 System.out.print(arr[i]);
//         }
// }}









//kth largest
// public class Prac{
//         public static void main(String args[]){
//                 int arr[] = {5,2,8,6,4};
//                 int k = 3;
//                       for(int i=0;i<k;i++){
//                         for(int j=i+1;j<arr.length;j++){
//                                 if(arr[i]<arr[j]){
//                                 int temp = arr[i];
//                                 arr[i] = arr[j];
//                                 arr[j] = temp;
//                                 }
//                         }
//         }     
//                 System.out.print(arr[k-1]);
// }}






//missing number
// public class Prac{
//         public static void main(String args[]){
//                 int arr[] = {1,3,5,7,9};
//                       for(int i=0;i<arr.length-1;i++){
//                        if(arr[i+1]-arr[i]>1){
//                 System.out.print(arr[i]+1);
//                        }
//         }     
// }}







//multi missing
// public class Prac{
//         public static void main(String args[]){
//                 int arr[] = {1,5,7,11};
//                       for(int i=0;i<arr.length-1;i++){
//                        if(arr[i+1]-arr[i]>1){
//                 for(int j=arr[i]+1;j<arr[i+1];j++){
//                         System.out.print(j);
//                 }
//                        }
//         }     
// }}