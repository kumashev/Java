import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {

            final int INDEX_NAME = 0;
            final int INDEX_SURNAME = 1;
            final int INDEX_EMAIL = 2;
            final int INDEX_PHONE = 3;

            String[] components = data.split("\\s+");
            if (components.length != 4) {
                throw new IllegalArgumentException("Не верно заполнена информация, повторите по примеру:\n" +
                        "add Василий Петров vasily.petrov@gmail.com +79215637722");
            }
            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            String phoneNumberRegex = "^[8|\\+7][\\d]{10}";
            String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
            storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
            Pattern pattern = Pattern.compile(phoneNumberRegex);
            Matcher matcher = pattern.matcher(components[3]);
            Pattern pattern2 = Pattern.compile(emailRegex);
            Matcher matcher2 = pattern2.matcher(components[2]);
            if (!matcher.find()) {
                throw new IllegalArgumentException("Введен неверный формат телефона");
            }
            if (!matcher2.find()) {
                throw new IllegalArgumentException("Введен неверный формат email");
            }
    }


    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }

    public Map<String, Customer> getStorage() {
        return storage;
    }
}