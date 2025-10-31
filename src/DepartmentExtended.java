import java.util.ArrayList;
import java.util.List;

public class DepartmentExtended extends Department {
  protected EmployeeExtended boss;
  private List<EmployeeExtended> employees;

  public DepartmentExtended(String name) {
    super(name);
    this.employees = new ArrayList<>();
  }

  public EmployeeExtended getBoss() {
    return this.boss;
  }

  public void setBoss(EmployeeExtended boss) {
    if (boss.getDepartment() == this) {
      this.boss = boss;
    } else {
      throw new IllegalArgumentException(boss + " does not work in task2.Department " + this);
    }
  }

  public List<EmployeeExtended> getEmployees() {
    return employees;
  }

  public void addEmployee(EmployeeExtended employee) {
    employees.add(employee);
  }
}
