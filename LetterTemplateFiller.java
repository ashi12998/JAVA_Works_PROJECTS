
public class LetterTemplateFiller {
    public static void main(String[] args) {
        // Original letter template
        String letter = "Dear <Name>, Thanks a lot";

        // Get the name from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Replace placeholder with the user's name
        String filledLetter = letter.replace("<Name>", name);

        // Display the filled letter
        System.out.println("Filled Letter:\n" + filledLetter);

        // Close the scanner
        scanner.close();
    }
}
