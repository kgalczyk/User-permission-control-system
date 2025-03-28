import java.util.ArrayList;
import java.util.List;

public class AccessControl {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void showAllUsers() {
        for (User user : users) {
            user.performAction();
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        AccessControl system = new AccessControl();

        system.addUser(new Admin("1", "Alicja"));
        system.addUser(new Moderator("2", "Bartek"));
        system.addUser(new RegularUser("3", "Celina"));

        system.showAllUsers();
    }
}