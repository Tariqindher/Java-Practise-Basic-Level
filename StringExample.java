import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Displaying the input string
        System.out.println("\nInput string: " + inputString);

        // String length
        int length = inputString.length();
        System.out.println("Length of the string: " + length);

        // Converting to uppercase and lowercase
        String upperCaseString = inputString.toUpperCase();
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Uppercase: " + upperCaseString);
        System.out.println("Lowercase: " + lowerCaseString);

        // Checking if the string contains a substring
        System.out.print("\nEnter a substring to search: ");
        String substring = scanner.nextLine();
        boolean containsSubstring = inputString.contains(substring);
        System.out.println("Does the string contain '" + substring + "'? " + containsSubstring);

        // Finding the index of a substring
        if (containsSubstring) {
            int index = inputString.indexOf(substring);
            System.out.println("Index of '" + substring + "': " + index);
        }

        // Closing the scanner
        scanner.close();
    }
}
