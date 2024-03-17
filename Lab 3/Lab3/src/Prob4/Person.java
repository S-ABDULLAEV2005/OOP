package Prob4;
//import java.util.Date;
//import java.util.Vector;
//
//class Person {
//    protected String name;
//
//    // Assume a constructor for Person with name parameter
//
//    @Override
//    public String toString() {
//        return "Person{name='" + name + "'}";
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Person person = (Person) obj;
//        return name.equals(person.name);
//    }
//}
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getDetails() {
        return this.name + ", " + this.age + " years old";
    }
}

