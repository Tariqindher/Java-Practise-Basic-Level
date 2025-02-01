public class VariableDataType{
       static int staVar=6; //Static Variable
       public static void main(String args[]){

              int x = 10;  // local variable
              System.out.println(x);

              int insVar=5; //Instance Variable
              
             
       }
       public void greet(String name) {  
              // 'name' is a method parameter
           System.out.println("Hello, " + name);
       }
}
class Person {
       String name;  // instance variable
       
       public Person(String name) {
           this.name = name;
       }
   
       public void printName() {
           System.out.println(name);
       }
   
}    
class MyClass {
       static int count = 0;  // class variable (static)
       
       public MyClass() {
           count++;
       }
   
       public void printCount() {
           System.out.println(count);
       }
   }


