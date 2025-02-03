//Perform division using two int variables and store the result in float variable and print the results.
public class TypeCastingTask {

                    public static void main(String[] args) {
                                        int a=15, b=9;
                                        float c=a/b;
                                        System.out.println("Float Result: "+c);
                                        float cd=(float)a/b;
                                        System.out.println("Float Result: "+cd);
                    }
                    //When we divide two integers in Java (a / b), Java performs integer division, which discards the decimal part.
}