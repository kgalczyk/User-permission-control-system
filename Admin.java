class Admin extends Moderator {
    public Admin(String username) {
        super(username);
    }

    public void manageUsers() {
        System.out.println(username + " zarządza użytkownikami.");
    }
}
