import java.util.Scanner;

public class Switchtask {
    public static void main(String arr[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Choose a category: fruits or vegetables");
        String choice = obj.nextLine();

        switch (choice) {
            case "fruits":
                System.out.println("Choose a fruit: banana, orange, mango");
                String fruit = obj.nextLine();

                switch (fruit) {
                    case "banana":System.out.println(" Banana.");
                        break;
                    case "orange":System.out.println(" Orange.");
                        break;
                    case "mango":System.out.println("Mango.");
                        break;
                    default:System.out.println("Invalid");
                }
                break;

            case "vegetables":
                System.out.println("Choose a vegetable: carrot, potato, spinach");
                String vegetable = obj.nextLine();

                switch (vegetable) {
                    case "carrot":System.out.println("Carrot.");
                        break;
                    case "potato":System.out.println(" Potato.");
                        break;
                    case "spinach":System.out.println(" Spinach.");
                        break;
                    default:System.out.println("Invalid ");
                }
                break;
                    default:System.out.println("Invalid.");
        }
    }
}





