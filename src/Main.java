import java.util.Scanner;

public class Main {
  
 // Для визулаьной части начала задания
  private void visualTopTab (int exercise, int task) {
    String visual = " ========== ";
    System.out.println(visual + "Задание №" + exercise + "  Задача №" + task + visual);
  }

  // Для визуальной части конца задания
  private void visualBottomTab () {
    String visual = " ================== ";
    System.out.println(visual + "Конец" + visual);
  }

  // Сообщение о неизвестной задаче
  private void unknownTask (int exercise) {
    System.out.println("Неизвестная задача в задании №" + exercise);
  }

  // Сообщение о неверном значении
  private void invalidValue () {
    System.out.println("Введено неверное значение, попробуйте ещё раз.");
  }

  // Просьба ввода
  private void pleaseEnter (String text) {
    System.out.print("Введите " + text + ": ");
  }

  public static void main(String[] args) {
    Main obj = new Main();
    Scanner scanner = new Scanner(System.in);
    boolean isWork = true;

    while (isWork) {
      try {
        obj.pleaseEnter("номер задания (-1 - выход)");
        int numberExercise = scanner.nextInt();

        if (numberExercise == -1) {isWork = false; break;}

        obj.pleaseEnter("номер задачи");
        int numberTask = scanner.nextInt();

        obj.visualTopTab(numberExercise, numberTask);

        switch (numberExercise) {
          case 1: {
            switch (numberTask) {
              case 3: {
                System.out.println("Имена.");
                System.out.println(
                  new Name(null, "Клеопатра", null) + "\n" + 
                  new Name("Пушкин", "Александр", "Сергеевич") + "\n" + 
                  new Name("Маяковский", "Владимир", null));
                break;
              }
              case 5: {
                System.out.println("Дом.");
                System.out.println(
                  new Home(1) + "\n" +
                  new Home(5) + "\n" +
                  new Home(23));
                break;
              }
              default: {
                obj.unknownTask(numberExercise);
                continue;
              }
            }
            break;
          }
          case 2: {
            if (numberTask == 4) {
              System.out.println("Сотрудники и отделы.");
              Department department = new Department("IT");

              Employee petrov = new Employee("Петров", department);
              Employee kozlov = new Employee("Козлов", department);
              Employee sidorov = new Employee("Сидоров", department);

              kozlov.makeBoss();

              System.out.println(
                petrov + "\n" +
                kozlov + "\n" +
                sidorov);
            } else {
              obj.unknownTask(numberExercise);
            }
            break;
          }
          case 3: {
            if (numberTask == 4) {
              System.out.println("Сотрудники и отделы.");
              DepartmentExtended department = new DepartmentExtended("IT");

              EmployeeExtended petrov = new EmployeeExtended("Петров", department);
              EmployeeExtended kozlov = new EmployeeExtended("Козлов", department);
              EmployeeExtended sidorov = new EmployeeExtended("Сидоров", department);

              System.out.println(sidorov.getEmployeesDepartment());
            }
            break;
          }
          case 4: {
            if (numberTask == 5) {
              System.out.println("Создаем имена.");
              System.out.println(
                new NameExtended("Клеопатра") + "\n" +
                new NameExtended("Александр", "Пушкин", "Сергеевич") + "\n" +
                new NameExtended("Владимир", "Маяковский") + "\n" +
                new NameExtended("Христофор", "Бонифатьевич"));
            } else {
              obj.unknownTask(numberExercise);
            }
            break;
          }
          case 5: {
            if (numberTask == 5) {
              System.out.println("Дроби.");
              Fraction f1 = new Fraction(10, 15);
              Fraction f2 = new Fraction(7, 4);
              Fraction f3 = new Fraction(4, 9);
              Fraction f4 = new Fraction(11, 20);

              System.out.println("Все стандартные операции:");
              f1.sum(2);
              f2.sub(f1);
              f3.multi(f1);
              f4.div(11);

              System.out.println("\n" + "Комбинация операций:");
              f1.sum(f2).div(f3).sub(5);
            } else {
              obj.unknownTask(numberExercise);
            }
            break;
          }
          default: {
            System.out.println("Неизвестное задание.");
            obj.visualBottomTab();
            continue;
          }
        }

        obj.visualBottomTab();
      } catch (Exception e) {
        obj.invalidValue();
        scanner.next();
      }
    }

    scanner.close();
    System.out.println("Программа успешно завершила работу.");
  }
}
