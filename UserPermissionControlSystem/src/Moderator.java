public class Moderator extends User {
    private final UserType userType;
    private final ModeratorPermissions moderatorPermissions;
    public Moderator(String id, String name) {
        super(id, name, "Moderator");
        this.userType = UserType.MODERATOR;
        this.moderatorPermissions = new ModeratorPermissions();
    }

    @Override
    public boolean canView() { return moderatorPermissions.canView(); }

    @Override
    public boolean canEdit() { return moderatorPermissions.canEdit(); }

    @Override
    public boolean canDelete() { return moderatorPermissions.canDelete(); }

    @Override
    public void displayPermissions() {
        userType.displayPermissions();
    }
}
