import java.io.*;

public class Main {
  public static void main(String args[]) {
      File file = new File("c:\\Java\\Main.java");
      try(InputStream is = new FileInputStream(file)) {
          int nData;
          nData = is.read();
          while(nData != -1) {
              System.out.write(nData);
              nData = is.read();
          }
          //is.close();
      } catch (Exception e) {
          System.out.println(e);
      }
  }
}
