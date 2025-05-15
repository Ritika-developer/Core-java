public class Switch{
    public static void main(String arr[]){
        int choice = 2;

        //1st
        // switch(choice)
        // {
        //     case 1 -> { System.out.print("one");}
        //     case 2 -> { System.out.print("two"); }
        //     default -> { System.out.print("invalid");}
        // };
    
//2nd
    // switch(choice){
    //     case 1 : System.out.print("one");
    //     break;
    //     case 2 : System.out.print("two");
    //     break;
    //     default : System.out.print("default");
    // }

//3rd
String result ;
result=switch(choice){
        case 1 -> "one";
        case 2 -> "two";
        default -> "default";
    };
    System.out.print(result);
    }
}
        //c++ switch and java switch
        //c++ = . int char 
        // java =  byte short int long char string
        // statement / expression 
        // return type
        //  fall through condition without break
        //  logical expression and or not 
        // c++ = :  , java = -> :- java 7 kai baad yeh modern tecnic devlope hue h 


