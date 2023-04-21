package pl.codecool.lambda_stream.stream.ex7_ex9;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    public Employee findFirstWithSalary(double salary, List<Employee> employees) {
        return employees.stream()
                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .peek(e -> System.out.println(e + "1"))
                .filter(e -> e != null)
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .peek(e -> System.out.println(e + "2"))
                .filter(e -> e.getSalary() >= salary)
                .findFirst()
                .get();
    }

    public List<Employee> sortByName(List<Employee> employees) {
        return employees.stream()
                .sorted((s1, s2) -> String.CASE_INSENSITIVE_ORDER.compare(s1.getName(), s2.getName()))
                .collect(Collectors.toList());
    }

    public double getMaxSalary(List<Employee> employees) {
        return employees.stream()
                .map(e -> e.getSalary())
                .max((d1, d2) -> Double.compare(d1, d2))
                .get();
    }


}
