public class Moderator extends User implements Permission, ManageUsers {
    public Moderator(String id, String name) {
        super(id, name, "Moderator");
    }

    @Override
    public boolean canView() { return true; }

    @Override
    public boolean canEdit() { return true; }

    @Override
    public boolean canDelete() { return false; }

    @Override
    public void addUser(String id, String name) {
        System.out.println("Moderator: Dodano użytkownika " + name);
    }

    @Override
    public void removeUser(String id) {
        System.out.println("Moderator: Usunięto użytkownika o ID " + id);
    }

    @Override
    public void displayPermissions() {
        System.out.println("Moderator: Może przeglądać i edytować, ale nie usuwać");
    }
}
