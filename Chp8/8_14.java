import java.io.*;

public class Main {
  public static void main(String args[]) {
      File inFile = new File("./Main.java");
      File outFile = new File("./FileTemp.java");
      try(
          Reader rd = new FileReader(inFile);
          BufferedReader br = new BufferedReader(rd);
          Writer wd = new FileWriter(outFile);
          BufferedWriter bw = new BufferedWriter(wd)) {
              int nData;
              nData = br.read();
              while(nData != -1) {
                  bw.write(nData);
                  nData = br.read();
              }
          } catch (Exception e) {
              System.out.println(e);
          }
  }
}
