import java.util.ArrayList;
import java.util.Collections;

/**
 * Sorting_an_ArrayList
 */
public class Sorting_an_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        Collections.sort(list); // ascending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list); // descending order

    }
}