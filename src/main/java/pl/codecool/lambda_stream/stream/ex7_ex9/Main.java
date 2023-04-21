package pl.codecool.lambda_stream.stream.ex7_ex9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Employee employee1 = new Employee(2, "Xyz", 3000);
        Employee employee2 = new Employee(3, "Elly", 4000);
        Employee employee3 = new Employee(4, "Simon", 5000);
        Employee employee4 = new Employee(1, "John", 6000);

        List<Employee> employees = new ArrayList<>();

        employees.add(employee2);
        employees.add(employee1);
        employees.add(employee3);
        employees.add(employee4);

        EmployeeService employeeService = new EmployeeService();

        System.out.println(employeeService.findFirstWithSalary(5000, employees));

        System.out.println(employeeService.sortByName(employees));

        System.out.println(employeeService.getMaxSalary(employees));
    }
}
