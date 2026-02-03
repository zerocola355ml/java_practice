import java.util.stream.*;

public class Source_11_24 {
    public static void main(String args[]) {
        Stream.of(20, 10, 90, 30, 70, 60, 80, 40)
            .sorted()
            .forEach(number -> System.out.println(number));
    }    
}
