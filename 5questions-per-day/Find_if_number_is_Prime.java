
public class Find_if_number_is_Prime {
    public static void main(String[] args) {
        int div = 2;
        int p = 7;
        boolean isPrime = true; // Flag to track if the number is prime

        for (int i = div; i < p; i++) {
            if (p % i == 0) {
                System.out.println("not prime");
                isPrime = false; // Set flag to false if a divisor is found
                break;
            }
        }

        // If no divisors were found, the number is prime
        if (isPrime) {
            System.out.println("prime");
        }
    }
}
