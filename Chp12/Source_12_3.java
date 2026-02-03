class MyThread_12_3 extends Thread {
    public MyThread_12_3(String szName) {super(szName);}
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(getName() + " ");
        }
    }
}

public class Source_12_3 {
    public static void main(String args[]) {
        MyThread_12_3 my_thread1 = new MyThread_12_3("thr1");
        MyThread_12_3 my_thread2 = new MyThread_12_3("thr2");
        MyThread_12_3 my_thread3 = new MyThread_12_3("thr3");

        my_thread1.start();
        my_thread2.start();
        my_thread3.start();
        System.out.println("main");
    }    
}
