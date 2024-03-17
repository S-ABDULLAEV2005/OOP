package problem4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;

    public Manager(String name, double annualSalary, Date hireDate, String nationalInsuranceNumber) {
        super(name, annualSalary, hireDate, nationalInsuranceNumber);
        team = new Vector<>();
    }

    // getters and setters for team attribute

    @Override
    public String toString() {
        return super.toString() + ", Team Size: " + team.size();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Manager)) {
            return false;
        }
        Manager other = (Manager) obj;
        return super.equals(other) && team.equals(other.team);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();
        cloned.team = (Vector<Employee>) team.clone();
        return cloned;
    }
}