import java.nio.file.*;

public class Source_9_15 {
    public static void main(String args[]) {
        try {
            WatchService ws;
            ws = FileSystems.getDefault().newWatchService();
            Path path = Paths.get("./temp");
            path.register(ws, StandardWatchEventKinds.ENTRY_CREATE, 
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY);
            
                while(true) {
                    WatchKey key = ws.take();
                    for(WatchEvent<?> event : key.pollEvents()) {
                        WatchEvent.Kind k = event.kind();
                        Path p = (Path)event.context();
                        if(k == StandardWatchEventKinds.ENTRY_CREATE) {
                            System.out.println("File " + p.getFileName() + " is created.");
                        } else if(k == StandardWatchEventKinds.ENTRY_DELETE) {
                            System.out.println("File " + p.getFileName() + " is deleted.");
                        } else if(k == StandardWatchEventKinds.ENTRY_MODIFY) {
                            System.out.println("File " + p.getFileName() + " is modified.");
                        } else if(k == StandardWatchEventKinds.OVERFLOW) {}
                    }

                    boolean valid = key.reset();
                    if(!valid) break;
                }
            
        } catch (Exception e) {System.out.println(e);}
    }
}
