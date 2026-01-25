interface Figure {
    double getArea(); //Figure 인터페이스에서 선언된 메소드
}

class Triangle implements Figure {
    private double height, width;
    public Triangle(double h, double w) {height = h; width = w;}
    public double getArea() {return height * width * 0.5;} //Figure 인터페이스에서 선언된 메소드
    public double getHeight() {return height;}
    public double getWidth() {return width;}
}


public class Main {
  public static void main(String args[]) {
      Triangle t = new Triangle(3.0, 4.0);
      System.out.println(t.getArea());
      System.out.println(t.getHeight());
      Figure f = new Triangle(3.0, 4.0);
      System.out.println(f.getArea());
      System.out.println(f.getHeight()); //컴파일 에러
      // Figure 유형으로 선언된 변수 f는 Figure 인터페이스에서 선언된 getArea() 메소드만 호출가능
  }
}
