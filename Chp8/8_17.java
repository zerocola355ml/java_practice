import java.io.*;

public class Main {
  public static void main(String args[]) {
      try(FileReader fr = new FileReader(new File("./Main.java"));
      LineNumberReader rd = new LineNumberReader(fr)) {
          String line;
          while((line = rd.readLine()) != null) {
              System.out.println(line);
          }
      } catch (Exception e) {System.out.println(e);}
  }
}
