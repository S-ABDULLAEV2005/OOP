package my_pack;

public class Main {

	public static void main(String[] args) {
		Mouse1 m1 = new Mouse1();
		Mouse2 m2 = new Mouse2();
		m1.leftClick();
		m1.rightClick();
		m1.scrollUp();
		m1.scrollDown();
	    m2.connect();
    System.out.println(m1);	
	System.out.println(m2);
	
	}

}
