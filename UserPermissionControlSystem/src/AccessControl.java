import java.util.ArrayList;
import java.util.List;

public class AccessControl {
    private List<User> users = new ArrayList<>();

    // Metoda do dodawania użytkowników
    public void addUser(User user) {
        users.add(user);
    }

    // Metoda do przypisania uprawnienia dla pojedynczego użytkownika
    public void assignPermission(User user, String permission) {
        if (user != null) {
            System.out.println("Przypisano uprawnienie '" + permission + "' użytkownikowi: " + user.getName());
        }
    }

    // Metoda do przypisania uprawnienia dla wielu użytkowników
    public void assignPermission(List<User> users, String permission) {
        if (users != null) {
            for (User user : users) {
                System.out.println("Przypisano uprawnienie '" + permission + "' użytkownikowi: " + user.getName());
            }
        }
    }

    // Metoda do wyświetlania wszystkich użytkowników
    public void showAllUsers() {
        for (User user : users) {
            user.displayPermissions(); // Polimorfizm
            user.performAction();
            System.out.println("-------------------");
        }
    }
}