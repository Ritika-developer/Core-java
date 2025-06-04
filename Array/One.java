//to store multiple elements (1,2,3) of same datatypes
//array stored where in stack / in heap :- array store in heap = object 
//array :- declaration , instantisation , initialization , destruction
//property :- data member 

import java.util.*;
public class One{
    public static void main (String ar[]){
/*
        //declaration 
        int a ;
        int arr1[];
        int[] arr2;
        int []arr3;
        //invalid
        // int arr[5];



        //instance
        int [] arr20 = new int[20];
        // int[] arr = new int[];



        //initialization
        int arr[]={1,2,3,4};
        int arr10[] =new int[]{1,2,3};
        //int arr11[]=new int[7]{1,2,3,4};
        //int arr[3]={1,2,3};

*/


//dynamic initialization
// input array and print

Scanner obj = new Scanner(System.in);
System.out.print("enter the size of array ");
int size = obj.nextInt();
int arr[] = new int[size];
System.out.print("enter the value of  array ");
for(int i=0 ; i<arr.length;i++){
    arr[i]=obj.nextInt();
}
for(int arr1:arr)
{
    System.out.print (arr1);
}





    }
}