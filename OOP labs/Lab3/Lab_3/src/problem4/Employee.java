package problem4;

import java.util.Date;
import java.util.Vector;

public class Employee extends Person implements Cloneable, Comparable<Employee> {
    private double annualSalary;
    private Date hireDate;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, Date hireDate, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // getters and setters for all attributes

//    @Override
    public String toString() {
        return super.toString() + ", Salary: " + annualSalary + ", Hire Date: " + hireDate + ", National Insurance Number: " + nationalInsuranceNumber;
    }

//    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) obj;
        return super.equals(other) && annualSalary == other.annualSalary && hireDate.equals(other.hireDate) && nationalInsuranceNumber.equals(other.nationalInsuranceNumber);
    }

    @Override
    public int compareTo(Employee other) {
        int salaryComparison = Double.compare(annualSalary, other.annualSalary);
        if (salaryComparison != 0) {
            return salaryComparison;
        }
        return hireDate.compareTo(other.hireDate);
    }

//    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
