class Data {
	private Object object;
	public void set(Object object) {this.object = object;}
	public Object get() {return object;}
}

public class Main {
	public static void main(String[] args) {
		Data data = new Data();
		Integer i = Integer.valueOf(20);
		data.set(i);
		String s = (String)data.get(); //실행 오류.
	}
}
