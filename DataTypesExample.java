public class DataTypesExample{
    public static void main(String[] args) {
        // Primitive Data Types
        byte smallNumber = 100;          // byte
        short shortNumber = 30000;       // short
        int age = 25;                    // int
        long population = 8000000000L;   // long (with 'L')
        
        float pi = 3.14f;                // float (with 'f')
        double price = 99.99;            // double
        
        char grade = 'A';                // char
        boolean isPass = true;           // boolean

        // Non-Primitive Data Types
        String name = "Tariq";           // String
        int[] numbers = {1, 2, 3, 4, 5}; // Array

        // Using an Object (Non-Primitive Type)
        Person person = new Person("Tariq", 25); // Object of Person class

        // Output
        System.out.println("---- Primitive Data Types ----");
        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + shortNumber);
        System.out.println("Int: " + age);
        System.out.println("Long: " + population);
        System.out.println("Float: " + pi);
        System.out.println("Double: " + price);
        System.out.println("Char: " + grade);
        System.out.println("Boolean: " + isPass);

        System.out.println("\n---- Non-Primitive Data Types ----");
        System.out.println("String: " + name);
        System.out.println("Array Element (index 0): " + numbers[0]); // Accessing first element
        System.out.println("Person Name: " + person.name);
        System.out.println("Person Age: " + person.age);
    }
}

// Class for Non-Primitive Example
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
