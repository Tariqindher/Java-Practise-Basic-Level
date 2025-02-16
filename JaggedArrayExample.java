public class JaggedArrayExample {
public static void main(String[] args) {
// Declaring and initializing a jagged array
int[][] jaggedArray = {
{1, 2, 3},
{4, 5},
{6, 7, 8, 9}
};
// Accessing elements of the jagged array using foreach loop
System.out.println("Accessing elements of the jagged array:");
for (int[] innerArray : jaggedArray) {
for (int element : innerArray) {
System.out.print(element + " ");
}
System.out.println(); // Move to the next line after printing each row
}
}
}