package Prob4;
import java.util.Date;

public class Employee extends Person {
    private int id;
    private String position;
    private double annualSalary;
    private Date hireDate;
    private String nationalInsuranceNumber;

    public Employee(String name, int age, int id, String position, double annualSalary, Date hireDate, String nationalInsuranceNumber) {
        super(name, age);
        this.id = id;
        this.position = position;
        this.annualSalary = annualSalary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Additional methods for Employee can be added here

    @Override
    public String toString() {
        return super.getDetails() + ", " + this.id + ", " + this.position + ", " + this.annualSalary + ", " + this.hireDate + ", " + this.nationalInsuranceNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Employee employee = (Employee) obj;

        if (id != employee.id) return false;
        if (Double.compare(employee.annualSalary, annualSalary) != 0) return false;
        if (hireDate != null ? !hireDate.equals(employee.hireDate) : employee.hireDate != null) return false;
        if (nationalInsuranceNumber != null ? !nationalInsuranceNumber.equals(employee.nationalInsuranceNumber) : employee.nationalInsuranceNumber != null)
            return false;
        return position != null ? position.equals(employee.position) : employee.position == null;
    }
}