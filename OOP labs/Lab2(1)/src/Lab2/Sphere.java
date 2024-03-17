package Lab2;

public class Sphere extends Shapes {
	
	int radius;
	

	public Sphere(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	
	@Override
	public double volume() {
		return (4/3)*Math.PI*Math.pow(radius, 3);
	}

	@Override
	public double surfaceArea() {
		return 4*Math.PI*Math.pow(radius, 2);
	}

	public String toString() {
		return super.toString() + " r: " + String.valueOf(radius);
	}
}
