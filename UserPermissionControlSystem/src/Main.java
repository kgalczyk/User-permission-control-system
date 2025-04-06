import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AccessControl system = new AccessControl();

        // Dodawanie użytkowników
        system.addUser(new Admin("1", "Alicja")); // user1
        system.addUser(new Moderator("2", "Bartek")); // user2
        system.addUser(new RegularUser("3", "Celina"));
        system.addUser(new Guest("4", "Dawid"));

        // Wyświetlanie informacji o użytkownikach
        system.showAllUsers();

        // Przypisanie uprawnień (przykłady przeciążonych metod)
        List<User> userList = new ArrayList<>();
        userList.add(new Admin("5", "Tomek"));
        userList.add(new RegularUser("6", "Kasia"));

        // Przypisanie uprawnienia dla pojedynczego użytkownika
        system.assignPermission(new Admin("7", "Ola"), "Edytowanie treści");

        // Przypisanie uprawnień dla wielu użytkowników
        system.assignPermission(userList, "Przeglądanie treści");
    }
}
