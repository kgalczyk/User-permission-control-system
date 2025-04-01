public class Admin extends User implements Permission {
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
    public void displayPermissions() {
        System.out.println("Admin: Pełne uprawnienia (przeglądanie, edycja, usuwanie)");
    }
}
