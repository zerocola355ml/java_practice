class MyClass1 {} //암묵적을옹 Object 클래스를 상속한다. 

class MyClass2 extends Object {
    public String toString() {return "This MyClass2 class";}
}

public class MyClass {
  public static void main(String args[]) {
      MyClass1 my_class1 = new MyClass1();
      MyClass2 my_class2 = new MyClass2();
      System.out.println(my_class1.toString()); //MyClass1@7e9e5f8a
      System.out.println(my_class2.toString()); //This MyClass2 class
      System.out.println(my_class1);            //MyClass1@7e9e5f8a
      System.out.println(my_class2);            //This MyClass2 class
  }
}
