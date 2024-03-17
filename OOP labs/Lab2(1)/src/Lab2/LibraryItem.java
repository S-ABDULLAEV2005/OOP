package Lab2;

public abstract class LibraryItem {
	String name;
	
	
	public LibraryItem() {
		
	}
	
	public LibraryItem(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "The name is:" + this.name;
	}
	
	abstract boolean isBig();
}
