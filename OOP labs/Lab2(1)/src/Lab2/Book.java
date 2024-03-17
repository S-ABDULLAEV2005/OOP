package Lab2;

public class Book extends LibraryItem {
	
	int pages;
	
	public Book() {
		
	}
	
	public Book(String name, int pages) {
		super(name);
		this.pages = pages;
	}
	
	public String toString() {
		return super.toString() + " " + "   Pages:" + this.pages;
	}

	public int getPages() {
		return this.pages;
	}
	
	@Override
	boolean isBig() {
		if(this.getPages() > 150) {
			return true;
		}
		return false;
	}
}
