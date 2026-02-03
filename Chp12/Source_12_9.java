class SharedResource_12_9 {
    int nRes = 0;
    public void incRes(String szThdName) {
        try {
            Thread.sleep(2);
        } catch (Exception e) {System.out.println(e);}
        nRes++;
        System.out.println("[" + szThdName + " " + nRes + "]");
    }
}

class MyThread_12_9 extends Thread{
    static SharedResource_12_9 sr;
    String szName;
    public MyThread_12_9(String szName, SharedResource_12_9 sr) {
        super(szName);
        this.szName = szName;
        MyThread_12_9.sr = sr;
    }
    
    public void run() {
        for(int i = 1; i <= 100; i++) sr.incRes(szName);
    }
}