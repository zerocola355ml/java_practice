import java.nio.file.*;

public class Source_9_3 {
    public static void main(String args[]) throws Exception {
        Path path = Paths.get("/Users/tlsgjswn/Java/Chp9/src/Source_9_2.java");

        System.out.println("/Users/tlsgjswn/Java/Chp9/src/Source_9_2.java");
        if(Files.isDirectory(path))
            System.out.println("디렉터리입니다.");
        if(Files.isRegularFile(path))
            System.out.println("파일입니다.");

        System.out.println("크기 : " + Files.size(path));
        System.out.println("소유자 : " + Files.getOwner(path).getName());

        if(Files.isHidden(path))
            System.out.println("숨김파일입니다.");
        if(Files.isReadable(path))
            System.out.println("읽기 가능합니다.");
        if(Files.isWritable(path))
            System.out.println("수정 가능합니다.");
        System.out.println("마지막 수정 시간 : " + Files.getLastModifiedTime(path));
    }    
}
