interface MyInterface {
	public void method();
}

public class Main {
	public static void main(String args[]) {
		MyInterface sub = new MyInterface() {
			public void method() {System.out.println("sub1");}
		};
		sub.method(); //sub1
	}
}
