import java.util.*;
import java.util.stream.*;

public class Source_11_5 {
    public static void main(String args[]) {
        int[] intArray = {1, 2, 3};
        IntStream intStream = Arrays.stream(intArray);

        intStream.forEach(item -> System.out.println(item));
    }
}
