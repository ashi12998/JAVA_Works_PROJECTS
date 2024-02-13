import java.util.Scanner;

public class NumberComparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int givenNumber = 25;  

        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();

        if (givenNumber > userNumber) {
            System.out.println(givenNumber + " is greater than " + userNumber);
        } else if (givenNumber < userNumber) {
            System.out.println(givenNumber + " is less than " + userNumber);
        } else {
            System.out.println(givenNumber + " is equal to " + userNumber);
        }
        scanner.close();

    }

}
