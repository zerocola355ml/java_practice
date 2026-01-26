class MyThread implements Runnable {
    public void run() {
        System.out.println("my thread.");
    }
}

public class Main {
  public static void main(String args[]) {
      Thread thd = new Thread(new MyThread());
      thd.start();

  }
}
