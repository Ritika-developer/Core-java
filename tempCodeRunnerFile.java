int number = 12;
int counter  =0;
for (int i=1;i<=11;i++){
    if (number%i==0){
counter++;
    }
}
if (counter==2){
    System.out.print("prime number");
}
else{
        System.out.print(" not a prime number");
}