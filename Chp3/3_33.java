public class Main {
	public static void main(String[] args) {
		CSub sub = new CSub();
		sub.f1 = 40;         //컴파일 오류
		sub.f2 = 50;
		sub.f3 = 60;         //컴파일 오류
		sub.f4 = 70;
		sub.setPrivate();
		sub.setPublic();
		sub.mPrivate();      //컴파일 오류
	}
}
