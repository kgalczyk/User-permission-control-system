//to jest to co powinni napisac studenci w zadaniu 1: (cala ta klasa Guest - moze tylko ogladac)

public class Guest extends User {

    public Guest(String id, String name) {
        super(id, name, "Guest");
    }

    @Override
    public boolean canView() { return true; }

    @Override
    public boolean canEdit() { return false; }

    @Override
    public boolean canDelete() { return false; }

    @Override
    public void displayPermissions() {
        System.out.println("Gość: Może tylko przeglądać treści");
    }
}