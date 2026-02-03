class MyThread_12_1 extends Thread {
    public void run() {System.out.println("Thread");}
}

public class Source_12_1 {
    public static void main(String[] args) {
        MyThread_12_1 my_thread = new MyThread_12_1();
        my_thread.start();
    }
}
