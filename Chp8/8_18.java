public class Main {
  public static void main(String args[]) {
      int i;
      try {
          while((i = System.in.read()) != '끝') { //제대로 작동하지 않는다.
              System.out.print((char) i);
          }
      } catch (Exception e) {System.out.println(e);}
  }
}
