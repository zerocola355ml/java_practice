class Employee {
    int nSalary;
    String szDept = null;
    public void doJob() {System.out.println("Do Something");}
}

class Sales extends Employee {
    public Sales() {szDept = "Sales Dept";}
    public void doJob() {System.out.println("Do Sales");}
}

class Development extends Employee {
    public Development() {szDept = "Development Dept";}
    public void doJob() {System.out.println("Do Development");}
}

public class Main {
  public static void main(String args[]) {
      Employee emp1, emp2;
      emp1 = new Sales();
      emp2 = new Development();
      emp1.doJob(); //Do Sales
      emp2.doJob(); //Do Development
  }
}
