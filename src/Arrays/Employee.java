package Arrays;

import java.util.*;
import java.util.stream.Collectors;

class Employee {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    int salary;
    String departmentName;

    public Employee(String name, int salary, String departmentName){
        this.name = name;
        this.salary = salary;
        this.departmentName = departmentName;
    }

}

class EmpStream{

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("Rachit", 10000, "IT");
        Employee emp2 = new Employee("Ajay", 20000, "IT");
        Employee emp3 = new Employee("Atul", 30000, "IT");


        Employee emp4 = new Employee("Karan", 240000, "BE");
        Employee emp5 = new Employee("Ajay", 340000, "BE");
        Employee emp6 = new Employee("Atul", 540000, "BE");

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);

        Map<String, Optional<Employee>> secondHighestByDept = employeeList.stream()
                            .collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.collectingAndThen(Collectors.toList(),
                                    list -> list.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst())));

        secondHighestByDept.forEach((dept, emp) -> System.out.println("department "+ dept + " -> 2nd highest : " + emp.get().getSalary()));

    }

}
