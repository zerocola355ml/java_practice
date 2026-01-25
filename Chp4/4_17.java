class Employee {
    int nSalary;
    String szDept = null;
    public Employee(String szNewDept) {szDept = szNewDept;}
    public void doJob() {
        if (szDept.equals("Sales Dept")){
            System.out.println("Do Sales");
        }
        else if (szDept.equals("Development Dept")){
            System.out.println("Do Development");
        }
    }
}
// 새로운 부서 생길 때마다 Employee 수정 필요, if문 추가 필요.

public class Main {
  public static void main(String args[]) {
      Employee emp1 = new Employee("Sales Dept");
      Employee emp2 = new Employee("Development Dept");
      emp1.doJob(); //Do Sales
      emp2.doJob(); //Do Development
  }
}
