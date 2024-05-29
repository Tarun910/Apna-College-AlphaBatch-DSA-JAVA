import java.util.ArrayList;

public class swap_two_numbers_in_ArrayList {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int idx = 1, idx2 = 3;
        System.out.println(list); // print list before swap
        swap(list, idx, idx2); // function call
        System.out.println(list); // print list after swap
    }
}
