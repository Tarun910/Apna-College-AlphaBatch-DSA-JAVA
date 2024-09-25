import java.util.Scanner;
public class 2D_Arrays {



    // Function to search the key in the matrix
    public static boolean searchKey(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) { // Corrected 'martix' to 'matrix'
                    System.out.println("Found at cell (" + i + "," + j + ")"); // Corrected 'j' in print statement
                    return true;
                }
            }
        }
        return false; // Return false if the key is not found
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3]; // 3x3 matrix
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        // Input the matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output the matrix
        System.out.println("Matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Search for a key
        int key = 5; // Example key to search
        boolean isFound = searchKey(matrix, key);

        if (!isFound) {
            System.out.println("Key not found.");
        }
    }
}
