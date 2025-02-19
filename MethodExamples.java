
// A method is a block of code designed to perform a specific task. 
// It helps in code reusability, modularity, and better organization.

//Types Of METHOD
// 1.Predefined Methods (Built-in Methods)


//2. User Defined Method
//Def: Methods created by the programmer to perform specific operations.

//Static Method
// Declared using the static keyword.
// Can be called without creating an object.

//Method Overloading
// Method Overloading: Defining multiple methods with the same name but different parameters in the same class.  
// It allows compile-time polymorphism by changing the number, type, or order of parameters.  

//Overriding
// Method Overriding: Redefining a method in a subclass that already exists in the parent class with the same signature.  
// It enables runtime polymorphism, allowing a subclass to provide a specific implementation of a parent class method.  


public class MethodExamples {

    // 1. Method with no return type (void)
    public void greet() {
        System.out.println("Hello, welcome to Java!");
    }

    // 2. Method with a return type (int)
    public int add(int a, int b) {
        return a + b;
    }

    // 3. Method with a parameter
    public void displayMessage(String name) {
        System.out.println("Hello, " + name + "! Have a great day.");
    }

    // 4. Static method (can be called without creating an object)
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // 5. Method Overloading (Same method name, different parameters)
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // 6. Method Overriding (Using inheritance)
    static class Parent {
        public void show() {
            System.out.println("Parent class method");
        }
    }

    static class Child extends Parent {
        @Override
        public void show() {
            System.out.println("Child class method (Overridden)");
        }
    }

    public static void main(String[] args) {
        // Creating an object of the class
        MethodExamples obj = new MethodExamples();



        double squareRoot = Math.sqrt(25);  // Built-in method
        System.out.println("Square Root of 25: " + squareRoot);

        // Calling instance methods
        obj.greet();
        System.out.println("Sum: " + obj.add(5, 10));
        obj.displayMessage("Tariq");

        // Calling static method (no object needed)
        staticMethod();

        // Calling overloaded methods
        System.out.println("Multiplication (int): " + obj.multiply(4, 5));
        System.out.println("Multiplication (double): " + obj.multiply(4.5, 2.5));

        // Method Overriding Example
        Parent parentObj = new Parent();
        parentObj.show(); // Calls Parent class method

        Child childObj = new Child();
        childObj.show(); // Calls Overridden Child class method
    }
}