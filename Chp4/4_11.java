class Electronics {
    private int nVoltage = 0;
    public void turnOn(int nInputVoltage) {nVoltage = nInputVoltage;}
    public void turnOff() {nVoltage = 0;}
    public int getVoltage() {return nVoltage;}
}

class TV extends Electronics {
    private int nSize = 0;
    public void setSize(int new_size) {nSize = new_size;}
    public int getSize() {return nSize;}
}

public class Main {
  public static void main(String args[]) {
      Electronics elec; //슈퍼 클래스형 변수
      TV tv = new TV();
      elec = tv;
      tv.getSize();
      elec.getVoltage(); //TV 클래스의 메소드 호출. 동적 바인딩이라고 한다. 
      elec.getSize(); //오류. 슈퍼 클래스에 정의된 메소드만 호출 가능
      
      
  }
}
