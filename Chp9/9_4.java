import java.nio.file.*;

public class Source_9_4 {
    public static void main(String args[]) throws Exception {
        Path path = Paths.get("/Users/tlsgjswn/Java/Chp9");

        DirectoryStream<Path> ds = Files.newDirectoryStream(path);
        for(Path p: ds) {
            if(Files.isDirectory(p)) {
                System.out.println("[디렉터리] " + p.getFileName());
            }
            else {
                System.out.println("[파일] " + p.getFileName());
                System.out.println(" (" + Files.size(p) + ")");
            }
        }
    }    
}
