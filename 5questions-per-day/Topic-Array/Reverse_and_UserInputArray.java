import java.util.*;

public class Reverse_and_UserInputArray {

    public static void getUserInput(int[] arr) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the elements: ");
  
      for (int i = 0; i < arr.length; i++) {
        System.out.print("Enter element " + (i + 1) + ": ");
        arr[i] = scanner.nextInt();
      }
  
      scanner.close(); // Close the scanner to avoid resource leaks
    }
  
    public static void reverseArray(int[] arr) {
      int start = 0;
      int end = arr.length - 1;
  
      while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }
    }
  
    public static void printArray(int[] arr) {
      for (int element : arr) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  
    public static void main(String[] args) {
      int[] numbers = new int[5];
  
      getUserInput(numbers);
  
      System.out.println("The original elements are: ");
      printArray(numbers);
  
      reverseArray(numbers);
  
      System.out.println("The reversed elements are: ");
      printArray(numbers);
    }
  }
  