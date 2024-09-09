
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
public class gfg {

    static int getFactorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * getFactorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 10;

        int result = getFactorial(num);
        System.out.println(result);

    }
}