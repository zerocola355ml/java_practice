import java.io.*;

class CharInput {
    int nInput = 0;
    public char getInput() throws IOException { //예외 발생 가능성 명시
        nInput = System.in.read();
        return (char) nInput;
    }
}

public class Main {
    public static void main(String args[]) {
        CharInput charInput = new CharInput();
        try {
            System.out.println(charInput.getInput());
        } catch (IOException ex) {
            System.out.println(ex);
        }
            
    }   
}
