import java.util.*;

public class Application {
    public static void main(String[] args) {
        int[] localArray = new int[5];
        //java 5
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add("egor");


        //java 7
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(123);

        int a = integers.get(0);


        LinkedList<Parrot> parrotLinkedList = new LinkedList<>();
        parrotLinkedList.add(new Parrot("kesha", 100d));


        //sets

        Set<Parrot> integerHashSet = new HashSet<>();
        integerHashSet.add(new Parrot("kesha", 100d));
        integerHashSet.add(new Parrot("kesha", 15d));
        integerHashSet.add(new Parrot("kesha", 15d));

        Set<Parrot> treeHashSet = new TreeSet<>();
        treeHashSet.add(new Parrot("kesha", 100d));
        treeHashSet.add(new Parrot("masha", 40d));
        treeHashSet.add(new Parrot("anya", 10d));
        System.out.println(treeHashSet);


        Map<String, Parrot> credentials = new LinkedHashMap<>();
        credentials.put("kesha", new Parrot("kesha", 100d));
        credentials.put("masha", new Parrot("123", 100d));
        credentials.put("dasha", new Parrot("12351535", 100d));
        System.out.println(credentials);
    }
}
