class SharedResource_12_11 {
    int nRes = 0;
    public synchronized void incRes(String szThdName) {
        try {
            Thread.sleep(2);
        } catch(Exception e) {System.out.println(e);}
        nRes++;
        System.out.println("[" + szThdName + " " + nRes + "]");
    }
}

class MyThread_12_11 extends Thread{
    static SharedResource_12_11 sr;
    String szName;
    public MyThread_12_11(String szName, SharedResource_12_11 sr) {
        super(szName);
        this.szName = szName;
        MyThread_12_11.sr = sr;
    }
    
    public void run() {
        for(int i = 1; i <= 100; i++) sr.incRes(szName);
    }
}

public class Source_12_11 {
    public static void main(String args[]) {
        SharedResource_12_11 sr = new SharedResource_12_11();
        MyThread_12_11[] thds = new MyThread_12_11[10];

        for(int i = 0; i < thds.length; i++) {
            thds[i] = new MyThread_12_11("thd" + i, sr);
            thds[i].start();
        }
    }
}