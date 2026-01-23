class Electronics{
	private int nVoltage = 0;
	
	nVoltage = 1; // 오류
	{nVoltage = 1;} // 오류 아님
	public void turnOn(int nInputVoltage){
		nVoltage = nInputVoltage;
	}
	public void turnOff() {nVoltage = 0;}
	public int getVoltage() {return nVoltage;}
}
