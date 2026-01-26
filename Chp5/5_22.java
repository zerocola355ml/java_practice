interface MyInterface {
    public int method(int a, int b);
}

public class Main {
  public static void main(String args[]) {
      MyInterface f1, f2;
      
      //f1 = (a, b) -> return a + b;        //컴파일 에러
      f1 = (a, b) -> {return a + b;};       //return 있으면 중괄호 필수
      System.out.println(f1.method(3, 4));  
      
      f2 = (a, b) -> a + b;                 //중괄호 없이 return 생략 가능
      System.out.println(f2.method(5, 6));

  }
}
