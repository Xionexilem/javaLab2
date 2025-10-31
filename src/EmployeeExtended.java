import java.util.List;

public class EmployeeExtended extends Employee {
  private DepartmentExtended department;

  public EmployeeExtended(String name, DepartmentExtended department) {
    super(name);
    this.department = department;
    department.addEmployee(this);
  }

  public DepartmentExtended getDepartment() {
    return this.department;
  }

  public List<EmployeeExtended> getEmployeesDepartment() {
    return department.getEmployees();
  }
}

