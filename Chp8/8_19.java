import java.io.*;

public class Main {
  public static void main(String args[]) {
      int i;
      try(InputStreamReader isr = new InputStreamReader(System.in, "euc-kr")) {
          while((i = isr.read()) != '끝') {
              System.out.print((char) i);
          }
      } catch (Exception e) {System.out.println(e);}
  }
}
