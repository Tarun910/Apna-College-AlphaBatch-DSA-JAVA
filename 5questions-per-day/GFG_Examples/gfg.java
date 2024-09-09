import java.util.*;
/**
//  * Java Program to Find the Largest of three Numbers
*/

// import java.util.*;

// public class gfg {

//     public static void main(String[] args) {
//         int a, b, c;
//         a = 12;
//         b = 23;
//         c = 45;

//         ArrayList<Integer> x = new ArrayList<>();
//         x.add(a);
//         x.add(b);
//         x.add(c);

//         int max = Collections.max(x);
//         System.out.println(max);

//     }
// }

/**
 * Java Program to Find the Largest of three Numbers
 */

// import java.io.*;

// class GFG {

//     // Function to find the biggest of three numbers
//     static int biggestOfThree(int x, int y, int z)
//     {

//         return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
//     }

//     // Main driver function
//     public static void main(String[] args)
//     {

//         // Declaring variables for 3 numbers
//         int a, b, c;

//         // Variable holding the largest number
//         int largest;
//         a = 5;
//         b = 10;
//         c = 3;
//         // Calling the above function in main
//         largest = biggestOfThree(a, b, c);

//         // Printing the largest number
//         System.out.println(largest
//                            + " is the largest number.");
//     }
// }

/**
 * Java Program to Check Whether the Character is Vowel or Consonant
 */
// public class gfg {

//     static void checkAlphabet(char x) {
//         if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
//             System.out.println("The given character is Vowel");
//         } else {
//             System.out.println("The given character is Consonant");
//         }
//     }

//     public static void main(String[] args) {
//         char ch = 'v';
//         checkAlphabet(ch);
//     }
// }

/**
 * Java Program for factorial of a number
 */
// public class gfg {

//     static int getFactorial(int n) {
//         if (n == 0)
//             return 1;

//          return n * getFactorial(n - 1);

//     }

//     public static void main(String[] args) {
//         int num = 5;
//         int result = getFactorial(num);
//         System.out.println(result);
//     }
// }

/**
 * gfg
 */
// public class gfg {

//     static int getFactorial(int n) {
//         return (n == 0 || n == 1) ? 1 : n * getFactorial(n - 1);
//     }

//     public static void main(String[] args) {
//         int num = 10;

//         int result = getFactorial(num);
//         System.out.println(result);

//     }
// }

/**
 * Java Program to Calculate Simple Interest
 */
// public class gfg {

//     static float simpleIntrest(float P, float R, float T) {

//         float SI = (P * R * T) / 100;
//         return SI;
//     }

//     public static void main(String[] args) {
//         float p = 5000;
//         float r = 5;
//         float t = 3;
//         float result = simpleIntrest(p, r, t);
//         System.out.println("The SI is : " + result);
//     }
// }

/**
 * Array - Sum
 */
// public class gfg {

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5 };
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }
//         System.out.println("Sum of the array is : " + sum);
//     }
// }

/**
 * gfg
 */
// public class gfg {

//     static int sumArr(int arr[]) {
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5 };
//         int result = sumArr(arr);
//         System.out.println(result);
//     }
// }

/**
 * check Duplicate
 */
// public class gfg {

//     static boolean checkDuplicate(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5,  6, 7, 8, 9, 0 };

//         System.out.println(checkDuplicate(arr));
//     }
// }

/**
 * count the occurrence
 */
// public class gfg {

//     static int countKey(int arr[], int key) {
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (key == arr[i]) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 5, 6, 7, 7, 6, 5, 7, 7, 7, 7, 7 };
//         int key = 7;

//         System.out.println(countKey(arr, key));
//     }
// }

/**
 * largest in array
 */
// public class gfg {

//     static int checkLargest(int arr[]) {

//         int max = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         int arr[] = {99, 1, 2, 3, 4, 5 };

//         System.out.println(checkLargest(arr));
//     }

// }

/**
 * gfg
 */

/**
 * gfg
 */
public class gfg {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 4, 3, 3333 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max is : " + max);
        System.out.println("Min is : " + min);

    }
}