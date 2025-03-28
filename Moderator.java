class Moderator extends RegularUser {
    public Moderator(String username) {
        super(username);
    }

    public void deleteComment() {
        System.out.println(username + " usunął komentarz.");
    }
}
