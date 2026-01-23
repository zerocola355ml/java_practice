class CSuper {
	public CSuper(int a) {System.out.println("super argu");}
} 
//CSub 객체 생성시 CSuper의 기본 생성자를 호출하는데
//기본 생성자 정의되어 있지 않으므로 오류!
//생성자 하나도 정의되어 있지 않으면 자동으로 기본 생성자를 만들어 주지만,
//생성자가 하나라도 있으면 자동으로 만들어 주지 않는다. 


class CSub extends CSuper {
	public CSub() {System.out.println("sub non-argu");}
	public CSub(int a) {System.out.println("sub argu");}
}

public class Main {
	public static void main(String[] args) {
		CSub sub1 = new CSub();
		CSub sub2 = new CSub(10);
	}
}
