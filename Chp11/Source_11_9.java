import java.util.*;
import java.util.stream.*;

class People {
    String name;
    int age;

    People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return("name : " + name + ", age : " + age);
    }
}

public class Source_11_9 {
    public static void main(String args[]) {
        List<People> list = new ArrayList<People>();
        list.add(new People("홍길동", 30));
        list.add(new People("이순신", 40));
        list.add(new People("김유신", 50));

        System.out.println("일반 스트림 사용");
        Stream<People> n_stream = list.stream();
        n_stream.forEach(item -> System.out.println(item));

        System.out.println("병렬처리 스트림 사용");
        Stream<People> p_stream = list.parallelStream();
        p_stream.forEach(item -> System.out.println(item + ":" + Thread.currentThread().getName()));

    }
    
}
