public class RegularUser extends User implements Permission {
    public RegularUser(String id, String name) {
        super(id, name, "RegularUser");
    }

    @Override
    public boolean canView() { return true; }

    @Override
    public boolean canEdit() { return false; }

    @Override
    public boolean canDelete() { return false; }

    @Override
    public void displayPermissions() {
        System.out.println("Użytkownik: Tylko przeglądanie treści");
    }
}