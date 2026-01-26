class Data<T> {
	private T t;
	
	public Data(T t) {this.t = t;}
	public void set(T t) {this.t = t;}
	public T get() {return t;}
}

public class Main {
	public static void main(String[] args) {
		Data d = new Data("Hello");
		System.out.println(d.get());
	}
}
