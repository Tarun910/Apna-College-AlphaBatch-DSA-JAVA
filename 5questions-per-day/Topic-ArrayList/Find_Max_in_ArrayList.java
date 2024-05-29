import java.util.ArrayList;

public class Find_Max_in_ArrayList {

    public static int Findlist(ArrayList<Integer> list) {
        int max = list.get(0);
        // int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= max) {
                max = list.get(i);
            }

            // max = Math.max(max, list.get(i)) ;
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println("ArrayList is : " + list);

        // reverse ArrayList
        int max = Findlist(list);
        System.out.println(max);
    }
}
