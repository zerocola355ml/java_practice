import java.util.*;

public class Source_11_23 {
    public static void main(String args[]) {
        Arrays.asList("20 10 90", "30 70", "60 80 40")
            .stream()
            .flatMapToInt(item -> Arrays.stream(item.split(" ")).mapToInt(number -> Integer.parseInt(number)))
            .forEach(number -> System.out.println(number));
    }   
}
