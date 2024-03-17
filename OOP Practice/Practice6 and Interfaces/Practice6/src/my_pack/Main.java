package my_pack;

public class Main {
    public static void main(String[] args) {
        Restaurant delpapa = new Restaurant();

        
        Student student = new Student(60);
        delpapa.servePizza(student);

     
        Cat cat = new Cat(30);
        delpapa.servePizza(cat);
        
    }
}