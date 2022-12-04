package item;

import exceptions.AmountException;
import person.Person;

public abstract class Food extends Item {

    public Food(int amount) throws AmountException {
        super(amount);
    }

    public abstract void eat(Person p);
}
