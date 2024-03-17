package ComparableInterface;

import java.util.*;

public class Compare{
//	public static void main(String[] args) {

	private String name;
	private int age;
	
	
	public Compare(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}


	@Override
	public String toString() {
		return "Compare [name=" + name + ", age=" + age + "]";
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}
	
	
	}
	

