package Lab2;

public abstract class Shapes {
	
	String name;
	
	public Shapes(String name){
		this.name = name;
	}
	public abstract double volume();
	public abstract double surfaceArea();
	
	public String toString() {
		return "Name:" + name;
	}
	
}
