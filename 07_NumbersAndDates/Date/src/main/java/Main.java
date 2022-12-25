import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(collectBirthdays(1996,2,4));
    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);

        DateTimeFormatter printFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);

        int age = 0;
        String result = "";

        while (LocalDate.now().isAfter(birthday.plusYears(age))) {
            result += age + " - " + printFormat.format(birthday.plusYears(age)) + System.lineSeparator();
            age++;
        }

        return result.trim();
    }

}
