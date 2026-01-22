public class BolckTest{                      //클래스 정의 블록
	public static void main(String args[]){    //메소드 정의 블록  
		int a = 0, b = 0, c;
		{                                        //명령문 블록
			int d = 0, e, f;          
			a = a + b;
			{                                      //중첩된 명령문 블록
				d++;
			}
		}
	}
}
