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



class Two{
    String a;
    int b;
    //default
    Two(){
       System.out.print("i am default constructor");
    }
//overloading of constructor
    Two(int a){
       System.out.print("i am overloaded constructor");
    }
    public static void main(String args[]){
        Two obj = new Two(10);//parameter
    }
} 