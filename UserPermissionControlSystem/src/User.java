public abstract class User {
    protected String id;
    protected String name;
    protected String role;

    public User(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    // Metoda szablonowa (Template Method)
    public void performAction() {
        showInfo();
        if (canView()) {
            System.out.println("Możesz przeglądać treści.");
        }
        if (canEdit()) {
            System.out.println("Możesz edytować treści.");
        }
        if (canDelete()) {
            System.out.println("Możesz usuwać treści.");
        }
    }

    // Metoda polimorficzna - nadpisywana w klasach potomnych
    public abstract void displayPermissions();

    public void showInfo() {
        System.out.println("Użytkownik: " + name + " (Rola: " + role + ")");
    }

    // Metody abstrakcyjne do nadpisania w klasach pochodnych
    protected abstract boolean canView();
    protected abstract boolean canEdit();
    protected abstract boolean canDelete();
}
