class Data<T> {
	private T t;
	public void set(T t) {this.t =t;}
	public T get(T t) {return t;}
}

public class Main {
	public static void main(String[] args) {
		Data<String> data = new Data<String>();
		Integer i = Integer.valueOf(20);
		data.set(i);                     //컴파일 오류 발생
		String s = (String) data.get();  //컴파일 오류 발생 
	}
}
