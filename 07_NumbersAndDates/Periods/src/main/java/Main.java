import java.text.DateFormat;
import java.text.Format;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class Main {

  public static void main(String[] args) {
    System.out.println(getPeriodFromBirthday().getYears() + " years, " + getPeriodFromBirthday().getMonths() + " months, " + getPeriodFromBirthday().getDays() + " days");

  }


  private static Period getPeriodFromBirthday() {
    LocalDate birthday = LocalDate.of(1995, 5, 23);
    LocalDate today = LocalDate.now();
    Period period = Period.between(birthday, today);
    DateTimeFormatter printFormat = DateTimeFormatter.ofPattern("yyyy.MM.dd");

    return period;
  }


}
