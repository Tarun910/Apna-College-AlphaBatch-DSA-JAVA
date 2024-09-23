public class linear_search {
    public static void linearSearch(int nums[], int key) {
        boolean found = false; // Flag to track if the key is found

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                System.out.println("The index is : " + i);
                found = true; // Set the flag to true if the key is found
                break; // Exit the loop once the key is found
            }
        }

        // If the key was not found, print this message
        if (!found) {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 4, 5, 6, 7, 78, 8 }; // Array to search
        int key = 78; // Key to search for

        linearSearch(nums, key); // Call the linearSearch method
    }
}
