class MyClass {
    public static int nStaticField = 0;
}

public class Main{
    public static void main(String[] args){
        MyClass.nStaticField = 10;
        System.out.println(MyClass.nStaticField);   //10
    }
}

//static 필드는 객체가 생성되지 않았더라도 사용할 수 있다. 
