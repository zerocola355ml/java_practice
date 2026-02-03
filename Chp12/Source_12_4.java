class MyThread_12_4 extends Thread {
    public MyThread_12_4(String szName) {super(szName);}
    public void run() {
        for(int i = 0; i < 100; i++) {
            String num = String.valueOf(i);
            if (i < 10) num = "0" + String.valueOf(i);
            System.out.print(getName() + "(" + num + ") ");
        }
    }
}

public class Source_12_4 {
    public static void main(String args[]) {
        MyThread_12_4 my_thread1 = new MyThread_12_4("thd1");
        MyThread_12_4 my_thread2 = new MyThread_12_4("thd2");
        MyThread_12_4 my_thread3 = new MyThread_12_4("thd3");

        my_thread1.setPriority(Thread.MIN_PRIORITY);
        my_thread2.setPriority(Thread.NORM_PRIORITY);
        my_thread3.setPriority(Thread.MAX_PRIORITY);

        my_thread1.run();
        my_thread2.run();
        my_thread3.run();
    }
}
