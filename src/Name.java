public class Name {
  private String name;
  private String surname;
  private String patronymic;

  public Name(String name, String surname, String patronymic) {
    this.name = name;
    this.surname = surname;
    this.patronymic = patronymic;
  }

  private String changeString(String string, Boolean space) {
    StringBuilder result = new StringBuilder();
    if (string != null && !string.isEmpty()) {
      result.append(string);
      if (space) {result.append(" ");}
    }
    return result.toString();
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append(changeString(name, true));
    result.append(changeString(surname, true));
    result.append(changeString(patronymic, false));
    return result.toString();
  }
}
