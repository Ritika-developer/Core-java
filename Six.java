import java.util.Scanner;
public class Six
{
public static void main(String ar[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Enter Integer: ");
        int i = sc.nextInt();

        System.out.print("Enter Float: ");
        float f = sc.nextFloat();

        System.out.print("Enter Double: ");
        double d = sc.nextDouble();

        System.out.print("Enter Boolean: ");
        boolean b = sc.nextBoolean();

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0); // पहला अक्षर लेंगे

        System.out.println("HERE IS YOUR ANSWER ");
        System.out.println("String: " + str);
        System.out.println("Int: " + i);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + b);
        System.out.println("Character: " + ch);
    }
}


