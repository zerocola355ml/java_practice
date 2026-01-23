class MyClass {
    public static int nStaticField = 0;
}

public class Main{
    public static void main(String[] args){
        MyClass myObject1, myObject2;
        myObject1 = new MyClass();
        myObject2 = new MyClass();
        
        myObject1.nStaticField = 10;
        System.out.println(myObject1.nStaticField); //10
        myObject2.nStaticField += 10;
        System.out.println(myObject2.nStaticField); //20
    }   
}

//여러 개의 객체가 static 필드를 공유한다. 
