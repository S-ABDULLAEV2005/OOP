package mypackage;

import java.util.Vector;

enum Gender {
    BOY, GIRL
}

class Person {
    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return gender == Gender.BOY ? "B" : "G";
    }
}

class DragonLaunch {
    private Vector<Person> kidnappedPeople = new Vector<>();

    public void kidnap(Person p) {
        kidnappedPeople.add(p);
    }

    public boolean willDragonEatOrNot() {
        int boyCount = 0;
        int girlCount = 0;

        for (Person person : kidnappedPeople) {
            if (person.getGender() == Gender.BOY) {
                boyCount++;
            } else {
                girlCount++;
            }
        }

        return boyCount != girlCount;
    }

    public static void main(String[] args) {
        DragonLaunch dragonLaunch = new DragonLaunch();
        dragonLaunch.kidnap(new Person(Gender.BOY));
        dragonLaunch.kidnap(new Person(Gender.BOY));
        dragonLaunch.kidnap(new Person(Gender.GIRL));
        dragonLaunch.kidnap(new Person(Gender.GIRL));

        if (dragonLaunch.willDragonEatOrNot()) {
            System.out.println("Dragon will eat!");
        } else {
            System.out.println("Dragon will not eat!");
        }
    }
}
