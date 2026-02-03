import java.util.*;
import java.util.stream.*;

public class Source_11_7 {
    public static void main(String args[]) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < 10; i++){
            set.add(i);
        }

        System.out.println("일반 스트림 사용");
        Stream<Integer> n_stream = set.stream();
        n_stream.forEach(item -> System.out.println(item));

        System.out.println("병렬 스트림 사용");
        Stream<Integer> p_stream = set.parallelStream();
        p_stream.forEach(item -> System.out.println(item + "(" + Thread.currentThread().getName() +")"));
    }
}
