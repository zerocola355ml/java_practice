import java.io.*;

public class Main {
  public static void main(String args[]) {
      try(RandomAccessFile raf = new RandomAccessFile("c:\\java\\test.txt", "rw")) {
          for(int i = 0; i < 10; i++)
            raf.write(i);
          for(int i =9; i >= 0; i--) {
            raf.seek(i);
            System.out.print(raf.read());
          }
          raf.close();
      } catch (Exception e) {System.out.println(e);}
  }
}
