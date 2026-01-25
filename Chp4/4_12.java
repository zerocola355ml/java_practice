interface Movable {
    void add(double dx, double dy);
    void sub(double dx, double dy);
}

interface Scalable {
    void mul(double s);
    void div(double s);
}

class Point implements Movable, Scalable {
    double x, y;
    public void add(double dx, double dy) {x += dx; y += dy;}
    public void sub(double dx, double dy) {x -= dx; y -= dy;}
    public void mul(double s) {}
    public void div(double s) {}
}

public class Main {
  public static void main(String args[]) {
      Movable movable;
      Scalable scalable;
      Point point = new Point();
      movable = point;
      movable.mul(3.0); //오류. Movable 인터페이스에 mul 메소드 없다.
      scalable = point;
      scalable.add(3.0, 3.0); //오류. Scalable 인터페이스에 add 메소드 없다.
      point.mul(3.0);
      point.add(3.0, 3.0);

  }
}
