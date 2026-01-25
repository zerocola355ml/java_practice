class OuterClass {
	public int x = 0;
	class InnerClass {
	public int x = 1;
		void methodInnerClass(int x) {
			System.out.println("x = " + x); //2
			System.out.println("this.x = " + this.x); //1
			System.out.println("OuterClass.this.x = " + OuterClass.this.x); //0
		}
	}
}

public class Main {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.methodInnerClass(2); //2, 1, 0
	}
}
//x는 매개변수
//this.x 는 InnerClass의 필드
//OuterClass.this.x는 OuterClass의 필드
