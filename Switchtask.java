import java.util.Scanner;

public class Switchtask {
    public static void main(String arr[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a category: fruits or vegetables");
        String choice = scanner.nextLine();

        switch (choice) {
            case "fruits":
                System.out.println("Choose a fruit: banana, orange, mango");
                String fruit = scanner.nextLine();

                switch (fruit) {
                    case "banana":System.out.println("You selected Banana.");
                        break;
                    case "orange":System.out.println("You selected Orange.");
                        break;
                    case "mango":System.out.println("You selected Mango.");
                        break;
                    default:System.out.println("Invalid fruit selection.");
                }
                break;

            case "vegetables":
                System.out.println("Choose a vegetable: carrot, potato, spinach");
                String vegetable = scanner.nextLine();

                switch (vegetable) {
                    case "carrot":System.out.println("You selected Carrot.");
                        break;
                    case "potato":System.out.println("You selected Potato.");
                        break;
                    case "spinach":System.out.println("You selected Spinach.");
                        break;
                    default:System.out.println("Invalid vegetable.");
                }
                break;
                    default:System.out.println("Invalid.");
        }
    }
}





