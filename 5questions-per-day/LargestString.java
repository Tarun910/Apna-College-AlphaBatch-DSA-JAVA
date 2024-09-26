public class LargestString {
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" };
        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println("The largest string is: " + largest);
    }
}

// Explanation:

// compareTo compares two strings lexicographically. If the result is negative,
// it means largest is lexicographically smaller than fruits[i], and the if
// block assigns the new larger string to largest.

// The loop starts from i = 1 since largest is initialized with fruits[0].