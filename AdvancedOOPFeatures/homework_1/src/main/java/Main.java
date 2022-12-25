import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        sortBySalaryAndAlphabet(staff);
        for (Employee e : staff) {
            System.out.println(e);
        }
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        Collections.sort(staff);
        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
    }
}
