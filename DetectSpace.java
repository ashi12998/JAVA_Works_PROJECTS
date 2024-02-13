import java.util.Scanner;
public class DetectSpace {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a String");
        String inputString = scanner.nextLine();

         boolean hasDoubleSpace = detectDoubleSpace(inputString);
         boolean hasTripleSpace = detectTripleSpace(inputString);
         if (hasDoubleSpace){
            System.out.println("The string contain double space.");
         } else {
            System.out.println("The string Does not contain double space.");
         }
         if (hasTripleSpace){
            System.out.println("The string contain triple spaces ");
         } else {
            System.out.println("The string does not contain triple spaces");

         }
         scanner.close();
         }
         private static boolean detectDoubleSpace(String str){
            return str.contains(" ");
         }
         private static boolean detectTripleSpace(String str){
            return str.contains(" ");
         }
    }
    

 