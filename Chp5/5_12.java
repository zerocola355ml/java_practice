class Data<T> {
	private T t;
	public Data(T t) {this.t = t;}
	public void set(T t) {this.t = t;}
	public T get() {return t;}
}

class MyData extends Data<Integer> {
	public MyData(Integer i) {super(i);} //슈퍼 클래스의 생성자에 i전달
}

public class Main {
	public static void main(String[] args) {
		MyData md = new MyData(10);
		System.out.println(md.get());
	}
}
