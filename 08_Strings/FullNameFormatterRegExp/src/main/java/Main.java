import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      String regex = "([ЁёА-я-]+)\\s+([ЁёА-я-]+)\\s+([ЁёА-я-]+)";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(input);
      if (matcher.matches()) {
        System.out.println("Фамилия: " + matcher.group(1));
        System.out.println("Имя: " + matcher.group(1));
        System.out.println("Отчество: " + matcher.group(1));
        break;
      }else {
        System.out.println("Введенная строка не является ФИО");
      }

      //TODO:напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
    }
  }

}