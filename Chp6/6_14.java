public class Main {
    public static void main(String args[]) {
        MyResource res = new MyResource("A");
        try {
            String data = res.read(true);
            int value = Integer.parseInt(data);
            System.out.println("[MyResource(" + res.getName() + ") " + value + "]");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            res.close();
        }
    }   
}

/*
[MyResource(A) open]
[MyResource(A) read]
[MyResource(A) 100]
[MyResource(A) close]

*/
