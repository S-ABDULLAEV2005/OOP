package my_pack;


class Student extends Person implements CanHaveRetake, CanHaveParty {
    public Student(int pizzaSize) {
        super(pizzaSize);
    }

   
    public void haveRetake() {
        System.out.println("Student is retaking a course.");
    }

   
    public void dance() {
        System.out.println("Student is dancing at the party.");
    }
}
