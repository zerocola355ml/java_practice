class IniTest {
	private int nValue;
	static int nStatic;
	{               //non-static 초기화 블록
		nValue = 0;
	}
	static {        //static 초기화 블록
		nStatic = 0;
	}
}
