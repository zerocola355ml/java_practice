class MyClass{
    public static int nStaticField1 = 10;   //필드 선언문에서 초기화
    public static int nStaticField2;
    public MyClass() {nStaticField2 = 20;}   //생성자에서 초기화
}

public class Main{
	public static void main(String[] args){
	    MyClass mc1 = new MyClass();
	    System.out.println("mc1 is constructed.");
	    System.out.println("nStaticField1 : " + mc1.nStaticField1); //10
	    System.out.println("nStaticField2 : " + mc1.nStaticField2); //20
	    MyClass.nStaticField1 += 10;
	    MyClass.nStaticField2 += 10;
	    System.out.println("Values are changed.");
	    System.out.println("nStaticField1 : " + mc1.nStaticField1); //20
	    System.out.println("nStaticField2 : " + mc1.nStaticField2); //30
	    
	    MyClass mc2 = new MyClass();
	    System.out.println("mc2 is constructed.");
	    System.out.println("nStaticField1 : " + mc2.nStaticField1); //20
	    System.out.println("nStaticField2 : " + mc2.nStaticField2); //20
	    
	    
	}
}
