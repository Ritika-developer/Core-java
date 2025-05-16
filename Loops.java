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
int num1 =12;
int num2 =18;
int mx = (num1>num2)?num1:num2;
int i=mx;
while(true){
if(i%num1==0 && i%num2==0){
    break;
}
    i=i+mx;
    }
        System.out.println(i);





    }
}