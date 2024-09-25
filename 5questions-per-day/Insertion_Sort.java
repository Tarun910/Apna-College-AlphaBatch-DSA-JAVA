public class Insertion_Sort {

    // Function to perform Insertion Sort
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // Current element
            int prev = i - 1; // Index of previous element
            // Shift elements of the sorted portion to the right if they are larger than the
            // current element
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Place the current element in its correct position
            arr[prev + 1] = curr;
        }
    }

    // Function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 5, 4, 1, 3, 2 }; // Sample array
        insertionSort(arr); // Sort the array using Insertion Sort
        printArr(arr); // Print the sorted array
    }
}
