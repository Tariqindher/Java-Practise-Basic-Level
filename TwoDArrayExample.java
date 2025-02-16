public class TwoDArrayExample {
public static void main(String[] args) {
// Declaring and initializing a 2D array
int[][] matrix = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};
// Accessing elements of the 2D array
System.out.println("Element at row 3, column 1: " + matrix[2][0]);
// Iterating through the 2D array
System.out.println("Elements of the 2D array:");
for (int i = 0; i < matrix.length; i++) {
for (int j = 0; j < matrix[i].length; j++) {
System.out.print(matrix[i][j] + " ");
}
System.out.println(); // Move to the next line after printing each row
}
}
}