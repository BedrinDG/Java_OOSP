public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Иван Иванов");
        Employee emp2 = new Employee("Мария Петрова");
        Employee emp3 = new Employee("Сергей Смирнов");

        Department hrDepartment = new Department("HR");
        Department itDepartment = new Department("IT");
        Department company = new Department("Компания");

        hrDepartment.add(emp1);
        hrDepartment.add(emp2);

        itDepartment.add(emp3);

        company.add(hrDepartment);
        company.add(itDepartment);

        company.display();
    }
}