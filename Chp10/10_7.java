import java.util.*;

public class Source_10_7 {
    public static void main(String args[]){
        List<String> list = new LinkedList<String> ();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        //for 구문을 이용한 자료 탐색
        for(int i = 0; i < list.size(); i++) 
            System.out.println(list.get(i));

        //향상된 for 구문을 이용한 자료 탐색
        for(String s: list)
            System.out.println(s);

        //Iterator 인터페이스를 이용한 자료 탐색
        Iterator<String> it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }  
}
