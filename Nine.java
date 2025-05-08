import java.util.Scanner;
public class Nine
{
public static void main(String ar[])

//car question 

    // {
    
    //         Scanner obj = new Scanner (System.in);
    //         System.out.println("enter your car");
    //         String name = obj.nextLine();
    //         if(name.equals("audi")){
    //             System.out.println("enter your journey in km ");
    //             int carkm = obj.nextInt();
    //             System.out.println((carkm*108)+100);

    //         }
    //         else if (name.equals("farari")){
    //             System.out.println("enter your journey in km ");
    //             int carkm2 = obj.nextInt();
    //             System.out.println((carkm2*108)+200);
    //         }
    //         else{
    //             System.out.println("Invalid");
    //         }
    // }



// leap year
// {
//             Scanner obj = new Scanner (System.in);
//             System.out.println("enter your year");
//             int year = obj.nextInt();

//             if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//             System.out.println( year + (" is a leap year."  ));
//              }
//             else
//              {System.out.println( year + (" is not a leap year." ));}
// }



// in 3 digit larger number
{
            Scanner obj = new Scanner (System.in);
             System.out.print("Enter a 3 digit number: ");
            int num = obj.nextInt();

        int max = 0;
        while (num > 0) {
            int digit = num % 10;  
            if (digit > max) {
                max = digit;       
            }
            num = num / 10;        
        }

        // Output
        System.out.println("Largest digit is: " + max);
}
    }

        