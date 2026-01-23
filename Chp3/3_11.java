class TV{
	private int nSize = 10;
	public TV(int nNewSize) {nSize = nNewSize;}
	public TV() {nSize = 20;}
}

public class Main {
	public static void main(String[] args){
		TV tv1 = new TV(10);    //첫번째 생성자가 호출된다. 
		TV tv2 = new TV();      //두번째 생성자가 호출된다.
	}
}
