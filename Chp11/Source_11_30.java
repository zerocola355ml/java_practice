import java.util.*;
import java.util.stream.*;

class Member {
    String name;
    String gender;
    int age;

    Member(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public String toString() {
        return ("name = " + this.name + ", gender = " + this.gender + ", age = " + this.age);
    }
}
public class Source_11_30 {
    public static void main(String args[]) {
        List<Member> members = new ArrayList<Member>();
        members.add(new Member("홍길동", "남", 30));
        members.add(new Member("신사임당", "여", 50));
        members.add(new Member("이순신", "남", 40));
        members.add(new Member("김유신", "남", 20));
        members.add(new Member("유관순", "여", 19));
        members.add(new Member("강감찬", "남", 45));

        List<Member> male_members = members.stream()
            .filter(member -> member.getGender().equals("남"))
            .collect(Collectors.toList());

        male_members.stream()
            .forEach(member -> System.out.println(member));

        List<Member> female_members = members.stream()
            .filter(member -> member.getGender().equals("여"))
            .collect(Collectors.toList());
        
        female_members.stream()
            .forEach(member -> System.out.println(member));

        Set<Member> female_members2 = members.stream()
            .filter(member -> member.getGender().equals("여"))
            .collect(Collectors.toSet());
        
        female_members2.stream()
            .forEach(member -> System.out.println(member));

        Map<String, Integer> ages = female_members2.stream()
            .collect(Collectors.toMap(member -> member.getName(), member -> member.getAge()));

        System.out.println(ages);
    }
}
