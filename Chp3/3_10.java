class TV{
	private int nSize = 0;
	public TV(int nNewSize){
		nSize = nNewSize;
	}
}

public class Main{
	public static void main(String[] args){
		
		TV tv = new TV(10); //이때 생성자가 호출되고 객체가 초기화된다.
	}
}
