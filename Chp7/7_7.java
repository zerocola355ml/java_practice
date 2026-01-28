import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Box {
    private int width, height;
    public Box(int w, int h) {width = w; height = h;}
    public int width() {return width;}
    public int height() {return height;}
    public int area() {return width * height;}
}

public class Main {
    public static void main(String args[]) {
        Box box = new Box(20, 20);
        Class c = box.getClass();
        String class_name = c.getName();
        String super_class = c.getSuperclass().getName();
        Field []fields = c.getDeclaredFields();
        Method []methods = c.getDeclaredMethods();
        
        System.out.println("클래스 이름 : " + class_name);
        System.out.println("슈퍼 클래스 이름 : " + super_class);
        System.out.println("필드 목록");
        for(int i = 0; i < fields.length; i++)
            System.out.println(fields[i]);
        
        System.out.println("메소드 목록");
        for(int i = 0; i < methods.length; i++)
            System.out.println(methods[i]);
    }
}

/*
클래스 이름 : Box
슈퍼 클래스 이름 : java.lang.Object
필드 목록
private int Box.width
private int Box.height
메소드 목록
public int Box.width()
public int Box.height()
public int Box.area()
*/
