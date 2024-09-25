public class Selection_Sort {

    public static void selectionSort(int arr[]) {
        // Check if the array is not null
        if (arr == null) {
            System.out.println("Array is null");
            return;
        }

        // Perform selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            // Swap elements
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    // Function to print sorted array
    public static void printArr(int arr[]) {
        if (arr == null) {
            System.out.println("Array is null");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Sample array
        int arr[] = { 5, 4, 1, 3, 2 };

        // Sort the array
        selectionSort(arr);

        // Print the sorted array
        printArr(arr);
    }
}