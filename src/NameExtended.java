public class NameExtended extends Name {

  public NameExtended(String name) {
    super(null, name, null);
  }

  public NameExtended(String name, String surname) {
    super(surname, name, null);
  }

  public NameExtended(String name, String surname, String patronymic) {
    super(surname, name, null);
  }

  @Override
  public String toString() {
      return changeString(name, true) +
              changeString(surname, true) +
              changeString(patronymic, false);
  }
}
