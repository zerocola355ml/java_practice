import java.util.*;

public class Source_11_19 {
    public static void main(String args[]) {
        String[] strNums = {"10", "20", "30"};
        Arrays.stream(strNums)
            .mapToInt(item -> Integer.parseInt(item))
            .forEach(item -> System.out.println(item));
        
        int[] intNums = {10, 20, 30};
        Arrays.stream(intNums)
            .mapToObj(item -> String.valueOf(item))
            .forEach(item -> System.out.println(item + "(" + item.length() +")"));
    }
}
