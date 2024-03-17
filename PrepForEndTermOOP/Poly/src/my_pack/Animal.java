package my_pack;

public class Animal {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		Hen h = new Hen();
		odam o = new odam();
		
		d.voice();
        c.voice();
        h.voice();
	    o.eat();
	}

}
class odam extends Animal{
  public void eat() {
	  System.out.println("Lalala!");
  }

}
