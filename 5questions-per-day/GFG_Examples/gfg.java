import java.util.*;
/**
 * // * Java Program to Find the Largest of three Numbers
 */

// import java.util.*;

// public class gfg {

// public static void main(String[] args) {
// int a, b, c;
// a = 12;
// b = 23;
// c = 45;

// ArrayList<Integer> x = new ArrayList<>();
// x.add(a);
// x.add(b);
// x.add(c);

// int max = Collections.max(x);
// System.out.println(max);

// }
// }

/**
 * Java Program to Find the Largest of three Numbers
 */

// import java.io.*;

// class GFG {

// // Function to find the biggest of three numbers
// static int biggestOfThree(int x, int y, int z)
// {

// return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
// }

// // Main driver function
// public static void main(String[] args)
// {

// // Declaring variables for 3 numbers
// int a, b, c;

// // Variable holding the largest number
// int largest;
// a = 5;
// b = 10;
// c = 3;
// // Calling the above function in main
// largest = biggestOfThree(a, b, c);

// // Printing the largest number
// System.out.println(largest
// + " is the largest number.");
// }
// }

/**
 * Java Program to Check Whether the Character is Vowel or Consonant
 */
// public class gfg {

// static void checkAlphabet(char x) {
// if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
// System.out.println("The given character is Vowel");
// } else {
// System.out.println("The given character is Consonant");
// }
// }

// public static void main(String[] args) {
// char ch = 'v';
// checkAlphabet(ch);
// }
// }

/**
 * Java Program for factorial of a number
 */
// public class gfg {

// static int getFactorial(int n) {
// if (n == 0)
// return 1;

// return n * getFactorial(n - 1);

// }

// public static void main(String[] args) {
// int num = 5;
// int result = getFactorial(num);
// System.out.println(result);
// }
// }

/**
 * gfg
 */
// public class gfg {

// static int getFactorial(int n) {
// return (n == 0 || n == 1) ? 1 : n * getFactorial(n - 1);
// }

// public static void main(String[] args) {
// int num = 10;

// int result = getFactorial(num);
// System.out.println(result);

// }
// }

/**
 * Java Program to Calculate Simple Interest
 */
// public class gfg {

// static float simpleIntrest(float P, float R, float T) {

// float SI = (P * R * T) / 100;
// return SI;
// }

// public static void main(String[] args) {
// float p = 5000;
// float r = 5;
// float t = 3;
// float result = simpleIntrest(p, r, t);
// System.out.println("The SI is : " + result);
// }
// }

/**
 * Array - Sum
 */
// public class gfg {

// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 4, 5 };
// int sum = 0;
// for (int i = 0; i < arr.length; i++) {
// sum += arr[i];
// }
// System.out.println("Sum of the array is : " + sum);
// }
// }

/**
 * Array Sum
 */
// public class gfg {

// static int sumArr(int arr[]) {
// int sum = 0;
// for (int i = 0; i < arr.length; i++) {
// sum += arr[i];
// }
// return sum;
// }

// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 4, 5 };
// int result = sumArr(arr);
// System.out.println(result);
// }
// }

/**
 * check Duplicate
 */
// public class gfg {

// static boolean checkDuplicate(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] == arr[j]) {
// return true;
// }
// }
// }
// return false;
// }

// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

// System.out.println(checkDuplicate(arr));
// }
// }

/**
 * count the occurrence
 */
// public class gfg {

// static int countKey(int arr[], int key) {
// int count = 0;
// for (int i = 0; i < arr.length; i++) {
// if (key == arr[i]) {
// count++;
// }
// }
// return count;
// }

// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 4, 5, 5, 6, 7, 7, 6, 5, 7, 7, 7, 7, 7 };
// int key = 7;

// System.out.println(countKey(arr, key));
// }
// }

/**
 * largest in array
 */
// public class gfg {

// static int checkLargest(int arr[]) {

// int max = 0;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > max) {
// max = arr[i];
// }
// }
// return max;
// }

// public static void main(String[] args) {
// int arr[] = {99, 1, 2, 3, 4, 5 };

// System.out.println(checkLargest(arr));
// }

// }

/**
 * gfg
 */
// public class gfg {
// public static void main(String[] args) {
// int a = 12;
// int b = 23;
// int c = 34;

// if (a > b && a > c) {
// System.out.println("a is greater");
// }
// if (b > a && b > c) {
// System.out.println("b is greater");
// } else {
// System.out.println("c is greater");
// }

// }
//

// ----------------->>>>>>>>9/22/2024<<<<<<<<<----------------
// ----------------->>>>>>>>9/22/2024<<<<<<<<<----------------
// ----------------->>>>>>>>9/22/2024<<<<<<<<<----------------

// primer numbers = 1,3,5 / 1 and self
/**
 * Find if number is Prime
 */
// public class gfg {

// public static void main(String[] args) {
// int div = 2;
// int p = 7;
// boolean isPrime = true; // Flag to track if the number is prime

// for (int i = div; i < p; i++) {
// if (p % i == 0) {
// System.out.println("not prime");
// isPrime = false; // Set flag to false if a divisor is found
// break;
// }
// }

// // If no divisors were found, the number is prime
// if (isPrime) {
// System.out.println("prime");
// }
// }
// }

/**
 * Sum of first n natural numbers
 */
// public class gfg {

// public static void main(String[] args) {
// int div = 5;
// int sum = 0;
// for (int i = 0; i <= div; i++) {
// sum += i;
// }
// System.out.println("the sum is :: " + sum);
// }
// }

/**
 * Area of Circle = Pi * r * r (3.14 * r * r)
 */
// public class gfg {

// static float findArea(float radius) {

// float result = (3.14f * radius * radius);

// return result;
// }

// public static void main(String[] args) {

// float r = 2;

// System.out.println(findArea(r));
// }
// }

/**
 * star - pattern square
 */
// public class gfg {

// public static void main(String[] args) {

// int n = 4;
// for (int i = 0; i < 4; i++) {
// for (int j = 0; j < 4; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

/**
 * Display all the number entered by user except multiples of 10
 */
// public class gfg {

// public static void main(String[] args) {

// do {

// System.out.println("enter the number");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// if (num % 10 == 0) {
// continue;
// }
// System.out.println("number was " + num);
// } while (true);

// }
// }

/**
 * one more star pattern
 */
// public class gfg {

//   public static void main(String[] args) {
//     int n = 4;
//     for (int i = 1; i <= 4; i++) {
//       for (int j = i; j <= 4; j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }

//   }
// }

// ----------------->>>>>>>>9/23/2024<<<<<<<<<----------------
// ----------------->>>>>>>>9/23/2024<<<<<<<<<----------------
// ----------------->>>>>>>>9/23/2024<<<<<<<<<----------------

/**
 * 
 * Star pattern
 */
// public class gfg {

//     public static void main(String[] args) {
//         int n= 4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * reverse star pattern
 */
// public class gfg {

//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * print half-pyramid pattern
 */
// public class gfg {

//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * find the index of element in a give array (Linear Search)
 *  
 */

/**
 * gfg
 */
// public class gfg {

//     public static void linearSearch(int nums[], int key) {
//         boolean found = false; // Flag to track if the key is found

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == key) {
//                 System.out.println("The index is : " + i);
//                 found = true; // Set the flag to true if the key is found
//                 break; // Exit the loop once the key is found
//             }
//         }

//         // If the key was not found, print this message
//         if (!found) {
//             System.out.println("Not found");
//         }
//     }

//     public static void main(String[] args) {
//         int nums[] = { 2, 3, 4, 5, 6, 7, 78, 8 }; // Array to search
//         int key = 78; // Key to search for

//         linearSearch(nums, key); // Call the linearSearch method
//     }

// }

/**
 * Find largest 
 */

//int max = Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;
// public class gfg {
//     public static int findLargest(int arr[]) {

//         int max = arr[0];  
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }

//         return max;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5 };

//         System.out.println("the largest is : " + findLargest(arr));
//     }
// }

/**
 * Binary Search
 */
public class gfg {

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