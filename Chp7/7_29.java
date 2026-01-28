import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
      int nInput = 0;
      System.out.print("Input an integer: ");
      nInput = System.in.read(); //입력 정수의 UNICODE 값 저장
      nInput -= '0'; //UNICODE 값을 실제 정수 값으로 변환
      System.out.println(nInput);
  }
}
