interface Permission {
    default boolean canView() {
        return true;
    };
    default boolean canEdit() {
        return false;
    };
    default boolean canDelete() {
        return false;
    };
}