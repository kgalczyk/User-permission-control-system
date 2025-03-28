public class Moderator extends User implements Permission {
    public Moderator(String id, String name) {
        super(id, name, "Moderator");
    }

    @Override
    public boolean canView() { return true; }

    @Override
    public boolean canEdit() { return true; }

    @Override
    public boolean canDelete() { return false; }
}
