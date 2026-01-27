public class Main {
    public static void main(String args[]) {
        try (MyResource res1 = new MyResource("A");
        MyResource res2 = new MyResource("B")) {
            String data = res1.read(true);
            int value = Integer.parseInt(data);
            System.out.println("[MyResource(" + res1.getName() +") " + value + "]");
            
            data = res2.read(true);
            value = Integer.parseInt(data);
            System.out.println("[MyResource(" + res2.getName() +") " + value + "]");
        } catch (Exception e) {
            System.out.println(e);
        }
    }   
}

/*
[MyResource(A) open]
[MyResource(B) open]
[MyResource(A) read]
[MyResource(A) 100]
[MyResource(B) read]
[MyResource(B) 100]
[MyResource(B) close]
[MyResource(A) close]]
*/
