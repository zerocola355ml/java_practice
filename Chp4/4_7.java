interface Movable {
    void add(double dx, double dy);
    void sub(double dx, double dy);
    default double change_sign(double v) {return v * (-1.0);}
}

class Point implements Movable {
    double x, y;
    public void add(double dx, double dy) {x += dx; y += dy;}
    public void sub(double dx, double dy) {x -= dx; y -= dy;}
}


public class Main {
  public static void main(String args[]) {
      Point p = new Point();
      p.x = 10.5;
      p.y = 11.6;
      System.out.println(p.change_sign(p.x));
  }
}
