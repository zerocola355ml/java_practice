import java.util.*;
import java.util.stream.*;

public class Source_11_3 {
    public static void main(String args[]) {
        String[] strArray = {"홍길동", "이순신", "김유신"};
        Stream<String> strStream = Arrays.stream(strArray); //Array 아니라 Arrays

        strStream.forEach(item -> System.out.println(item));
    }
}
