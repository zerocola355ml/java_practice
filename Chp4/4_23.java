//내부 클래스는 욉 ㅜ클래스의 객체가 생성된 이후에 사용할 수 있다.
//static 필드나 메소드는 외부 클래스의 객체 생성과 무관하게 사용 가능하다. 

class OuterClass {
	class InnerClass {
	
	}
}

public class Main {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass(); //new oc.InnerClass()가 아님.
	}
}
