public enum UserType {
    ADMIN {
        @Override
        public void displayPermissions() {
            System.out.println("Admin: Pełne uprawnienia (przeglądanie, edycja, usuwanie)");
        }
    },
    MODERATOR {
        @Override
        public void displayPermissions() {
            System.out.println("Moderator: Może przeglądać i edytować, ale nie usuwać");
        }
    },
    REGULAR_USER {
        @Override
        public void displayPermissions() {
            System.out.println("RegularUser: Może tylko przeglądać treści");
        }
    },
    GUEST {
        @Override
        public void displayPermissions() {
            System.out.println("Guest: Ograniczone przeglądanie treści");
        }
    };

    public abstract void displayPermissions();
}
