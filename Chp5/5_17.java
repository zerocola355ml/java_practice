class Data<T> {
    private T t;
    
    public void set(T t) {this. t = t;}
    public T get() {return t;}
}

public class Main {
  public static void main(String args[]) {
      Data<Number> data = new Data<Integer> (); //컴파일 오류
  }
}
