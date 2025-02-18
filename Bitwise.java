public class Bitwise {
      public static void main(String[] args) {
                    int a = 5; // binary: 0101
                    int b = 3; // binary: 0011

                    // Bitwise AND
                    int resultAnd = a & b; // result: 0001
                    System.out.println("Bitwise AND: " + resultAnd); // Output: 1

                    // Bitwise OR
                    int resultOr = a | b; // result: 0111
                    System.out.println("Bitwise OR: " + resultOr); // Output: 7

                    // Bitwise XOR
                    int resultXor = a ^ b; // result: 0110
                    System.out.println("Bitwise XOR: " + resultXor); // Output: 6

                    // Bitwise NOT
                    int resultNotA = ~a; // result: 11111111111111111111111111111010 (2's complement)
                    System.out.println("Bitwise NOT of a: " + resultNotA); // Output: -6

                    // Left Shift
                    int resultLeftShift = a << 2; // result: 10100
                    System.out.println("Left Shift of a: " + resultLeftShift); // Output: 20

                    // Right Shift
                    int resultRightShift = a >> 1; // result: 0001
                    System.out.println("Right Shift of a: " + resultRightShift); // Output: 2
                    
                    // Unsigned Right Shift
                    int unsignedRightShift = -8 >>> 2; // result: 
                    //00111111111111111111111111111110
                    System.out.println("Unsigned Right Shift of -8: " + unsignedRightShift); // Output: 1073741822
   }
}

