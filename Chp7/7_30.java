import java.io.*;

public class Main {
    // 입출력 시 발생할 수 있는 예외를 호출한 쪽(JVM)으로 던짐
    public static void main(String args[]) throws IOException {
        String szInputLine; // 입력받은 한 줄(문자열)을 저장할 변수
        int nValue;         // 문자열을 정수로 변환하여 저장할 변수

        // 1. System.in (바이트 스트림): 키보드로부터 원시 데이터를 1바이트씩 읽음
        // 2. InputStreamReader (문자 스트림): 바이트 데이터를 문자(char)로 번역함
        InputStreamReader isr = new InputStreamReader(System.in);

        // 3. BufferedReader (버퍼 스트림): 문자들을 바구니(버퍼)에 모았다가 한 줄씩 읽는 기능을 제공함
        // 보조 스트림을 연결하여 입력 효율을 극대화함
        BufferedReader is = new BufferedReader(isr);

        // 사용자가 엔터를 누를 때까지 입력된 문자열 전체를 읽어옴 (예: "123")
        szInputLine = is.readLine();

        // 문자열 형태의 숫자("123")를 실제 산술 연산이 가능한 정수(123)로 변환 (Parsing)
        nValue = Integer.parseInt(szInputLine);

        // 변환된 정수 값을 출력
        System.out.println(nValue);

        // 사용한 스트림 자원을 닫음 (메모리 누수 방지)
        is.close();
    }
}
