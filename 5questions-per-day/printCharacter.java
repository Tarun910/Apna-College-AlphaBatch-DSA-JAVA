import java.util.Scanner;

public class printCharacter {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("enter your string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printLetters(str);
    }
}
