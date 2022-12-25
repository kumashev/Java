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
      input = input.replaceAll("\\D", "");
      if (input.length() == 10 && !input.startsWith("7")) {
        input = "7" + input;
      }


      input = input.replaceFirst("^8", "7");


      String regex = "\\d{11}";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(input);
      if (matcher.matches() && input.startsWith("7")) {
        System.out.println(input);
      }else {
        System.out.println("Неверный формат номера");
      }


    }

  }
}
