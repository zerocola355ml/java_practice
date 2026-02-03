import java.util.*;
import java.util.stream.*;

public class Source_11_8 {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            list.add(i);
        }

        System.out.println("일반 스트림 사용");
        Stream<Integer> n_stream = list.stream();
        n_stream.forEach(item -> System.out.println(item));

        System.out.println("병렬처리 스트림 사용");
        Stream<Integer> p_stream = list.parallelStream();
        p_stream.forEach(item -> System.out.println(item + "(" + Thread.currentThread().getName()+ ")"));
    }
}
