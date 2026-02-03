import java.util.*;

public class Source_11_21 {
    public static void main(String args[]) {
        int[] intArray = {1, 2, 3, 4, 5};

        Arrays.stream(intArray)
            .asLongStream()
            .asDoubleStream()
            .boxed()
            .forEach(item -> System.out.println(item.intValue()));
    }
}
