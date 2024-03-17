package problem3;

public class Manager extends Employee {
    private String department;

    public Manager(String employeeId, String firstName, String lastName, double salary, String department) {
        super(employeeId, firstName, lastName, salary);
        this.department = department;
    }

    public String toString() {
        return "Manager{" +
                "employeeId='" + getEmployeeId() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", salary=" + getSalary() +
                ", department='" + department + '\'' +
                '}';
    }
}



