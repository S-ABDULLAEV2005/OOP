package my_pack;
import java.util.ArrayList;
import java.util.List;

// Person class
class Person {
    private String name;
    private String dateOfBirth;
    private String contactInfo;

    public Person(String name, String dateOfBirth, String contactInfo) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}
