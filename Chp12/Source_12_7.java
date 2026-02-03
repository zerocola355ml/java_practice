class MyThread_12_7 extends Thread {
    Thread thdNext = null;
    public MyThread_12_7(String szName) {super(szName);}
    public void run() {
        for(int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000000);
            } catch(InterruptedException e) {
                System.out.println(getName() + " ");
                if(thdNext.isAlive()) thdNext.interrupt();
            }
        }
    }
    public void setNextThread(Thread t) {thdNext = t;}
}
public class Source_12_7 {
    public static void main(String args[]) {
        MyThread_12_7 my_thread_1 = new MyThread_12_7("thd1");
        MyThread_12_7 my_thread_2 = new MyThread_12_7("thd2");
        MyThread_12_7 my_thread_3 = new MyThread_12_7("thd3");
        my_thread_1.setNextThread(my_thread_2);
        my_thread_2.setNextThread(my_thread_3);
        my_thread_3.setNextThread(my_thread_1);
        my_thread_1.start();
        my_thread_2.start();
        my_thread_3.start();
        try {
            my_thread_1.interrupt();
            my_thread_1.join();
            my_thread_2.join();
            my_thread_3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("main");

    }
}
