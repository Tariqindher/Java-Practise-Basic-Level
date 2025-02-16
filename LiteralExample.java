public class LiteralExample {
public static void main(String[] args) {
// Integer literals
int number = 10;
int binaryNumber = 0b1010; 
int octalNumber = 012;
int hexNumber = 0xA;
// Floating-point literals
double doubleValue = 3.14;
float floatValue = 3.14f;
double exponentValue = 6.022e23; // Floating-point literal in exponent form
// Character literals
char character = 'A';
char unicodeChar = '\u0041';
// String literals
String str = "Hello, World!";
// Boolean literals
boolean boolTrue = true;
boolean boolFalse = false;
// Null literal
Object obj = null;
// Printing the values
System.out.println("Integer literals:");
System.out.println("number: " + number);
System.out.println("binaryNumber: " + binaryNumber);
System.out.println("octalNumber: " + octalNumber);
System.out.println("hexNumber: " + hexNumber);
System.out.println("\nFloating-point literals:");
System.out.println("doubleValue: " + doubleValue);
System.out.println("floatValue: " + floatValue);
System.out.println("exponentValue: " + exponentValue);
System.out.println("\nCharacter literals:");
System.out.println("character: " + character);
System.out.println("unicodeChar: " + unicodeChar);
System.out.println("\nString literals:");
System.out.println("str: " + str);
System.out.println("\nBoolean literals:");
System.out.println("boolTrue: " + boolTrue);
System.out.println("boolFalse: " + boolFalse);
System.out.println("\nNull literal:");
System.out.println("obj: " + obj);
}
}