package my_pack;

public class Professor extends Person {
	 private String employeeId;
	    private String expertiseArea;

	    public Professor(String name, String dateOfBirth, String contactInfo, String employeeId, String expertiseArea) {
	        super(name, dateOfBirth, contactInfo);
	        this.employeeId = employeeId;
	        this.expertiseArea = expertiseArea;
	    }

	    public String getEmployeeId() {
	        return employeeId;
	    }

	    public String getExpertiseArea() {
	        return expertiseArea;
	    }
}
