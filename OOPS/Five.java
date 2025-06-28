//incapsulation:- data binding  {member variable ko member function (mai)}
//abstraction :- jo jaruri h bo dekhe or baki hide kare

//four pillar :- 1.incapsulation , abtraction
// class Five{
//     int a;
//     String  b;

//     void bind(int a,String b){
//         this.a=a;
//         this.b=b;//member variable
//     }

//     void display (){
//         System.out.println(a + " " + b);
//     }

//     public static void main(String args[])
//     {
//         Five obj =new Five();
//         obj.bind(10 , "ritika");//abstraction
//         obj.display();
//     }

// }








//inharitans
//child parent ki karta h 
class Five{
    int a;
    String  b;
}
   class Six extends Five{
    public static void main(String args[])
    {
        
        Six obj =new Six();
        obj.a=10;
        obj.b="ritika";

        System.out.println(obj.a+" "+obj.b);
    }
   }

