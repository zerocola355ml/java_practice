class CSuper {
    public int a = 10;
    public void method1() {System.out.println("super1");}
    public void method2() {System.out.println("super2");}
}

public class Main {
  public static void main(String args[]) {
      CSuper sub = new CSuper() {
          public int b = 20;
          public void method1() {System.out.println("sub1");}
          public void method3() {System.out.println("sub3");}
      }; //;누락 주의
      
      sub.method1();                //sub1
      sub.method2();                //super2
      System.out.println(sub.a);    //10
      sub.method3();                //컴파일 오류
      System.out.println(sub.b);    //컴파일 오류
    }
}
//익명 클래스 내부에서 새로 정의된 필드 b나 메소드 method3()는 참조할 수 없다. 
