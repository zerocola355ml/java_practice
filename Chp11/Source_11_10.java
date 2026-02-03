import java.util.*;
import java.util.stream.*;

public class Source_11_10 {
    public static void main(String args[]) {
        Map<String, Integer> books = new HashMap<>();
        books.put("Java 프로그래밍", 10000);
        books.put("JDBC 프로그래밍", 20000);
        books.put("JSP 프로그래밍", 15000);

        Set<Map.Entry<String, Integer>> entries = books.entrySet();

        System.out.println("일반 스트림 사용");
        Stream<Map.Entry<String, Integer>> ns = entries.stream();
        ns.forEach(item -> System.out.println(item.getKey() + " : " + item.getValue()));

        System.out.println("병렬 스트림 사용");
        Stream<Map.Entry<String, Integer>> ps = entries.parallelStream();
        ps.forEach(item -> System.out.println(item.getKey() + " : " + item.getValue()));
    }
}
