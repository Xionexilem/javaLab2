import java.util.List;

public class DepartmentExtended extends Department {
  private List<EmployeeExtended> employees;

  public DepartmentExtended(String name) {
    super(name);
  }

  public List<EmployeeExtended> getEmployees() {
    return employees;
  }

  public void addEmployee(EmployeeExtended employee) {
    employees.add(employee);
  }
}
