class SharedResource_12_10 {
    int nRes = 0;
    public void incRes(String szThdName) {
        try {
            Thread.sleep(2);
        } catch (Exception e) {System.out.println(e);}
        nRes++;
        System.out.println("[" + szThdName + " " + nRes + "]");
    }
}

class MyThread_12_10 extends Thread{
    static SharedResource_12_10 sr;
    String szName;
    public MyThread_12_10(String szName, SharedResource_12_10 sr) {
        super(szName);
        this.szName = szName;
        MyThread_12_10.sr = sr;
    }
    
    public void run() {
        for(int i = 1; i <= 100; i++) sr.incRes(szName);
    }
}

public class Source_12_10 {
    public static void main(String args[]) {
        SharedResource_12_10 sr = new SharedResource_12_10();
        MyThread_12_10[] thds = new MyThread_12_10[10];

        for(int i = 0; i < thds.length; i++) {
            thds[i] = new MyThread_12_10("thd" + i, sr);
            thds[i].start();
        }
    }
}