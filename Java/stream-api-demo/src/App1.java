import java.util.Arrays;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", 45000),
            new Employee("Alice", 60000),
            new Employee("David", 75000),
            new Employee("Bob", 50000)
        );

        // TODO: Filter salary > 50000 and sort by name
        employees.stream()
        .filter((t)->t.salary>50000)
        .sorted((x,y)->(int)(x.salary-y.salary))
        .forEach(System.out::println);
    }
}