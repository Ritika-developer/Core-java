public class Loops {
    public static void main(String arr[]) {
        //table print
// int a =1;
// do{
// System.out.println(2*a);
// a++;
// }
// while(a<=10);


//sum of n natural number
// int n = 3;
// int res =0 ;
// for(int i=1; i<=n;i++){
//      res = res + i;
// }
//     System.out.println(res);



//factorial
// int n = 5;
// int res =1 ;
// for(int i=1; i<=n;i++){
//      res = res * i;
// }
//     System.out.println(res);




//factor
// int n = 5;
// for(int i=1; i<=n;i++){
//      if(n%i==0){
//     System.out.println(i);
// }
// }



//find  hcf 
// int num1 =12;
// int num2 =16;
// int hcf =0;
// for(int i=1;i<=num1 && i<=num2;i++){
//     if(num1%i==0 && num2%i==0){
//        hcf=i;
//     }
// }
//     System.out.println(hcf);



//find lcm
// int num1 =12;
// int num2 =18;
// int mx = (num1>num2)?num1:num2;
// int i=mx;
// while(true){
// if(i%num1==0 && i%num2==0){
//     break;
// }
//     i=i+mx;
//     }
//         System.out.println(i);




//largest digit 

// int number = 1234;
// int res = 0;
// while(number!=0){
//     int digit = number%10;
//     if (res<digit)
//         res=digit;
//     System.out.println(digit);
//     number = number/10;
// }
//     System.out.print(res);



//reverse
// int number = 1234;
// int rev = 0;
// while(number!=0){
//     int digit = number%10;
//     rev = rev*10+digit;
//     number = number/10;
// }
//     System.out.print(rev);



//prime number
// int number = 12;
// int counter  =0;
// for (int i=1;i<=11;i++){
//     if (number%i==0){
// counter++;
//     }
// }
// if (counter==2){
//     System.out.print("prime number");
// }
// else{
//         System.out.print(" not a prime number");
// }



//amstrong
// int number = 153;
// int org = number;
// int sum = 0;
// while(number!=0){
//   int  digit =number%10;
//   sum = sum+digit*digit*digit;
//   number = number /10;
// }
// if(sum==org)
// System.out.print("arms");
// else{
//     System.out.print(" not arms");
// }




// int number = 153;
// int org = number;
// int sum = 0;
// int counter = 0;
// while(number!=0){
//   int  digit =number%10;
//   counter++;
//   sum = sum+digit*digit*digit;
//   number = number /10;
// }
//   System.out.print(counter);

// if(sum==org)
// System.out.print("arms");
// else{
//     System.out.print(" not arms");
// }




//palindrom

// int number = 121;
// int palindrom = number;
// int rev = 0;
// while(number!=0){
//     int digit = number%10;
//     rev = rev*10+digit;
//     number = number/10;
// }
// if (palindrom==rev)
//     System.out.print("palindrom");
// else{
//         System.out.print(" not palindrom");
// }




//AP SERIES
// int a =1;
// int n=6;
// int d=2;
// int nterm=0;
// for (int i=a;i<=n;i++){
//    nterm =  a+i*d;
//    System.out.println(nterm);
// }


// int a =1;
// int n=5;
// int d=2;
// int nterm=0;
// for (int i=a;i<=n;i++){
//    nterm =  a+(n-1)*d;
// }
//    System.out.println(nterm);




    }
}