import java.nio.*;

public class Source_9_6 {
    public static void main(String args[]) throws Exception {
        int c = 1024 * 1024 * 1024;
        Buffer buffer = ByteBuffer.allocate(c);
        System.out.println(c + " bytes buffer is created.");

        ByteBuffer buffer_direct = ByteBuffer.allocateDirect(c);
        System.out.println(c + " bytes direct buffer is created.");
    }
}
import java.nio.file.*;

public class Source_9_5 {
    public static void main(String args[]) throws Exception {
        Path source = Paths.get("/Users/tlsgjswn/Java/Chp9/README.md");
        Path target = Paths.get("/Users/tlsgjswn/Java/Chp9/README_copy.md");

        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
