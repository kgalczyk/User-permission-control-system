abstract class User {
    protected String username;

    public User(String username) {
        this.username = username;
    }

    public abstract void accessResource();

    public final void performAction() {
        if (checkAccess()) {
            accessResource();
        } else {
            System.out.println(username + " nie ma uprawnień.");
        }
    }

    protected abstract boolean checkAccess();
}
