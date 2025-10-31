package task1;

public class Home {
  private final int stage;

  public Home(int stage) {
    this.stage = stage;
  }

  @Override
  public String toString() {
    if (this.stage == 1) {
      return "дом с " + this.stage + " этажом";
    } else {
      return "дом с " + this.stage + " этажами";
    }
  }
}
