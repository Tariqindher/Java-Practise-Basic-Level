public class ArrayExample1D {
public static void main(String[] args) {
// Declaring and initializing an array of integers
int[] numbers = {1, 2, 3, 4, 5};
// Accessing elements of the array
int thirdNumber = numbers[2]; // Accessing the third element (index 2)
System.out.println("Third number is: " + thirdNumber);
// Iterating through the array
System.out.println("Elements of the array:");
for (int i = 0; i < numbers.length; i++) {
System.out.println("Element at index " + i + ": " + numbers[i]);
}
// Array of strings
String[] names = {"Alice", "Bob", "Charlie"};
// Accessing elements of the array
String firstName = names[0];
System.out.println("First name: " + firstName);
}
}

