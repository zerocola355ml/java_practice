import java.io.*;

public class Main {
  public static void main(String args[]) {
      File inFile = new File("./Main.java");
      File outFile = new File("./FileTemp.java");
      try(
          InputStream is = new FileInputStream(inFile);
          BufferedInputStream bis = new BufferedInputStream(is);
          OutputStream os = new FileOutputStream(outFile);
          BufferedOutputStream bos = new BufferedOutputStream(os)) {
              int nData;
              nData = bis.read();
              while(nData != -1) {
                  bos.write(nData);
                  nData = bis.read();
              }
          } catch (Exception e) {
              System.out.println(e);
          }
      
  }
}
