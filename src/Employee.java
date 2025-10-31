public class Employee {
  protected final String name;
  protected Department department;

  public Employee(String name, Department department) {
    this.name = name;
    this.department = department;
  }

  public Department getDepartment() {
    return this.department;
  }

  public String getName() {
    return this.name;
  }

  public void makeBoss() {
    this.department.setBoss(this);
  }

  @Override
  public String toString() {
    if (this == this.department.getBoss()) {
      return this.name + " начальник отдела " + this.department;
    } else {
      return this.name + " работает в отделе " + this.department + ", начальник которого " + this.department.getBoss().getName();
    }
  }
}
