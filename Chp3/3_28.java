class IniTest {
    int nNormal1 = 10, nNormal2 = 20;
    static int nStatic1 = 50, nStatic2 = 60;
    {
        nNormal1 = 30;
        nNormal2 = 40;
    }
    static {
        nStatic1 = 70;
        nStatic2 = 80;
    }
    public IniTest() {
        nNormal1 = 100;
        nNormal2 = 200;
        nStatic1 = 300;
        nStatic2 = 400;
    }
}


public class Main {
  public static void main(String args[]) {
    IniTest it = new IniTest();
    System.out.println(it.nNormal1); //100
    System.out.println(it.nNormal2); //200
    System.out.println(it.nStatic1); //300
    System.out.println(it.nStatic2); //400
  }
}
