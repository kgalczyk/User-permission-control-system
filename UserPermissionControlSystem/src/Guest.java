public class Guest extends RegularUser {
    private int remainingViews = 3;

    public Guest(String id, String name) {
        super(id, name);
        this.role = "Guest"; // nadpisujemy nazwę roli
    }

    @Override
    public boolean canView() {
        return remainingViews > 0;
    }

    @Override
    public void performAction() {
        showInfo();
        if (canView()) {
            System.out.println("Możesz przeglądać treści.");
            remainingViews--;
            System.out.println("Pozostało " + remainingViews + " przeglądania.");
        } else {
            System.out.println("Dostęp wygasł – nie możesz już przeglądać treści.");
        }

        // Guest nie ma dostępu do edycji i usuwania, więc nie trzeba tego wypisywać
    }

    @Override
    public void displayPermissions() {
        System.out.println("Guest: Ograniczone przeglądanie (max 3 razy).");
    }
}
