class CSuper {
    public CSuper() {System.out.println("super non-argu");}
    public CSuper(int a) {System.out.println("super argu");}
}

class CSub extends CSuper {
    public CSub() {System.out.println("sub non-argu");}
    public CSub(int a) {System.out.println("sub argu");}
}

public class Main {
    public static void main(String[] args) {
        CSub sub1 = new CSub();   //super non-argu, sub non-argu
        CSub sub2 = new CSub(10); //suepr non-argu, sub argue
    }
}
