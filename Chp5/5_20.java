interface MyInterface {
    public void method();
}

public class Main {
  public static void main(String args[]) {
      MyInterface sub = () -> {System.out.println("sub1");};
      sub.method();
  }
}
