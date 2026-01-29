import java.io.*;

public class Main {
  public static void main(String args[]) {
    File file = new File("c:\\windows");
    String files[] = file.list();
    int i = 0;
    while (i < files.length) {
        System.out.println(files[i]);
        i++;
    }
  }
}
