class Man1 {} //암묵적으로 Object 클래스를 상속한다. 

class Man2 extends Object {
    private int nData;
    public Man2(int nNew) {nData = nNew;}
    public boolean equals(Object obj) {
        if(obj instanceof Man2) {
            Man2 m = (Man2) obj;
            if (this.nData == m.nData) return true;
        }
        return false;
    }
}

public class MyClass {
  public static void main(String args[]) {
      Man1 m1 = new Man1();
      Man1 m2 = new Man1();
      System.out.println("m1 == m2 : " + (m1 == m2));           //false
      System.out.println("m1.equals(m2) : " + m1.equals(m2));   //false
      Man2 m3 = new Man2(1);
      Man2 m4 = new Man2(1);
      System.out.println("m3 == m4 : " + (m3 == m4));           //false
      System.out.println("m3.equals(m4) : " + m3.equals(m4));   //true
  }
}
