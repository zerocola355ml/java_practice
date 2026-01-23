class MyClass{
    public static int nStaticField = 10;
    static void setStaticField(int n) {nStaticField = n;}
    static int getStaticField() {return nStaticField;}
}

public class Main{
	public static void main(String[] args){
	    MyClass mc = new MyClass();
	    mc.setStaticField(20);
	    System.out.println(mc.getStaticField());        //20
	    MyClass.setStaticField(30);
	    System.out.println(MyClass.getStaticField());   //30

	}
}
