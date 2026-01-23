class CSuper {
	private int f1;                      //Csub는 사용X
	public int f2;
	public void setPrivate() {f1 = 10;}
	public void setPublic() {f2 = 20;}
	private void mPrivate() {f1 = 30;}   //Csub는 사용X
}

class CSub extends CSuper {
	private int f3;
	public int f4;
}
