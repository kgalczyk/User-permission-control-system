
//to jest to co powinni napisac studenci w zadaniu 1: (cala ta klasa Editor - moze tylko ogladac i edytowac)
public class Editor extends User implements Permission {

    public Editor(String id, String name) {
        super(id, name, "Editor");
    }

    @Override
    public boolean canView() { return true; }

    @Override
    public boolean canEdit() { return true; }

    @Override
    public boolean canDelete() { return false; }

    @Override
    public void displayPermissions() {
        System.out.println("Edytor: przeglądanie i edytowanie treści");
    }

}