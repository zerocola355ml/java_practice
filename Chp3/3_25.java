class IniTest {
	private int nValue;
	private static int nStatic;
	public IniTest() {
		nValue = 0;
		nStatic = 0;         //static 필드도 생성자에서 초기화 가능하나 바람직하지 않다.
	}                      //필드 선언문이나 초기화 블록에서 초기화를 하는 것이 낫다. 
}
