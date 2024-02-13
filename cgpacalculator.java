import java.util.Scanner;

public class cgpacalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for subject 1 (out of 100): ");
        double subject1Marks = scanner.nextDouble();

        System.out.print("Enter marks for subject 2 (out of 100): ");
        double subject2Marks = scanner.nextDouble();

        System.out.print("Enter marks for subject 3 (out of 100): ");
        double subject3Marks = scanner.nextDouble();

        // Calculate CGPA
        double totalMarks = subject1Marks + subject2Marks + subject3Marks;
        double averageMarks = totalMarks / 3.0;
        double cgpa = averageMarks / 10.0;

        // Display CGPA
        System.out.println("CGPA: " + cgpa);

        scanner.close();
    }
}
