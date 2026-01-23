package streamApi;

public class Employee {
    String name;
    int id;
    String dept;
    int salary;

    public Employee(String name, int id, String dept, int salary) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
