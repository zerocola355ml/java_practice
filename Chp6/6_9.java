import java.io.*;

public class Main {
    public static void main(String args[]) {
        DataInputStream dis = new DataInputStream(System.in);
        try {
            int i = dis.readInt();
        } catch (EOFException e1) {
            System.out.println(e1.toString());
            e1.printStackTrace();
        } catch (IOException e2) {
            System.out.println(e2.toString());
            e2.printStackTrace();
        }
    }
}
