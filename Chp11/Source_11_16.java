import java.util.stream.*;

public class Source_11_16 {
    public static void main(String args[]) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.filter(item -> item % 2 == 0)
            .filter(item -> item >= 50)
            .forEach(item -> System.out.println(item));
    }
    
}
