import java.io.*;

public class Main {
  public static void main(String args[]) {
      File myFile = new File("c:\\windows\\notepad.exe");
      System.out.println(myFile.getName());
      System.out.println(myFile.getPath());
      System.out.println(myFile.length());
  }
}
