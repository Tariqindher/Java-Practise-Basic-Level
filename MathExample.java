import java.util.Scanner;
public class MathExample {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Taking input from the user
System.out.print("Enter a number: ");
double number = scanner.nextDouble();
// Absolute value
double absoluteValue = Math.abs(number);
System.out.println("Absolute value: " + absoluteValue);
// Square root
double squareRoot = Math.sqrt(absoluteValue);
System.out.println("Square root: " + squareRoot);
// Power
System.out.print("Enter an exponent: ");
double exponent = scanner.nextDouble();
double power = Math.pow(squareRoot, exponent);
System.out.println("Result of raising " + squareRoot + " to the power of "
+ exponent + ": " + power);
// Minimum and maximum
System.out.print("\nEnter another number: ");
double anotherNumber = scanner.nextDouble();

double min = Math.min(number, anotherNumber);
double max = Math.max(number, anotherNumber);
System.out.println("Minimum of " + number + " and " + anotherNumber + ": "
+ min);
System.out.println("Maximum of " + number + " and " + anotherNumber + ": "
+ max);
// Rounding
double roundedNumber = Math.round(number);
System.out.println("\nRounded value of " + number + ": " + roundedNumber);
// Trigonometric functions
double radians = Math.toRadians(45); // converting degrees to radians
double sineValue = Math.sin(radians);
double cosineValue = Math.cos(radians);
double tangentValue = Math.tan(radians);
System.out.println("\nSine of 45 degrees: " + sineValue);
System.out.println("Cosine of 45 degrees: " + cosineValue);
System.out.println("Tangent of 45 degrees: " + tangentValue);
// Closing the scanner
scanner.close();
}
}
