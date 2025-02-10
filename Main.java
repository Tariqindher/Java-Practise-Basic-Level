class MyClass {
    // Instance variables
    int a=6;
    int b=7;
    int c=8;
    
    MyClass(){
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
    // Constructor that uses `this` to distinguish between instance variables and method parameters
    MyClass(int a, int b, int c) {
        // Using `this` to assign method parameters to instance variables
        this.a = a;  // This sets the instance variable `a` to the value of the parameter `a`
        this.b = b;  // This sets the instance variable `b` to the value of the parameter `b`
        this.c = c;  // This sets the instance variable `c` to the value of the parameter `c`
    }
    

    //A method to display the values of the instance variables
    void displayValues() {
        System.out.println("a = " + this.a + ", b = " + this.b + ", c = " + this.c);
    }
    void displayValues2() {
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
    
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of MyClass with parameters 1, 2, 3
        int a=90, b=900, c=900;
        MyClass obj = new MyClass(1, 2, 3);
        MyClass obj1 = new MyClass();
        // Displaying the values of the instance variables
        obj.displayValues();  // Output: a = 1, b = 2, c = 3
        obj.displayValues2();  // Output: a = 1, b = 2, c = 3
        obj1.a=111;
        System.out.println("a = " + obj1.a + ", b = " + obj1.b + ", c = " + obj1.c);
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
