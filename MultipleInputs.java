import java.util.Scanner;

public class MultipleInputs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();  // Integer input

        System.out.print("Enter a decimal: ");
        double decimal = sc.nextDouble();  // Double input

        sc.nextLine(); // To clear the buffer after nextInt() or nextDouble()

        System.out.print("Enter a string: ");
        String text = sc.nextLine();  // String input

        System.out.println("\nYou entered:");
        System.out.println("Integer: " + num);
        System.out.println("Decimal: " + decimal);
        System.out.println("String: " + text);
    }
}
