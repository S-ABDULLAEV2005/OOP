package my_pack;
class Bird{
	public void sing() {
		System.out.println("Tweet, tweet, tweet!");
	}
}

//class Dog {
//    public void Voice(){
//   	 System.out.println("Bark, bark!");
//    }
//}

public class poly {
      public static void main(String[] args) {
    	 Bird b = new Bird();
    	 Dog d = new Dog();
    	 d.Voice();
    	 b.sing();
      }
}
