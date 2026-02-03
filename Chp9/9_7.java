import java.nio.*;

public class Source_9_7 {
    public static void main(String args[]) throws Exception {
        int c = 1024 * 1024 * 1024;
        ByteBuffer buffer_direct = ByteBuffer.allocateDirect(c);
        System.out.println(buffer_direct.order());

        buffer_direct.order(ByteOrder.nativeOrder());
        System.out.println(buffer_direct.order());
    }
}
