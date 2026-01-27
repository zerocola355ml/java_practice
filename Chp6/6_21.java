import java.io.*;

class CharInput {
    int nInput = 0;
    public char getInput() throws IOException {
        nInput = System.in.read();
        return (char) nInput;
    }
}

public class Main {
    public static void main(String args[]) throws IOException {
        CharInput charInput = new CharInput();
        System.out.println(charInput.getInput());
    }   
}
//컴파일에 문제가 생기지 않지만, 예외 발생시 별다른 조치 불가
