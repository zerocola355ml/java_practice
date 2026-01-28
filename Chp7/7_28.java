import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    char cInput = 0;
    System.out.print("Input a character: ");
    while (true) {
        cInput = (char)System.in.read();
        if(cInput == 13 || cInput == 10) //13: CR, 10: LF
            continue;
        if(cInput == 'q')
            break;
        System.out.println(cInput);
        System.out.print("Input a characters: ");
    }
  }
}
