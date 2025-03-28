class RegularUser extends User {
    public RegularUser(String username) {
        super(username);
    }

    @Override
    public void accessResource() {
        System.out.println(username + " ma dostęp do podstawowych funkcji.");
    }

    @Override
    protected boolean checkAccess() {
        return false;
    }
}
