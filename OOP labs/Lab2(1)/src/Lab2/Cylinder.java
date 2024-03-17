package Lab2;

public class Cylinder extends Shapes {
	
	int radius;
	int h;
	
	public Cylinder(String name, int r, int h) {	
		super(name);
		this.radius = r;
		this.h = h;
	}

	@Override
	public double volume() {
		return Math.PI*Math.pow(radius, 2)*h;
	}

	@Override
	public double surfaceArea() {
		return (2*Math.PI*h)+(2*Math.PI*Math.pow(radius, 2));
	}
	
	public String toString() {
		return super.toString() + " r:" + String.valueOf(radius)+ " height: " + String.valueOf(h);
	}
}
