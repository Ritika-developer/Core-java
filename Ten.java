import java.util.Scanner;
public class Ten
{
    public static void main(String ar[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter your choice if you want to select defaul car or choice of you  ");
        String choice = obj.next();
        if(choice.equals("default"))
        {

            int rental = 1000;
            System.out.println("your rental is 1000 enter your trip distance");
            int distance=obj.nextInt();
            if (distance>500)
            {
                int fair;
                int discount  = 1000;
                fair = 1000 + distance * 10 - distance;
                System.out.println(fair);
            }
            else
            {
                int fair;
                fair = 1000 + distance * 10;
                System.out.println(fair);
            }
        }
        else
        {
            System.out.print("enter your choice from suzuki, tata, toyato");
            choice = obj.next();
            if(choice.equals("suzuki"))
            {
                int rental = 2000;
            System.out.println("your rental is 2000 enter your trip distance");
                int distance  = obj.nextInt();
                if (distance>500)
              {
                int fair;
                int discount = 1000;
                fair = 1000 + distance * 20 - discount;
                System.out.println(fair);
         }
                else
                {
                    int fair;
                fair = 1000 + distance * 10;
                System.out.println(fair);
                }
            }
            else if(choice.equals("tata"))
            {
                int rental = 3000;
                System.out.println("your rental is 3000 enter your trip distance");
                int distance  = obj.nextInt();
                if (distance>500)
                {
                int fair;
                int discount = 1000;
                fair = 1000 + distance * 30 - discount;
                System.out.println(fair);
            }
            else
            {
                int fair;
                fair = 3000 + distance * 30;
                System.out.println(fair);
            }
        }
        else if(choice.equals("toyato"))
        {
            {
            int rental = 4000;
                System.out.println("your rental is 4000 enter your trip distance");
                int distance  = obj.nextInt();
                if (distance>500)
                {
                int fair;
                int discount = 1000;
                fair = 1000 + distance * 40 - discount;
                System.out.println(fair);
        }
        else 
        {
                 int fair;
                fair = 4000 + distance * 40;
                System.out.println(fair);
        }
    }
}
else{
    System.out.print("not allowed");
}
    }
    }
    }