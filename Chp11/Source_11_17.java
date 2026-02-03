import java.util.*;

public class Source_11_17 {
    public static void main(String args[]) {
        String[] strArray = {"ABC", "BCD", "AFE", "CDE", "ABZ", "ACCZ"};
        List<String> strList = Arrays.asList(strArray);
        strList.stream()
            .filter(item -> item.startsWith("A"))
            .filter(item -> item.endsWith("Z"))
            .filter(item -> item.length() > 3)
            .forEach(item -> System.out.println(item));
    }    
}
