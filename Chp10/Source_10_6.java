import java.util.*;

public class Source_10_6 {
    public static void main(String args[]) {
        List<String> list = new LinkedList<String>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add(1, "one");
        list.add("five");

        System.out.println(list.size());
        System.out.println(list.indexOf("one"));
        System.out.println(list.get(2));
        System.out.println(list.lastIndexOf("one"));
        System.out.println(list.set(3, "four"));
        System.out.println(list.remove(4));
        System.out.println(list.remove("one"));
    }
}
