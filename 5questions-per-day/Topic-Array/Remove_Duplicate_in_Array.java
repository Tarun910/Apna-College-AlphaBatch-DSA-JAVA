
//by modifing the same array--------------->>>>>>>>>>>>>>


public class Remove_Duplicate_in_Array {

    // This method removes duplicates from a sorted array and returns the new length
    public static int removeDuplicates(int arr[], int len) {
        // If the array is empty or has only one element, return its length
        if (len == 0 || len == 1) {
            return len;
        }

        int j = 0; // Initialize index j to store the position of the next unique element

        // Iterate through the array until the second last element
        for (int i = 0; i < len - 1; i++) {
            // If the current element is different from the next element, it is unique
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i]; // Store the unique element in the array at position j and increment j
            }
        }

        arr[j++] = arr[len - 1]; // Add the last element as it is always unique

        return j; // Return the new length of the array with unique elements
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7}; // Example array with duplicates
        int len = arr.length; // Get the length of the array
        int newLength = removeDuplicates(arr, len); // Call the method to remove duplicates

        // Print the unique elements of the array
        for (int k = 0; k < newLength; k++) {
            System.out.println(arr[k]); // Print each element up to the new length
        }
    }
}



//by creating a temp array------------->>>>>>>>>>>>>>>



// public class Remove_Duplicate_in_Array {

//     // This method removes duplicates from a sorted array using a temporary array and returns the new length
//     public static int removeDuplicates(int arr[], int len) {
//         if (len == 0 || len == 1) {
//             return len;
//         }

//         int[] temp = new int[len]; // Create a temporary array to store unique elements
//         int j = 0; // Initialize index j to store the position of the next unique element in temp

//         // Iterate through the array until the second last element
//         for (int i = 0; i < len - 1; i++) {
//             // If the current element is different from the next element, it is unique
//             if (arr[i] != arr[i + 1]) {
//                 temp[j++] = arr[i]; // Store the unique element in temp at position j and increment j
//             }
//         }

//         temp[j++] = arr[len - 1]; // Add the last element as it is always unique

//         // Copy the unique elements from temp back to the original array
//         for (int i = 0; i < j; i++) {
//             arr[i] = temp[i];
//         }

//         return j; // Return the new length of the array with unique elements
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7}; // Example array with duplicates
//         int len = arr.length; // Get the length of the array
//         int newLength = removeDuplicates(arr, len); // Call the method to remove duplicates

//         // Print the unique elements of the array 
//         for (int k = 0; k < newLength; k++) {
//             System.out.println(arr[k]); // Print each element up to the new length
//         }
//     }
// }



