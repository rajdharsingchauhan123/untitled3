import java.util.*;

public class collectionex {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 4};
        int[] arr1 = {1, 4};
        ArrayList a = new ArrayList();
        a.add("rahhio");
        a.add(null);

        System.out.println(arr1);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(1233134);
        arrayList.add(32);
        arrayList.add(12456);
        System.out.println(arrayList);

        SortedSet s = new TreeSet(arrayList);
        System.out.println(s);
        List l = new LinkedList();
        l.add("raj");
        l.add("shiva");
        //l.add(123.4);
        System.out.println(l);
        // System.out.println(l.remove(1));

        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            String i = it.next();
            System.out.println(it.next());

        }
        Iterator<Integer> it1 = arrayList.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());


        }
        String s2="er";
        Optional<String>s4=Optional.empty();
//        s2.
//        System.out.println(s4);
    }}
