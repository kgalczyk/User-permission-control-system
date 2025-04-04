// -- to cos trzeba dodac
public class SuperAdmin extends Admin {

    public SuperAdmin(String id, String name) {
        super(id, name);
    }

    @Override
    public boolean canEdit() {
        System.out.println("SuperAdmin: Może edytować wszystko, w tym użytkowników i dane systemowe!");
        return true;
    }

    @Override
    public void displayPermissions() {
        System.out.println("SuperAdmin: Pełne uprawnienia + zarządzanie systemem i użytkownikami.");
    }

    // Dodatkowa metoda tylko dla SuperAdmin
    public void systemControl() {
        System.out.println("SuperAdmin: Zarządzanie ustawieniami systemu.");
    }
}
