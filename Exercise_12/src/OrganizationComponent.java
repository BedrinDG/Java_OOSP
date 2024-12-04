public interface OrganizationComponent {
    void display();
    default void add(OrganizationComponent component) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }
    default void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }
}