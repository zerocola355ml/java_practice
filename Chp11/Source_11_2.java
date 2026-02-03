import java.util.stream.*;

public class Source_11_2 {
    public static void main(String args[]) {
        System.out.println(IntStream.rangeClosed(1, 100).sum());
        System.out.println(IntStream.rangeClosed(1, 100).average().getAsDouble());
        System.out.println(IntStream.rangeClosed(1, 100).min().getAsInt());
        System.out.println(IntStream.rangeClosed(1, 100).max().getAsInt());

        System.out.println(IntStream.range(1, 100).sum());
        System.out.println(IntStream.range(1, 100).average().getAsDouble());
        System.out.println(IntStream.range(1, 100).min().getAsInt());
        System.out.println(IntStream.range(1, 100).max().getAsInt());
    }
}
