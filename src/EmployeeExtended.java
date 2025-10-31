import java.util.List;

public class EmployeeExtended extends Employee {
  DepartmentExtended department;

  public EmployeeExtended(String name, DepartmentExtended department) {
    super(name, department);
  }

  public List<EmployeeExtended> getEmployeesDepartment() {
    return department.getEmployees();
  }
}

