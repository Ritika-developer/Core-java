import java.util.Scanner;
public class Three
{
public static void main(String ar[])
    {
// char c = 'r';
// float f = 3.84739f;
// int i = 4738;
// double d = 4.78437498;
// boolean b = true;

// System.out.println("char = " + c);
// System.out.println("float = " + f);
// System.out.println("integer = " + i);
// System.out.println("double = " + d);
// System.out.println("boolean = " + b);

Scanner obj=new Scanner(System.in);
System.out.println("enter value");
int a ;
a=obj.nextInt();

Scanner obje=new Scanner(System.in);
System.out.println("enter value");
int b;
b=obje.nextInt();


System.out.println("multiplication = " + (a*b));
System.out.println("addition = " + (a+b));
System.out.println("subtraction = " + (a-b));
System.out.println("moduls = " + (a%b));
System.out.println("divide = " + (a/b));

    }
}