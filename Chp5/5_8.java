class Data<T> {
	private T t;
	
	public void set(T t) {this.t = t;}
	public T get() {return t;}
}

public class Main {
	public static void main(String[] args) {
		Data<String> data = new Data<>();
		String S1 = new String("Hello");
		data.set(S1);
		String S2 = data.get();
	}
}
