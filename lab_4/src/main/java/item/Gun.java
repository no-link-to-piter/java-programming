package item;

import exceptions.AmountException;
import exceptions.PropertyQuantityException;
import person.Person;

public abstract class Gun extends Item {
    private int bullets;
    public Gun(int amount) throws AmountException {
        super(amount);
    }

    public int getBullets() {
        return this.bullets;
    }

    public void setBullets(int bullets) throws PropertyQuantityException {
        if (bullets < 0) throw new PropertyQuantityException(bullets);
        this.bullets = bullets;
    }

    public abstract void shoot(Person p);
}
