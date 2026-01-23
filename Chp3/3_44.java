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
    public People setName(String name) {
        this.name = name;
        return this;
    }
    public People setAge(int age) {
        this.age = age;
        return this;
    }
    public People setAddress(String address) { //반환 타입도 void 아닌 People
        this.address = address;
        return this; //이게 필요함
    }
    
}

    
public class Main {
	public static void main(String[] args) {
        People p = new People();
        p.setName("홍길동").setAge(30).setAddress("서울");
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getAddress());
	}
}
