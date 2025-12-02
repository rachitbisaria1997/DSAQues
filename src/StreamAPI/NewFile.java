package StreamAPI;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class  NewFile {

    public static void main(String[] args) {

        List<Employee> emp = Arrays.asList(
                new Employee("Rohit", "IT", 28, "Mumbai", 50000),
                new Employee("Sneha", "HR", 32, "Delhi", 45000),
                new Employee("Arjun", "Finance", 30, "Bangalore", 60000),
                new Employee("Meera", "IT", 25, "Pune", 48000),
                new Employee("Vikram", "Marketing", 35, "Hyderabad", 55000)
        );

        List<Employee> aEmp = emp.stream().filter(e -> e.getName().startsWith("A")).collect(Collectors.toList());

        for(Employee fg : aEmp){
            System.out.println(fg.getName());
        }

        Map<String, List<Employee>> deptMap = emp.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.toList()));



        System.out.println("dept Map is" + deptMap);

        long count = emp.stream().count();

        int maxAge = emp.stream().mapToInt(e -> e.getAge()).max().getAsInt();

        List<String> deptNames = emp.stream().map(e -> e.getDepartmentName()).collect(Collectors.toList());


        List<Employee> ageList = emp.stream().filter(e -> e.getAge() < 30 && e.getAge() > 26).collect(Collectors.toList());

        // find avg salary in all departments

        Map<String, Double> deptAvgSalary = emp.stream().collect(Collectors.groupingBy(Employee::getDepartmentName,

                Collectors.averagingDouble(Employee::getSalary)));

        Map<String, List<String>> deptWiseNames = emp.stream().collect(Collectors.groupingBy(
                                Employee::getDepartmentName, Collectors.mapping(Employee::getName, Collectors.toList())));

        Employee secondEmp = emp.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst().get();

        Map<String, Integer> deptSumSalary = emp.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.summingInt(Employee::getSalary)));

        System.out.println(deptSumSalary);

        System.out.println(secondEmp.getSalary());


        Employee thirdEmp = emp.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(2).findFirst().get();

        System.out.println(thirdEmp.getSalary());

        Optional<Integer> thirdHigh = emp.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst();

        if(thirdHigh.isPresent()){
            System.out.println("3rd highest salary is "+ thirdHigh.get());
        }
        else{
            System.out.println("not enough employees");
        }

    }

}

class Employee{

    String name;

    String departmentName;

    int age;

    String city;

    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String departmentName, int age, String city, int salary) {
        this.name = name;
        this.departmentName = departmentName;
        this.age = age;
        this.city = city;
        this.salary = salary;
    }

}