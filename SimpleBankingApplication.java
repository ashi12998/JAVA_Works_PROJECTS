import java.util.Scanner;
public class SimpleBankingApplication {
    private static double balance = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
         System.out.println("welcome to Simple Banking Application!");
         boolean isRunning = true;
         while (isRunning){
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                deposit();
                break;
                case 2: withdraw();
                break;
                case 3:
                      checkBalance();
                      break;
                      case 4: 
                      isRunning = false;
                      System.out.println("Thank you for using Simple Banking Application!");
                      break ;
                      default:
                      System.out.println("Invalid choice. please try again.");
            }
            
         }
         scanner.close();
        }
         private static void displayMenu(){
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:");
         }
         private static void deposit() {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            if (amount > 0) {
                balance += amount;
                System.out.println("Amount deposited successfully.");
            } else {
                System.out.println("Invalid amount. Please enter a positive value.");
            }
        }
    
        private static void withdraw() {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Amount withdrawn successfully.");
            } else if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                System.out.println("Invalid amount. Please enter a positive value.");
            }
        }
    
        private static void checkBalance() {
            System.out.println("Your current balance is: " + balance);
        }
    
    }

