import java.nio.*;

public class Source_9_8 {
    public static void main(String args[]) {
        byte[] barray = new byte[100];
        Buffer bbuffer = ByteBuffer.wrap(barray);
        
        char[] carray = new char[100];
        Buffer cbuffer = CharBuffer.wrap(carray, 0, 50);
    }    
}
