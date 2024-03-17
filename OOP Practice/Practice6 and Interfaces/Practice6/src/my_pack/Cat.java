package my_pack;



class Cat extends Animal implements CanHavePizza {
    private int PIZZASIZE;

    public Cat(int pizzaSize) {
        this.PIZZASIZE = pizzaSize;
    }

  
    public void eatPizza() {
        System.out.println("Cat is eating pizza of size: " + PIZZASIZE);
    }
    
}

