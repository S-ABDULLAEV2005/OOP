package prepend;

import java.util.Date;



//Person class (unchanged from the previous example)
public abstract class Test {
 private String name;
 private Date dateOfBirth;
 private String contactInformation;

 // Constructor
 public Test(String name, Date dateOfBirth, String contactInformation) {
     this.name = name;
     this.dateOfBirth = dateOfBirth;
     this.contactInformation = contactInformation;
 }

 // Getter methods (for brevity)
 public String getName() {
     return name;
 }

 public Date getDateOfBirth() {
     return dateOfBirth;
 }

 public String getContactInformation() {
     return contactInformation;
 }

 // Method to display information
 public void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Date of Birth: " + dateOfBirth);
     System.out.println("Contact Information: " + contactInformation);
 }
}
