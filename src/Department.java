public class Department {
  protected final String name;
  protected Employee boss;

  public Department(String name) {
    this.name = name;
  }

  public Employee getBoss() {
    return this.boss;
  }

  public void setBoss(Employee boss) {
    if (boss.getDepartment() == this) {
      this.boss = boss;
    } else {
      throw new IllegalArgumentException(boss + " does not work in task2.Department " + this);
    }
  }

  @Override
  public String toString() {
    return this.name;
  }
}
