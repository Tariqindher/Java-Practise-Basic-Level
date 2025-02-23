public class ArrayConcepts {
    public static void main(String[] args) {
        // Declaration and Initialization
        int[] arr = {10, 5, 30, 15, 25};

        // Traversal (Printing Array)
        System.out.print("Array Elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Finding Maximum and Minimum
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        //  Searching for an Element (Linear Search)
        int searchKey = 15;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchKey) {
                System.out.println(searchKey + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println(searchKey + " not found");

        //Sorting (Bubble Sort)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Reversing an Array
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.print("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Multi-Dimensional Array (2D Array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}