package item;

import person.Person;

public abstract class Food extends Item {

    public Food(int amount) {
        super(amount);
    }

    public abstract void eat(Person p);
}
