package Prob4;
import java.util.Date;
import java.util.Vector;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Manager m1 = new Manager("John", 35, 1, "Manager", 100000, new Date(), "123456789");
        Manager m2 = new Manager("Alice", 40, 2, "Manager", 120000, new Date(), "987654321");
        Manager m3 = new Manager("Bob", 32, 3, "Manager", 90000, new Date(), "246813579");

        m1.addEmployee(m2);
        m1.addEmployee(m3);

        Manager cloned = (Manager) m1.clone();

        System.out.println("Original: " + m1);
        System.out.println("Cloned: " + cloned);

        m2.setAnnualSalary(140000);

        System.out.println("After changing salary of Alice: ");
        System.out.println("Original: " + m1);
        System.out.println("Cloned: " + cloned);
    }
}