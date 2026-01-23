class Circle{
    private int r;
    public Circle(int a){
        r = a;
    }
    public double getArea(){
        return r * r * 3.141592;
    }
}

public class Main{
	public static void main(String[] args){
	    Circle c = new Circle(5);
	    System.out.println(c.getArea());

	}
}
