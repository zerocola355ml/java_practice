import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    char cInput = 0;
    System.out.print("Input a character: ");
    cInput = (char)System.in.read(); //1byte 단위로 읽어 들인다. 
    System.out.println(cInput); 
    System.out.println(System.in.available()); //엔터(CR + LF)를 포함하여 입력 스트림에 남은 데이터양을 바이트 단위로 출력
  }
}
