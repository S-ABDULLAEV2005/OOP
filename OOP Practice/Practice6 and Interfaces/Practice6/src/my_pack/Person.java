package my_pack;


class Person implements CanHavePizza, Movable {
    private int PIZZASIZE;

    public Person(int pizzaSize) {
        this.PIZZASIZE = pizzaSize;
    }


    public void eatPizza() {
        System.out.println("Person is eating pizza of size: " + PIZZASIZE);
    }

   
    public void move() {
        System.out.println("Person is moving.");
    }
}
