package Arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;
//new, above is immutable, modern Date API in Java 8.. old is java.util.Date → old, mutable, not thread-safe
import java.time.Month;
import java.util.*;

class Employee {

    private String name;

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

    private LocalDate dateOfJoining;

    public void setDateOfJoining(LocalDate dateOfJoining){
        this.dateOfJoining = dateOfJoining;
    }

    public LocalDate getDateOfJoining(){
        return dateOfJoining;
    }

    private int salary;
    private String departmentName;

    public Employee(String name, int salary, String departmentName, LocalDate localDate){
        this.name = name;
        this.salary = salary;
        this.departmentName = departmentName;
        this.dateOfJoining = localDate;
    }

}

class EmpStream{

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("Rachit", 10000, "IT", LocalDate.of(2023,1,10));
        Employee emp2 = new Employee("Ajay", 20000, "IT", LocalDate.of(2023, 2, 15));
        Employee emp3 = new Employee("Atul", 30000, "IT", LocalDate.of(2023,2, 27));


        Employee emp4 = new Employee("Karan", 240000, "BE", LocalDate.of(2025,5,12));
        Employee emp5 = new Employee("Ajay", 340000, "BE", LocalDate.of(2025, 4, 18));
        Employee emp6 = new Employee("Atul", 540000, "BE", LocalDate.of(2025,8, 19));
        Employee emp7 = new Employee("Punit", 40000, "BE", LocalDate.of(2025,2, 19));


        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);

        Map<String, Optional<Employee>> secondHighestByDept = employeeList.stream()
                            .collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.collectingAndThen(Collectors.toList(),
                                    list -> list.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst())));

        Map<String, Optional<Employee>> secHighest = employeeList.stream()
                            .collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.collectingAndThen(Collectors.toList(),
                                    list -> list.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst())));

        System.out.println(secHighest);

        secondHighestByDept.forEach((dept, emp) -> System.out.println("department "+ dept + " -> 2nd highest : " + emp.get().getSalary()));

        Map<String, Integer> map = new HashMap<>();

        for(Employee emp : employeeList){
            if(map.containsKey(emp.getDepartmentName())){
                map.put(emp.getDepartmentName(), map.getOrDefault(emp.getDepartmentName(), 0) + emp.getSalary());
            }
            else{
                map.put(emp.getDepartmentName(), emp.getSalary());
            }
        }

        for(String department : map.keySet()){
            System.out.println(department + " - " + map.get(department));
        }

        System.out.println("--------");

        Map<Month, Long> employeesByMonth = employeeList.stream()
                .collect(Collectors.groupingBy(emp -> emp.getDateOfJoining().getMonth(), Collectors.counting()));

        for(Month month : employeesByMonth.keySet()){
            System.out.println(month + " has count "+ employeesByMonth.get(month));
        }

        System.out.println("--------");

        Map<Month, Long> empByMonth = new HashMap<>();

        for(Employee e : employeeList){
            if(empByMonth.containsKey(e.getDateOfJoining().getMonth())){
                empByMonth.put(e.getDateOfJoining().getMonth(), empByMonth.getOrDefault(e.getDateOfJoining().getMonth(),0L) + 1);
            }
            else{
                empByMonth.put(e.getDateOfJoining().getMonth(), 1L);
            }
        }

        for(Month month : employeesByMonth.keySet()){
            System.out.println(month + " - " + empByMonth.get(month));
        }
    }

}
