package my_pack;

public class Student {

	
		     String name;
		     int id;
		     int year_of_study;

		   
		    public Student(String name, int id) {
		        this.name = name;
		        this.id = id;
		        this.year_of_study = 1; 
		    }

		    
		    public String getName() {
		        return name;
		    }

		    
		    public int getId() {
		        return id;
		    }

		    
		    public int getYearOfStudy() {
		        return year_of_study;
		    }

		    
		    public void incrementYearOfStudy() {
		        year_of_study++;
		    }

		    public static void main(String[] args) {
		    
		        Student student = new Student("John Doe", 123456);
		        System.out.println("Name: " + student.getName());
		        System.out.println("ID: " + student.getId());
		        System.out.println("Year of Study: " + student.getYearOfStudy());

		    
		        student.incrementYearOfStudy();
		        System.out.println("After incrementing Year of Study: " + student.getYearOfStudy());
		    }
		}

	

