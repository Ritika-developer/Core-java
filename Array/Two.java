import java.util.*;
public class Two{
public static void main (String ar[]){


//sum of arr 
// Scanner obj = new Scanner(System.in);
// System.out.print("enter the size of array ");
// int size = obj.nextInt();

// int arr[] = new int[size];
// System.out.print("enter the value of  array ");
// for(int i=0 ; i<arr.length;i++){
//     arr[i]=obj.nextInt();
// }

// for(int arr1:arr)
// {
//     System.out.print (arr1 + " ");
// }

// int sum =0 ;
// for(int i=0;i<arr.length;i++){
//     sum = sum+arr[i];
// }
// System.out.print(" ");
// System.out.print("sum of arr is " + sum);




//reverse of arr

// Scanner obj = new Scanner(System.in);
// System.out.print("enter the size of array ");
// int size = obj.nextInt();
// int arr[] = new int[size];
// System.out.print("enter the value of  array ");
// for(int i=0 ; i<arr.length;i++){
//     arr[i]=obj.nextInt();
// }
// for(int arr1:arr)
// {
//     System.out.print (arr1);
// }
//     System.out.println(" ");


//  for (int i = 0; i < arr.length / 2; i++) {
// int temp = arr[size - i -1];
// arr[size -i-1]=arr[i];
// arr[i]=temp;
//  }
// for(int i : arr){
//     System.out.print(i);
// }




//pallendrom
//use flag
// int arr[]={1,2,3,2,1};
// boolean pallindrom = true;
// int n=arr.length;
// for(int i=0;i<n-1;i++){
//     if(arr[i]!=arr[n-i-1]){
//         pallindrom=false;
//         break;
//     }
// }
// if(pallindrom){
//     System.out.print("palindrom");
// }
// else{
//     System.out.print("not palindrom");
// }



//asending order

// int arr[] = {1,4,2,5,6,3};
// int n = arr.length;
// for(int i = 0 ; i<n ;i++){
//     for(int j = i+1 ;j<n ;j++){
//         if(arr[i]>arr[j]){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//         }
//     }
//     System.out.print(arr[i]);
// }



//2 way
// int arr[] = {1,4,2,5,6,3};
// int n = arr.length;
// for(int i = 0 ; i<n-1 ;i++){
//     for(int j = i+1 ;j<n ;j++){
//         if(arr[i]>arr[j]){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//         }
//     }
//     System.out.print(arr[i]);
// }


//sir ka logic
// int arr[] = {1,4,2,5,6,3};
// int n = arr.length;
// for(int i = 0 ; i<n-1 ;i++){
//     for(int j = 0 ;j<n-1-i ;j++){
//         if(arr[j]>arr[j+1]){

//         int temp = arr[j];
//         arr[j] = arr[j+1];
//         arr[j+1] = temp;
//         }
//     }
// }
// System.out.print("reverse array is = ");
// for(int i=0 ; i<n ; i++){
//       System.out.print(arr[i] + " "); 
// }





//desending
// int arr[] = {1,4,2,5,6,3};
// int n = arr.length;
// for(int i = 0 ; i<n ;i++){
//     for(int j = i+1 ;j<n ;j++){
//         if(arr[i]<arr[j]){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//         }
//     }
//     System.out.print(arr[i]);
//     System.out.print(" , ");
// }





//minimum value
int arr[] = {1,4,2,5,6,3};
int n = arr.length;
int max = arr[0];
for(int i = 0 ; i<n ;i++){
if(arr[i]>max){
    max = arr[i];
}
}
System.out.print(max);



//maximum value
// int arr[] = {1,4,2,5,6,3};
// int n = arr.length;
// for(int i = 0 ; i<n-1 ;i++){
//     for(int j = i+1 ;j<n ;j++){
//         if(arr[i]<arr[j]){
//         int temp = arr[i];
//         arr[i] = arr[j];              
//         arr[j] = temp;
//         }
//     }
// }
// for(int i=0;i<1;i++){
//         System.out.print(arr[i]);
// }











}
    }