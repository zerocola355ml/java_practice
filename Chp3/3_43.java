class People {
    String name;
    int age;
    String address;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}

    
public class Main {
	public static void main(String[] args) {
        People p = new People();
        p.setName("홍길동");
        p.setAge(30);
        p.setAddress("서울");

        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getAddress());
	}
}
