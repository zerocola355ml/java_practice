import java.io.*;

public class Main {
  public static void main(String args[]) {
      File inFile = new File("c:\\Java\\ReaderWriterTest.java");
      File outFile = new File("c:\\Java\\FileTemp.java");
      
      try(
          Reader rd = new FileReader(inFile);
          Writer wd = new FileWriter(outFile)) {
              int nData = rd.read();
              while(nData != -1) {
                  wd.write(nData);
                  nData = rd.read();
              }
          } catch (Exception e) {
              System.out.println(e);
          }
      
  }
}
