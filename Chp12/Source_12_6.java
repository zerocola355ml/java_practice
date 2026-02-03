class MyThread_12_6 implements Runnable {
    public void run() {
        for(int i = 0; i < 100; i ++) {
            System.out.println((Thread.currentThread()).getName() + " ");
            Thread.yield();
        }
    }
}

public class Source_12_6 {
    public static void main(String args[]) throws InterruptedException {
        Thread my_thread1 = new Thread(new MyThread_12_6(), "thd1");
        Thread my_thread2 = new Thread(new MyThread_12_6(), "thd2");
        my_thread1.start();
        my_thread2.start();
        my_thread1.join();
        my_thread2.join();
        System.out.println("main thread"); //thread1, 2가 끝나길 기다렸다가 main이 실행됨.
    }
}
