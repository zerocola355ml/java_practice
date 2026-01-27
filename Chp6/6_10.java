import java.io.*;

public class Main {
    public static void main(String args[]) {
        DataInputStream dis = new DataInputStream(System.in);
        try {
            int i = dis.readInt();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
