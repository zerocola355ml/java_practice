interface Computer {
    public void calculate(String order);
}

class PersonalComputer implements Computer {
    public void calculate(String order) {
        System.out.println("PersonalComputer: " + order);
    }
}

class Workstation implements Computer {
    public void calculate(String order) {
        System.out.println("Workstation: " + order);
    }
}

public class Main {
  public static void main(String args[]) {
      Computer c;
      c = new PersonalComputer();
      c.calculate("a");     //PersonalComputer: a
      c = new Workstation();
      c.calculate("b");     //Workstation: b
  }
}
