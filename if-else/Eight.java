import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        int amount = 0;

        if (units > 0) {
            if (units <= 50) {
                amount = units * 10;
            } else if (units <= 100) {
                amount = (50 * 10) + (units - 50) * 20;
            } else if (units <= 150) {
                amount = (50 * 10) + (50 * 20) + (units - 100) * 30;
            } else if (units <= 200) {
                amount = (50 * 10) + (50 * 20) + (50 * 30) + (units - 150) * 40;
            } else {
                amount = (50 * 10) + (50 * 20) + (50 * 30) + (50 * 40) + (units - 200) * 50;
            }

            System.out.println("Total bill amount: " + amount);
        } else {
            System.out.println("Invalid input. Units must be greater than 0.");
        }

        sc.close();
    }
}
