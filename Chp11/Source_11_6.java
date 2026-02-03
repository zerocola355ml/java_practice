import java.nio.file.*;
import java.util.stream.*;

public class Source_11_6 {
    public static void main(String args[]) throws Exception {
        Path path = Paths.get("./README.md");
        Stream<String> fileStream = Files.lines(path);

        fileStream.forEach(line -> System.out.println(line));
        fileStream.close();
    }
}
