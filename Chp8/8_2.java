import java.io.*;

public class Main {
  public static void main(String args[]) {
    File myFile = new File("c:\\aa\bb");
    if(myFile.mkdirs())
        System.out.println("Directory was created.");
    else
        System.out.println("Directory was not created.");
  }
}
