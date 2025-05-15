import java.util.Scanner;

public class Switchtask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a category: fruits or vegetables");
        String category = scanner.nextLine().toLowerCase();

        switch (category) {
            case "fruits":
                System.out.println("Choose a fruit: banana, orange, mango");
                String fruit = scanner.nextLine().toLowerCase();

                switch (fruit) {
                    case "banana":
                        System.out.println("You selected Banana. Rich in potassium!");
                        break;
                    case "orange":
                        System.out.println("You selected Orange. Great source of Vitamin C!");
                        break;
                    case "mango":
                        System.out.println("You selected Mango. King of fruits!");
                        break;
                    default:
                        System.out.println("Invalid fruit selection.");
                }
                break;

            case "vegetables":
                System.out.println("Choose a vegetable: carrot, potato, spinach");
                String vegetable = scanner.nextLine().toLowerCase();

                switch (vegetable) {
                    case "carrot":
                        System.out.println("You selected Carrot. Good for eyesight!");
                        break;
                    case "potato":
                        System.out.println("You selected Potato. Energy booster!");
                        break;
                    case "spinach":
                        System.out.println("You selected Spinach. Full of iron!");
                        break;
                    default:
                        System.out.println("Invalid vegetable selection.");
                }
                break;

            default:
                System.out.println("Invalid category selection.");
        }

        scanner.close();
    }
}