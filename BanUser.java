interface BanUser {
    void banUser(String username);
}

class SuperAdmin extends Admin implements BanUser {
    public SuperAdmin(String username) {
        super(username);
    }

    @Override
    public void banUser(String username) {
        System.out.println(this.username + " zbanował użytkownika: " + username);
    }
}
