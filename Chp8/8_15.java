import java.io.*;

public class Main {
  public static void main(String args[]) {
      try(
          OutputStream os = new FileOutputStream("./data.txt");
          DataOutputStream dos = new DataOutputStream(os);
          ) {
              dos.writeUTF("Hello");
              dos.writeInt(100);
              dos.writeDouble(3.14);
              dos.flush(); //버퍼를 비우고 데이터 전송
          } catch (Exception e) {System.out.println(e);}
      
      try(
          InputStream is = new FileInputStream("./data.txt");
          DataInputStream dis = new DataInputStream(is);
          ) {
              System.out.println(dis.readUTF());
              System.out.println(dis.readInt());
              System.out.println(dis.readDouble());
          } catch (Exception e) {System.out.println(e);}
        
  }
}
