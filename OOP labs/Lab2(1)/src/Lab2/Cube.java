package Lab2;

public class Cube extends Shapes{

	int a;
	
	public Cube(String name, int a) {
		super(name);
		this.a = a;
	}
	
	@Override
	public double volume() {
		return Math.pow(a, 3);
	}

	@Override
	public double surfaceArea() {
		return 6*Math.pow(a, 2);
	}
	
	public String toString() {
		return super.toString() + " a:" + String.valueOf(a);
	}

}
