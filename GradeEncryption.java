import java.util.Scanner;

public class GradeEncryption {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the grade");
        char grade  = scanner.next().charAt(0);
        char encryptedGrade = encrypt(grade);
        System.out.println("Encrypted Grade:" +encryptedGrade);

        char decryptedGrade = decrypt(encryptedGrade);
    System.out.println("Decrypted Grade:" + decryptedGrade);
    scanner.close();
    }
    public static char encrypt(char grade){
        return (char) (grade + 8);

    }
    public static char decrypt(char encryptedGrade){
        return (char)(encryptedGrade - 8);
        
    }
    }

