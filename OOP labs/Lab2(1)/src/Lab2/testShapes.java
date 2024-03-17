package Lab2;

public class testShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cylinder c1 = new Cylinder("Cylinder", 50, 100);
		System.out.println(c1.volume());
		System.out.println(c1.surfaceArea());
		System.out.println(c1.toString());
	}

}
