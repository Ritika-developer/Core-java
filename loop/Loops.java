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
// int n = 7;
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
//     if (res<digit){
//         res=digit;
// }
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


//gp 
// nth = a*r^(n-1);
// a=first term 
// r = common ratio
// n=5

// int a =1;
// int n=6;
// int r=3;
// double nterm=0;
// for (int i=a;i<=n;i++){
//    nterm =  a*Math.pow(r,(n-1));
// }
//    System.out.println(nterm);


// int a =1;
// int n=6;
// int r=3;
// double nterm=0;
// for (int i=a;i<=n;i++){
//    nterm =  a*Math.pow(r,i);
//       System.out.println(nterm);
// }


// int a =1;
// int n=6;
// int r=3;
// for (int i=0;i<n;i++){
//       System.out.println(a);
//       a=r*a;
// }



//fabonacci series
// int i=1;
// int n=5;
//  int first = 1;
//  int second = 2;
// while(i<=n)
// {
//  if(i==1){
//     System.out.println(i);
//  i++;
//  continue;
//  }
//  if(i==2){
//       System.out.println(i);
//  i++;
// continue;
//  }
//  int next = first+second;
//  first=second;
//  second=next;
//  i++;
// System.out.println(next);
// }




//pattern
//right angle traingle
//  for(int r=1;r<=5;++r){
//     for(int c=1;c<=5;++c){
//         if(c<=r)
//         {
//             System.out.print("*");
//         }
//         else{
//          System.out.print(" ");
//         }
//     }
//     System.out.println();
//  }

//inverted left
//  for(int r=1;r<=5;++r){
//     for(int c=1;c<=5;++c){
//         if(c>=r)
//         {
//             System.out.print("*");
//         }
//         else{
//          System.out.print(" ");
//         }
//     }
//     System.out.println();
//  }



//left angle triangle
//  for(int r=1;r<=5;++r){
//     for(int c=1;c<=5;++c){
//         if(c>=6-r )
//         {
//             System.out.print("*");
//         }
//         else{
//          System.out.print(" ");
//         }
//     }
//     System.out.println();
//  }



//inverted right angle
//  for(int r=1;r<=5;++r){
//     for(int c=1;c<=5;++c){
//         if(c<=6-r )
//         {
//             System.out.print("*");
//         }
//         else{
//          System.out.print(" ");
//         }
//     }
//     System.out.println();
//  }



//pattern
//  for(int r=1;r<=5;++r){
//     for(int c=1;c<=9;++c){
//         if(c>=6-r && c<=4+r)
//         {
//             System.out.print("*");
//         }
//         else{
//          System.out.print(" ");
//         }
//     }
//     System.out.println();
//  }


//lower parmid
//  for(int r=1;r<=5;++r){
//     for(int c=1;c<=9;++c){
//         if(c>=r && c<=10-r)
//         {
//             System.out.print("*");
//         }
//         else{
//          System.out.print(" ");
//         }
//     }
//     System.out.println();
//  }



//daimond
// int a=0;
//  for(int r=1;r<=9;++r){
//     a=(r<=5)?++a:--a;
//     for(int c=1;c<=9;++c){

//         if(c>=6-a && c<=4+a)
//         {
//             System.out.print("*");
//         }
//         else{
//          System.out.print(" ");
//         }
//     }
//     System.out.println();
//  }


//1-15
// int a=0;
//  for(int r=1;r<=5;++r){
//     for(int c=1;c<=5;++c){
//         if(c<=r)
//         {
//             System.out.print(++a);
//         }
//         else{
//          System.out.print(" ");
//         }
//     }
//     System.out.println();
//  }


//11
// int a=0;
//  for(int r=1;r<=5;++r){
//     for(int c=1;c<=5;++c){
//         if(c<=r)
//         {
//             System.out.print(r);
//         }
//         else{
//          System.out.print(" ");
//         }
//     }
//     System.out.println();
//  }


//abcd
// char a='a';
//  for(int r=1;r<=5;++r){
//     for(int c=1;c<=5;++c){
//         if(c<=r)
//         {
//             // System.out.print((char)(r+64));
//             System.out.print((char)(r+96));
//         }
//         else{
//          System.out.print(" ");
//         }
//     }
//     System.out.println();
//  }


    }
}