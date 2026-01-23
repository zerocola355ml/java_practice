class MyClass {
    double x = 10.0;
    public MyClass() {x = 20.0;}
    public MyClass(double new_x) {
        this();
        x = x + new_x;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass mc = new MyClass(10);
        System.out.println(mc.x);  //30.0
    }
}
