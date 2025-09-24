package StreamAPI;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class  NewFile {

    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();

        Employee e1 = new Employee();
        e1.setName("Anjali");

        Employee e2 = new Employee();
        e2.setName("Chetan");

        Employee e3 = new Employee();
        e3.setName("Kirti");

        Employee e4 = new Employee();
        e4.setName("Jithin");

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

        Employee secondEmp = emp.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst().get();

        System.out.println(secondEmp.getSalary());

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



}