import javax.lang.model.element.PackageElement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    String text = "Андрей заработал 45000 рублей, Маша заработала 49000 рублей";
    System.out.println(calculateSalarySum(text));

  }

  public static int calculateSalarySum(String text){
    String regex = "\\d+";
    Pattern pattern = Pattern.compile(regex);
    Matcher m = pattern.matcher(text);
    int sum = 0;
    while (m.find()){
      //System.out.println(m.group());
      sum += Integer.parseInt(m.group());
    }

    return sum;
  }

}