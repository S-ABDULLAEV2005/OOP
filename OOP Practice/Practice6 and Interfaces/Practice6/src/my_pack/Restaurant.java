package my_pack;

class Restaurant {
    boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();
        if (eater instanceof Person) {
          
            System.out.println("Payment included for a person.");
        } else if (eater instanceof Cat) {
            
            System.out.println("Cat eat for free.");
        }
        return true; 
    }
}