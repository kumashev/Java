public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    //TODO: напишите ваш код, результат вывести в консоль
    int sum = Integer.parseInt(getDigits(text)) + Integer.parseInt(getDigits2(text)) + Integer.parseInt(getDigits3(text));
    System.out.println(sum);
  }
  public static String getDigits(String header) {
    String charsetStr = "л ";
    int start = header.indexOf(charsetStr) + charsetStr.length();
    int end = header.indexOf(' ', start);
    String encoding = header.substring(start, end);
    return encoding;
  }
  public static String getDigits2(String header) {
    String charsetStr = "- ";
    int start = header.indexOf(charsetStr) + charsetStr.length();
    int end = header.indexOf(' ', start);
    String encoding = header.substring(start, end);
    return encoding;
  }
  public static String getDigits3(String header) {
    String charsetStr = "ша - ";
    int start = header.indexOf(charsetStr) + charsetStr.length();
    int end = header.indexOf(' ', start);
    String encoding = header.substring(start, end);
    return encoding;
  }

}