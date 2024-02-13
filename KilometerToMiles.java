import java.util.Scanner;

public class KilometerToMiles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Convert kilometers to miles (1 kilometer = 0.621371 miles)
        double miles = kilometers * 0.621371;

        // Display the result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        scanner.close();
    }
}
