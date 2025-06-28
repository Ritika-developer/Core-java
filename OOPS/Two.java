
// class Two{
//     int a;
//     Two(){
//         a=10;
//     }
//     public static void main(String args[]){
//         Two obj = new Two();
//         System.out.print(obj.a);
//     }
// } 




//default value 
//is code mai default value aa rahi h constructor sai 
// class Two{
//     int a;
//     public static void main(String args[]){
//         Two obj = new Two();
//         System.out.print(obj.a);
//     }
// } 





//overloading constructor
// class Two{
//     String a;
//     int b;
//     //default 
//     Two(){
//        System.out.print("i am default constructor");
//     }
// //overloading of constructor
//     Two(int a){
//        System.out.print("i am overloaded constructor");
//     }
//     public static void main(String args[]){
//         Two obj = new Two(10);//parameter
//     }
// } 




//paramitrized constructor and copy constructor
class Two{
int b;
Two(int b){
    this.b=b;
    System.out.print("paramiterzed constructor"+" " +this.b);
}
Two(Two obj) {
    this.b=obj.b;
    System.out.print("copy constructor" +" " +this.b);
}

public static void main(String args[]){
    Two obj=new Two(10);
        Two obj1=new Two(obj);

}}