public class Main {
  public static void main(String args[]) {
      int i;
      try {
          while((i = System.in.read()) != 'q') { //한번에 정의하며 비교 가능하군
              System.out.print((char) i);
          }
      } catch (Exception e) {System.out.println(e);}
  }
}
