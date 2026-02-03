import java.util.*;

public class Source_11_18 {
    public static void main(String args[]) {
        String[] strArray = {"ABC", "BCD", "AFE", "CDE", "ABZ", "ACCZ"};
        List<String> strList = Arrays.asList(strArray);
        strList.stream()
            .filter(item -> item.startsWith("A") & item.endsWith("Z") & item.length() > 3)
            .forEach(item -> System.out.println(item));
    }
}
