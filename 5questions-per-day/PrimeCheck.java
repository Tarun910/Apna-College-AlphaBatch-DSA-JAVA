
public class PrimeCheck {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // A prime number must be greater than 1
        if (n <= 1) {
            return false;
        }

        // Check for factors from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) { // If n is divisible by any i, it's not prime
                return false;
            }
        }

        // If no factors found, n is prime
        return true;
    }

    public static void main(String[] args) {
        int number = 29; // Example number
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
