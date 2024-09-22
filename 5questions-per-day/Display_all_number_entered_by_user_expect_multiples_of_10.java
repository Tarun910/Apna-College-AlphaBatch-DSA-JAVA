import java.util.*;

public class Display_all_number_entered_by_user_expect_multiples_of_10 {

    public static void main(String[] args) {
        do {

            System.out.println("enter the number");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println("number was " + num);
        } while (true);

    }
}
