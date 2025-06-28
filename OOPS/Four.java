// shallow copy

class Four{
    int b[];

    Four(int b[]){
        this.b=b;
        System.out.println("parameterized constructor " + b[0]);
    }

    Four(Four obj){
        this.b=obj.b;
        System.out.print("constructor " + obj.b[0]);
    }


    public static void main(String args[]){
        int b[]  = {19};
        Four obj = new Four(b);
        Four obj1 = new Four(obj);


    }
}




//or 
// class Four{
//     int b[];

//     Four(int b[]){
//         this.b=b;
//     }

//     Four(Four obj){
//         this.b=obj.b;
//     }


//     public static void main(String args[]){
//         int b[]  = {10};
//         Four obj = new Four(b);
//         Four obj1 = new Four(obj);

//         System.out.println(obj.b[0]);
//         System.out.println(obj1.b[0]);

//         obj.b[0] = 29;

//         System.out.println(obj.b[0]);
//         System.out.println(obj1.b[0]);
//     }
// }






// //deep copy

// class Four{
//     int b[];

//     Four(int b[]){
//         this.b=b;//b address provide kar raha h 
//     }

//     Four(Four obj){
//         this.b=new int[obj.b.length];
//         this.b[0]=obj.b[0];
//     }


//     public static void main(String args[]){
//         int b[]  = {17};
//         Four obj = new Four(b);
//         Four obj1 = new Four(obj);

//         System.out.println("parameterized constructor " + obj.b[0]);
//         System.out.println("constructor " + obj1.b[0]);

//         obj.b[0]=45;
//         System.out.println("parameterized constructor " + obj.b[0]);
//         System.out.print("constructor " + obj1.b[0]);
//     }
// }







