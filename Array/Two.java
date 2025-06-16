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





//maximum value
// int arr[] = {1,4,2,5,6,3};
// int n = arr.length;
// int max = arr[0];
// for(int i = 0 ; i<n ;i++){
// if(arr[i]>max){
//     max = arr[i];
// }
// }
// System.out.print(max);



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


// int mx = 0;
// int arr[]={1,3,4,17,15};
// for( int i=0;i<5; i++){
//     if(arr[i]>mx){
//         mx=arr[i];
//     }
// }
// System.out.print(mx);


//move zero in last 
// int arr[] = {1,0,3,0,1};
// int n = arr.length;
// int j =0;
// for(int i = 0 ; i<n ;i++){
// if(arr[i]!=0){
//     int temp = arr[i];
//     arr[i] = arr[j] ;
//     arr[j] = temp;
//     j++;
// }
// }
// for(int arr1 : arr){
//     System.out.print(arr1);
//     }



//move zero at last
// int arr[] = {10,0,9,0,5};
// int n = arr.length;
// int j =0;
// for(int i = 0 ; i<n ;i++){
// if(arr[i]!=0){
//     arr[j] = arr[i] ;
//     j++;
// }
// }
// for(int i=j ; i<n ; i++){
//     arr[i]=0;
// }
// for(int arr1 : arr){
//     System.out.print(arr1 + " ");
//     }


// second largest
// int arr[] = {1,0,3,0,1};
// int n = arr.length;

// for(int i = 0 ; i<n ;i++){
//     for(int j=i+1 ; j<n ; j++){
// if(arr[i]<arr[j]){
//     int temp = arr[i];
//     arr[i] = arr[j] ;
//     arr[j] = temp;
// }
// }
// }
// for(int i=1 ;i<2;i++){
//     System.out.print(arr[i]);
// }



// sir ka logic second largest digit
// int arr[]={9,6,4,8,7,2};
// int n= arr.length;
// int max = arr[0] ;
// int smax = 0;
// for(int i=0 ;i<n ;i++){
//     if(arr[i]>max){
//         max = arr[i];
//     }
// }
// System.out.print(max);

// for(int i=0 ;i<n ;i++){
//     if(arr[i]>smax && arr[i]!=max){
//         smax = arr[i];
//     }
// }
//        System.out.print(smax);



// int arr[] = {5,3,6,3,4,2};
// int k = 2;
// for(int i = 0 ; i<k ; i++){
//     for(int j=i+1 ; j<6 ;j++){
//         if(arr[j]>arr[i]){
//             int temp  = arr[j];
//             arr[j] = arr[i];
//             arr[i] = temp;
//         }
//     }
// }
// System.out.print(arr[k-1]);






//duplicate array
// int arr[] = {1,2,3,2,1};
// int n= arr.length;
// for(int i = 0 ; i<n ;i++){
//     for(int j=i+1 ; j<n ; j++){
//         if(arr[i]==arr[j]){
//             arr[j]=-1;
//         }
//     }
//     }
// for(int i=0 ;i<n;i++){
//     System.out.print(arr[i]);
// }

//duplicate // remove dulicate
// int arr[]={3,2,1,3,2};
// for(int i=0 ; i<5 ; i++){
//     boolean dup = false;
//     for(int j = i+1 ; j<5 ; j++){
//         if(arr[i]==arr[j] && arr[i]!=-1){
//             dup = true;
//             arr[j] = -1;
//         }
//     }
//     if(dup = true && arr[i]!=-1){
//         System.out.println(arr[i]);
//     }
// }


//unique :-     if(dup != true && arr[i]!=-1){
//unique
// int arr[] = {1,2,3,2,1};
// int n= arr.length;
// for(int i = 0 ; i<n ;i++){
//     boolean check = false;
//     for(int j=i+1 ; j<n ; j++){
//         if(arr[i]==arr[j]){
//             check = true;
//             arr[j]=-1;
//         }
//     }
    
// if(check==false  &&   arr[i]!=-1){
//     System.out.print(arr[i]);
// }
// }



//frequency
// int arr[] = {1,2,3,2,1};
// int n = arr.length;
// int counter = 0;
// for(int i=0 ; i<n ;i++){
// if (arr[i]!= -1){
//     counter =1;
// }
//     for(int j=i+1 ; j<n ; j++){
//         if(arr[i]==arr[j]){
//             counter++;
//             arr[j] =  -1;
//         }
//     }
//             System.out.println(arr[i]  + " is " + counter); 
// }


//sir wala code 
// int arr[] = {10,11,23,10,9,10};
// int n  =arr.length;
// for(int i=0;i<n;i++){
//      int count = 1;
//     for(int j=i+1; j<n ; j++){
// if(arr[i]==arr[j]){
//     count++;
//     arr[j]=-1;
// }
//     }
//     if(arr[i]!=-1){
//     System.out.println(arr[i] + "is" + count);
//     }
// }




//mising number in an array
// int arr[]= {1,3,5,7,9};
// int n = arr.length;
// for(int i=0 ; i<n-1 ;i++){
//     if(arr[i+1]-arr[i] >1){
//         System.out.println(arr[i]+1);
//     }
// }




// multiple missing number
// int arr[]={1,3,7,9,11,15};
// int s=arr.length;
// for(int i=0;i<s-1;i++){
//     if(arr[i+1]-arr[i]>1){
//         for(int j=arr[i]+1 ; j<arr[i+1] ; j++)
//         System.out.println(j);
//     }
// }
















 

}
    }