public sealed class RegularUser extends User implements Permission permits Guest {
    private final UserType userType;
    public RegularUser(String id, String name) {
        super(id, name, "RegularUser");
        this.userType = UserType.REGULAR_USER;
    }

    @Override
    public boolean canView() { return true; }

    @Override
    public boolean canEdit() { return false; }

    @Override
    public boolean canDelete() { return false; }

    @Override
    public void displayPermissions() {
        userType.displayPermissions();
    }
}