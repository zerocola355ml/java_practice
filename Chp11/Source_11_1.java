import java.util.*;

public class Source_11_1 {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<String>();
        
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        //forEach() 메소드를 이용한 자료 탐색
        list.forEach(item -> System.out.println(item));
    }
}
