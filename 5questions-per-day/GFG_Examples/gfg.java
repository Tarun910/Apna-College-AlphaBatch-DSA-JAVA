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
// public class gfg {

//     public static int BinarySearch(int arr[], int key) {
//         int start = 0;
//         int end = arr.length - 1;

//         while (start <= end) {
//             int mid = (start + end) / 2; // Corrected calculation of mid

//             if (arr[mid] == key) {
//                 return mid; // Return the index if the key is found
//             }

//             if (arr[mid] < key) { // Search in the right half
//                 start = mid + 1;
//             } else { // Search in the left half
//                 end = mid - 1;
//             }
//         }

//         return -1; // Return -1 if the key is not found
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
//         int key = 5;
//         int index = BinarySearch(arr, key);

//         if (index == -1) {
//             System.out.println("Index Not Found !");
//         } else {
//             System.out.println("Key is at Index: " + index);
//         }
//     }

// }

// ----------------->>>>>>>>9/24/2024<<<<<<<<<----------------
// ----------------->>>>>>>>9/24/2024<<<<<<<<<----------------
// ----------------->>>>>>>>9/24/

/**
 * 
 * Reverse an Array
 */
// public class gfg {

//     public static void reverse(int arr[]) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start <= end) {

//             int temp = arr[start];
//             arr[start] = arr[end];

//             arr[end] = temp;
//             start++;
//             end--;

//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5 };
//         reverse(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]);
//         }
//         System.out.println();
//     }
// }

//Pairs of the Array
// public class gfg {
//     public static void printPairs(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             int curr = arr[i]; // 2,4,6,8,10
//             for (int j = i + 1; j < arr.length; j++) {
//                 System.out.print("(" + curr + "," + arr[j] + ") ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 2, 4, 6, 8, 10 };
//         printPairs(arr); // Call the method to printPairs();
//     }
// }

/**
 * Trapping Rain Water
 */
// public class gfg {

//     public static int trappedRainwater(int height[]) {
//         int n = height.length;
//         // calculate the left boundary
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for (int i = 1; i < n; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//         }

//         // calculate the right boundary
//         int rightMax[] = new int[n];
//         rightMax[n - 1] = height[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i + 1]);
//         }

//         int trappedWater = 0;
//         // loop
//         for (int i = 0; i < n; i++) {
//             // waterLevel = min(leftmax bound , rightmax bound)
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);

//             // trapped water = waterLevel - height[i]
//             trappedWater += waterLevel - height[i];
//         }
//         return trappedWater;
//     }

//     public static void main(String[] args) {
//         int height[] = { 4, 2, 0, 6, 3, 2, 5 };
//         System.out.println(trappedRainwater(height));
//     }
// }

/**
 * buyAndSellStocks
 */
// public class gfg {

//     public static int buyAndSellStocks(int prices[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for (int i = 0; i < prices.length; i++) {
//             if (buyPrice < prices[i]) {// profit
//                 int profit = prices[i] - buyPrice; // today's profit
//                 maxProfit = Math.max(maxProfit, profit);
//             } else {
//                 buyPrice = prices[i];
//             }
//         }
//         return maxProfit;
//     }

//     public static void main(String[] args) {
//         int prices[] = { 7, 1, 5, 3, 6, 4 };
//         System.out.println(buyAndSellStocks(prices));
//     }
// }

/**
 * BubbleSorting
 */
// public class gfg {
//     public static void BubbleSort(int arr[]) {
//         for (int turn = 0; turn < arr.length; turn++) {
//             for (int j = 0; j < arr.length - 1 - turn; j++) {

//                 if (arr[j] > arr[j + 1]) {
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     //function to print sorted array
//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = { 5, 4, 1, 3, 2 };
//         BubbleSort(arr);
//         printArr(arr);
//     }
// }

/**
 * selectionSort
 */

//  public class gfg {
//     public static void selectionSort(int arr[]) {
//         // Check if the array is not null
//         if (arr == null) {
//             System.out.println("Array is null");
//             return;
//         }

//         // Perform selection sort
//         for (int i = 0; i < arr.length - 1; i++) {
//             int minPos = i;
//             for (int j = i + 1; j < arr.length; j++) {  
//                 if (arr[minPos] > arr[j]) {
//                     minPos = j;
//                 }
//             }

//             // Swap elements
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     // Function to print sorted array
//     public static void printArr(int arr[]) {
//         if (arr == null) {
//             System.out.println("Array is null");
//             return;
//         }

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         // Sample array
//         int arr[] = { 5, 4, 1, 3, 2 };

//         // Sort the array
//         selectionSort(arr);

//         // Print the sorted array
//         printArr(arr);
//     }
// }

/**
 * insertinSort
 */
// public class gfg {
//     // Function to perform Insertion Sort
//     public static void insertionSort(int arr[]) {
//         for (int i = 1; i < arr.length; i++) {
//             int curr = arr[i];        // Current element
//             int prev = i - 1;         // Index of previous element
//             // Shift elements of the sorted portion to the right if they are larger than the current element
//             while (prev >= 0 && arr[prev] > curr) {
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }
//             // Place the current element in its correct position
//             arr[prev + 1] = curr;
//         }
//     }

//     // Function to print the array
//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {

//         int arr[] = { 5, 4, 1, 3, 2 };  // Sample array
//         insertionSort(arr);  // Sort the array using Insertion Sort
//         printArr(arr);  // Print the sorted array
//     }
// }

/**
 * 2d-Arrays
 */
import java.util.Scanner;

public class gfg {

    // Function to search the key in the matrix
    public static boolean searchKey(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) { // Corrected 'martix' to 'matrix'
                    System.out.println("Found at cell (" + i + "," + j + ")"); // Corrected 'j' in print statement
                    return true;
                }
            }
        }
        return false; // Return false if the key is not found
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3]; // 3x3 matrix
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        // Input the matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output the matrix
        System.out.println("Matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Search for a key
        int key = 5; // Example key to search
        boolean isFound = searchKey(matrix, key);

        if (!isFound) {
            System.out.println("Key not found.");
        }
    }
}
