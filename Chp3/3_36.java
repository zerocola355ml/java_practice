class CSuper {
    public double x;
    public CSuper(double new_x) {
        this.x = new_x * 10;
    }
}

class CSub extends CSuper {
    double x;
    public CSub(double new_x) {
        super(new_x);
        x = new_x;
    }
    public double getSuper() {return super.x;}
    public double getSub() {return this.x;}
}

public class Main {
    public static void main(String[] args) {
        CSub sub = new CSub(10.0);
        System.out.println(sub.x);           //10.0
        System.out.println(sub.getSuper());  //100.0
        System.out.println(sub.getSub());    //10.0
    }
}
