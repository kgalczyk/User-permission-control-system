interface Permission {
    boolean canView();
    boolean canEdit();
    boolean canDelete();
}