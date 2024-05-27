public class Remove_all_Occurance_of_Array {

    // This method removes all occurrences of a specified key from the array and returns the new length
    public static int removeAll(int arr[], int key){
        int j = 0; // Initialize index j to store the position of the next element that is not equal to the key

        // Iterate through the array
        for(int i = 0; i < arr.length; i++){
            // If the current element is not equal to the key, it should be kept
            if(arr[i] != key){
                arr[j++] = arr[i]; // Store the element in the array at position j and increment j
            }
        }

        return j; // Return the new length of the array with the key elements removed
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4, 5, 6, 7, 7, 3, 5}; // Example array with duplicates
        int key = 3; // Key to be removed from the array

        // Call the method to remove all occurrences of the key and get the new length
        int newLength = removeAll(arr, key);

        // Print the elements of the array up to the new length
        for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + " "); // Print each element up to the new length
        }
    }
}
