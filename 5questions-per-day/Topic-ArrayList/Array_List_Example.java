import java.util.ArrayList;

public class Array_List_Example {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add Element
        list1.add(111);
        list1.add(222);
        list1.add(333);
        list1.add(444);
        list1.add(555);

        // get Element
        int element = list1.get(2);
        System.out.println(element);

        // remove Element
        list1.remove(0);
        System.out.println("List1 after removed element : " + list1);

        // set Element at Index
        list1.set(0, 999);
        System.out.println("List : " + list1);

        // contaisn Element
        boolean cont = list1.contains(555);
        System.out.println(cont);

        list2.add("Tarun");
        list2.add("Namdev");
        list2.add("Aryan");
        list2.add("Namdev");

        list3.add(true);
        list3.add(false);

        System.out.println("List1 is : " + list1);
        System.out.println("List2 is : " + list2);
        System.out.println("List3 is : " + list3);

        // size-property
        System.out.println(list1.size());
        System.out.println(list2.size());
        System.out.println(list3.size());

        // print the arrayList
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

    }
}
