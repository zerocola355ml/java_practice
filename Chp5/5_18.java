class Data<T> {
}

class FormattedData<T> extends Data<T> {
    
}

public class Main {
  public static void main(String args[]) {
      Data<Integer> data = new FormattedData<Integer> ();
  }
}
