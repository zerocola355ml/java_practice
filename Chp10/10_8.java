import java.util.*;

public class Source_10_8 {
    public static void main(String args[]) {
        LinkedList<String> stack = new LinkedList<String>();

        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");

        try {
            while(true) {System.out.println(stack.pop());}
        } catch (NoSuchElementException e) {
            System.out.println("stack is empty");
        }
    } 
}
