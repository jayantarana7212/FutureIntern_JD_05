import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {

    // Method to generate a random password
    public static String generatePassword(int length, boolean useUpperCase, boolean useLowerCase, boolean useNumbers,
            boolean useSpecialChars) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_=+<>?";

        StringBuilder charPool = new StringBuilder();

        // Add selected character types to the pool
        if (useUpperCase) {
            charPool.append(upperCase);
        }
        if (useLowerCase) {
            charPool.append(lowerCase);
        }
        if (useNumbers) {
            charPool.append(numbers);
        }
        if (useSpecialChars) {
            charPool.append(specialChars);
        }

        // If no character types are selected, return an error message
        if (charPool.length() == 0) {
            return "Please select at least one character type!";
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Generate password by randomly selecting characters from the pool
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get password length from user
        System.out.print("Enter the desired password length: ");
        int length = scanner.nextInt();

        // Get character type selections from the user
        System.out.print("Include uppercase letters? (true/false): ");
        boolean useUpperCase = scanner.nextBoolean();

        System.out.print("Include lowercase letters? (true/false): ");
        boolean useLowerCase = scanner.nextBoolean();

        System.out.print("Include numbers? (true/false): ");
        boolean useNumbers = scanner.nextBoolean();

        System.out.print("Include special characters? (true/false): ");
        boolean useSpecialChars = scanner.nextBoolean();

        // Generate and display the password
        String password = generatePassword(length, useUpperCase, useLowerCase, useNumbers, useSpecialChars);
        System.out.println("Generated Password: " + password);
    }
}
