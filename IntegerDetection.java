import java.util.Scanner;

public class IntegerDetection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        // Check if the input is an integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println(number + " is an integer.");
        } else {
            String input = scanner.next();
            System.out.println(input + " is not an integer. Please enter a valid integer.");
        }

        scanner.close();
    }
}
