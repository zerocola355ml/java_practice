class MyThread_12_2 implements Runnable {
    public void run() {System.out.println("Thread");}
}

public class Source_12_2 {
    public static void main(String args[]) {
        Thread my_thread = new Thread(new MyThread_12_2());
        my_thread.start();
    }    
}
