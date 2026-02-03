import java.util.*;
import java.util.stream.*;

class People {
    String name;
    int age;
}

public class Source_11_4 {
    public static void main(String args[]) {
        People[] peoArray = new People[3];

        peoArray[0] = new People();
        peoArray[0].name = "홍길동";
        peoArray[0].age = 30;
        
        peoArray[1] = new People();
        peoArray[1].name = "이순신";
        peoArray[1].age = 40;
        
        peoArray[2] = new People();
        peoArray[2].name = "김유신";
        peoArray[2].age = 50;
        
        Stream<People> peoStream = Arrays.stream(peoArray);
        peoStream.forEach(item -> System.out.println("이름 : " + item.name + ", age : " + item.age));
    }    
}
