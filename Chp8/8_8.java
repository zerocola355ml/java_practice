import java.io.*;

public class Main {
  public static void main(String args[]) {
      File inFile = new File("c:\\Java\\Main.java");
      File outFile = new File("c:\\Java\\FileTemp.java");
      
      try(
          InputStream is = new FileInputStream(inFile);
          OutputStream os = new FileOutputStream(outFile)
          ) {
              int nData;
              nData = is.read();
              while(nData != -1) {
                  os.write(nData);
                  nData = is.read();
              }
          } catch (Exception e) {
              System.out.println(e);
          }
  }
}
