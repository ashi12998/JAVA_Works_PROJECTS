import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter thr income amount");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);
        System.out.println("Tax to be paid " + tax);
        scanner.close();

    }

    public static double calculateTax(double income) {
        double tax = 0.0;
        if (income > 1000000) {
            tax = (income - 1000000) * 0.3 + (500000 - 250000) * 0.2 + (500000) * 0.05;
        } else if (income > 500000) {
            tax = (income - 500000) * 0.2 + (500000 - 250000) * 0.05;
        } else if (income > 250000) {
            tax = (income - 250000) * 0.05;
        }
        return tax;
    }
}
