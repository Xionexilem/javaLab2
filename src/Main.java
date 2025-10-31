public class Main {
  public static void main(String[] args) {
    Name me = new Name("Lev", "Mitrakov", "Vladimirovich");
    Name robot = new Name(null, null, "Robovich");
    System.out.println(me);
    System.out.println(robot);
  }
}
