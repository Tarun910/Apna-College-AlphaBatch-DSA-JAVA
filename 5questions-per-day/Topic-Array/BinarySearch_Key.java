public class BinarySearch_Key {
    public static int BinarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2; // Corrected calculation of mid

            if (arr[mid] == key) {
                return mid; // Return the index if the key is found
            }

            if (arr[mid] < key) { // Search in the right half
                start = mid + 1;
            } else { // Search in the left half
                end = mid - 1;
            }
        }

        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 5;
        int index = BinarySearch(arr, key);

        if (index == -1) {
            System.out.println("Index Not Found !");
        } else {
            System.out.println("Key is at Index: " + index);
        }
    }
}
