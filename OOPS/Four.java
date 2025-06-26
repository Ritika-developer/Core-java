//shallow copy

// class Four{
//     int b[];

//     Four(int b[]){
//         this.b=b;
//         System.out.println("parameterized constructor " + b[0]);

//     }

//     Four(Four obj){
//         this.b=obj.b;
//         System.out.print("constructor " + obj.b[0]);

//     }


//     public static void main(String args[]){
//         int b[]  = {10};
//         Four obj = new Four(b);
//         Four obj1 = new Four(obj);


//     }
// }











//deep copy
class Four{
    int b[];

    Four(int b[]){
        this.b=b;
        System.out.println("parameterized constructor " + b[0]);

    }

    Four(Four obj){
        this.b=new int[obj.b.length];
        this.b[0]=obj.b[0];
        System.out.print("constructor " + obj.b[0]);

    }


    public static void main(String args[]){
        int b[]  = {10};
        Four obj = new Four(b);
        Four obj1 = new Four(obj);

        
    }
}