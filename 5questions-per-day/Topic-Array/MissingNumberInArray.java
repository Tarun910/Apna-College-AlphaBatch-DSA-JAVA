/**
 * Missing_Number_in_Array
 */
public class MissingNumberInArray {

    public static int missingElement(int[] arr, int n) {
        // Calculate the ideal sum of the complete sequence (1 to n)
        int idealSum = n * (n + 1) / 2;

        // Calculate the actual sum of elements in the given array
        int actualSum = 0;
        for (int element : arr) {
            actualSum += element;
        }

        // Return the missing element by subtracting actual sum from ideal sum
        return idealSum - actualSum;
    }

    public static void main(String[] args) {
        // Given array (sorted with one missing element)
        int[] arr = {1, 2, 3, 5};
        int n = 5; // Size of the complete sequence

        int missingElement = missingElement(arr, n);
        System.out.println("The missing element is " + missingElement);
    }
}
