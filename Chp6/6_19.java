import java.io.*;

class CharInput {
    int nInput = 0;
    public char getInput() {
        try {
            nInput = System.in.read();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return (char) nInput;
    }
}

public class Main {
    public static void main(String args[]) {
        CharInput charInput = new CharInput();
        System.out.println(charInput.getInput());
    }   
}
