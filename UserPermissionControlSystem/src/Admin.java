public class Admin extends User implements Permission, ManageUsers {
    public Admin(String id, String name) {
        super(id, name, "Admin");
    }

    @Override
    public boolean canView() { return true; }

    @Override
    public boolean canEdit() { return true; }

    @Override
    public boolean canDelete() { return true; }

    @Override
    public void addUser(String id, String name) {
        System.out.println("Admin: Dodano użytkownika " + name);
    }

    @Override
    public void removeUser(String id) {
        System.out.println("Admin: Usunięto użytkownika o ID " + id);
    }

    @Override
    public void displayPermissions() {
        System.out.println("Admin: Pełne uprawnienia (przeglądanie, edycja, usuwanie)");
    }
}
