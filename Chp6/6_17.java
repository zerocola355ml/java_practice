public class Main {
    public static void main(String args[]) {
        try (MyResource res = new MyResource("A")) {
            String data = res.read(true);
            int value = Integer.parseInt(data);
            System.out.println("[MyResource(" + res.getName() +") " + value + "]");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try (MyResource res = new MyResource("B")) {
            String data = res.read(false);
            int value = Integer.parseInt(data);
            System.out.println("[MyResource(" + res.getName() +") " + value + "]");
        } catch (Exception e) {
            System.out.println(e);
        }
    }   
}

/*
[MyResource(A) open]
[MyResource(A) read]
[MyResource(A) 100]
[MyResource(A) close]
[MyResource(B) open]
[MyResource(B) read]
[MyResource(B) close]
java.lang.NumberFormatException: For input string: "abc"

*/
