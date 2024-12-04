public class Employee implements OrganizationComponent {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("  Сотрудник: " + name);
    }
}