abstract class Shape { //추상 클래스, 스스로 객체 생성 불가
    public double height, width;
    
    public Shape(double h, double w) {height = h; width = w;}
    public void setHeight(double h) {height = h;}
    public void setWidth(double w) {width = w;}
    public double getHeight() {return height;}
    public double getWidth() {return width;}
    public abstract double getArea(); //추상 메소드, 몸체 없이 끝나야함. 서브 클래스에서 반드시 구현해야함. 
}

class Triangle extends Shape {
    public Triangle(double h, double w) {super(h, w);}
    public double getArea() {return height * width * 0.5;}
}

class Box extends Shape {
    public Box(double h, double w) {super(h, w);}
    public double getArea() {return height * width;}
}
