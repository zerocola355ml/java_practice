class Myclass {
	public int add(int a, int b) {return a + b;}
	public double add(double a, double b) {return a + b;}
}

public class Main {
	public static void main(String[] args){
		MyClass mc = new Myclass();
		System.out.println(mc.add(10, 15));    //첫번째 메소드 이용
		System.out.println(mc.add(10.5, 15.3));//두번째 메소드 이용
		System.out.println(mc.add(10, 10.5));  //두번째 메소드 이용(int형이 double형으로 변환) 
	}
}
