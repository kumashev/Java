import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {

      String input = scanner.nextLine();

      if (input.equals("0")) {

        break;

      }

      // количество пробелом

      int countSpace = 0;

      // символы

      char symbolInput = 0;

      //получаем символы после ввода пользователем данных в консоли

      int lengthInput = input.length();

      for (int i = 0; i < lengthInput; i++) {

        symbolInput = input.charAt(i);

        //считаем количество пробелов выясняя является символ пробелом

        if (Character.isWhitespace(symbolInput)) {

          countSpace++;

        }

      }

      //проверяем основные условия

      if (symbolInput > 'А' && symbolInput < 'я')

      {

        System.out.println("Фамилия: " + input.substring(0, input.indexOf(' ')));

        System.out.println("Имя: " + input.substring(input.indexOf(' '), input.lastIndexOf(' ')).trim());

        System.out.println("Отчество: " + input.substring(input.lastIndexOf(' ')).trim());

      } else

      {

        System.out.println("Введенная строка не является ФИО");

      }

    }

  }

}

