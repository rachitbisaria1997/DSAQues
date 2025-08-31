package StreamAPI;

import java.util.*;

import java.util.stream.Collectors;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String departmantName;
    private int joinedYear;
    private String city;
    private int rank;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartmantName() {
        return departmantName;
    }

    public int getJoinedYear() {
        return joinedYear;
    }

    public String getCity() {
        return city;
    }

    public int getRank() {
        return rank;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartmantName(String departmantName) {
        this.departmantName = departmantName;
    }

    public void setJoinedYear(int joinedYear) {
        this.joinedYear = joinedYear;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Student(int id, String firstName, String lastName, int age, String gender, String departmantName,
                   int joinedYear, String city, int rank) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.departmantName = departmantName;
        this.joinedYear = joinedYear;
        this.city = city;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" +
                lastName + ", age=" + age + ", gender=" + gender + ", departmantName=" +
                departmantName + ", joinedYear=" + joinedYear + ", city=" + city + ", rank=" + rank + "]";

    }

    public static void main(String[] args){

        List<Student> studlist = Arrays.asList(
                new Student(1, "Rohit", "Kumar",    30, "Male",  "Mechanical Engineering",      2015, "Mumbai",    122),
                new Student(2, "Pulkit","Singh",   56, "Male",  "Computer Engineering",        2018, "Delhi",     67),
                new Student(3, "Ankit", "Patil",   25, "Female","Mechanical Engineering",      2019, "Kerala",    164),
                new Student(4, "Satish","Malag",   30, "Male",  "Mechanical Engineering",      2014, "Kerala",    26),
                new Student(5, "Roshan", "Mukd",   23, "Male",  "Biotech Engineering",         2022, "Mumbai",    12),
                new Student(6, "Chetan", "Star",   24, "Male",  "Mechanical Engineering",      2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal",   26, "Male",  "Electronics Engineering",     2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev",       31, "Male",  "Computer Engineering",        2014, "Karnataka", 433),
                new Student(9, "Sonu","Shankar",   27, "Female","Computer Engineering",        2018, "Karnataka", 7),
                new Student(10,"Shubham","Pandey", 26, "Male",  "Instrumentation Engineering", 2017, "Mumbai",    98),
                new Student(10,"Rachit","Pandey", 29, "Male",  "Instrumentation Engineering", 2017, "Delhi",    78)
        );

        // Find Students Whose First Name Starts with 'A':

        List<Student> studentNameA = studlist.stream().filter(s -> s.getFirstName().startsWith("A")).collect(Collectors.toList());

        for(Student stud : studentNameA){
            System.out.println(stud.getFirstName());
        }

        // grp stud by dept name

        Map<String, List<Student>> deptMentList = studlist.stream()
                     .collect(Collectors.groupingBy(stud -> stud.getDepartmantName(), Collectors.toList()));

        for(Map.Entry<String, List<Student>> stud : deptMentList.entrySet()){
            System.out.println(stud.getKey());
            System.out.println(stud.getValue());

        }

        long count = studlist.stream().count();
        System.out.println(count);

        // max age
        OptionalInt maxAge = studlist.stream().mapToInt(emp -> emp.getAge()).max();
        if(maxAge.isPresent()){
            System.out.println(maxAge.getAsInt());
        }

        // unique dept names

        List<String> deptNames = studlist.stream().map(stud -> stud.getDepartmantName()).distinct().collect(Collectors.toList());

        for(String dept :deptNames){
            System.out.println(dept);
        }

        Map<String, Long> countStudEachDept = studlist.stream()
                .collect(Collectors.groupingBy(stud -> stud.getDepartmantName(), Collectors.counting()));

        System.out.println(countStudEachDept);

        List<Student> lessAge30 = studlist.stream().filter(stud -> stud.getAge() < 30).collect(Collectors.toList());
        System.out.println("list of stud below 30 age is "+ lessAge30);


        //Find Students with Rank Between 50 and 100:
        List<Student> rankList = studlist.stream().filter(st -> st.getRank() > 50 && st.getRank() < 100).collect(Collectors.toList());

        for(Student stud : rankList){
            System.out.println(stud.getFirstName());
        }

        // Average Age of Male and Female Students:

        Map<String, Double> mapAvgAge = studlist.stream().collect(Collectors.groupingBy(emp -> emp.getGender(),
                Collectors.averagingInt(emp -> emp.getAge())));
        System.out.println(mapAvgAge);

        //Find Students in Delhi and Sort by Name:
        List<Student> studLocation = studlist.stream()
                .filter(stud -> stud.getCity().equals("Delhi"))
                .sorted(Comparator.comparing(stud -> stud.getFirstName())).collect(Collectors.toList());


        //Average Rank in Each Department:
        Map<String, Double> collect = studlist.stream().collect(Collectors.groupingBy(stud -> stud.getDepartmantName(),
                Collectors.averagingInt( stud -> stud.getRank())));

        System.out.println(collect);
        System.out.println("---------");

            // Sort Students by Rank
            List<Student> studRank = studlist.stream().sorted(Comparator.comparingInt(stud -> stud.getRank()))
                    .collect(Collectors.toList());

        for(Student st : studRank){
            System.out.println(st.getRank());
        }

        System.out.println("---------");

        // Sort Students by Rank in revesrsed
        List<Student> studRankRev = studlist.stream().sorted(Comparator.comparingInt(Student::getRank)
                .reversed()).collect(Collectors.toList());

        for(Student st : studRankRev){
            System.out.println(st.getRank());
        }

        // student with second higest rank
        Student stud = studlist.stream().sorted(Comparator.comparingInt(Student::getRank).reversed()).skip(1).findFirst().get();
        System.out.println(stud);



    }

}
