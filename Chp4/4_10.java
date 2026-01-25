interface Movable {
    void add(double dx, double dy);
    void sub(double dx, double dy);
}

class MovablePoint implements Movable {
    double x, y;
    public void add(double dx, double dy) {x += dx; y += dy;}
    public void sub(double dx, double dy) { x -= dx; y -= dy;}
}


public class Main {
  public static void main(String args[]) {
      Movable movable;
      MovablePoint movable_point = new MovablePoint();
  }
}
