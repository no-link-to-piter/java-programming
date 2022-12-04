package item;

import exceptions.AmountException;
import person.Person;

public abstract class Gun extends Item {
    private int bullets;
    public Gun(int amount) {
        super(amount);
    }

    public int getBullets() {
        return this.bullets;
    }

    public void setBullets(int bullets) throws AmountException {
        if (bullets < 0) throw new AmountException(bullets);
        this.bullets = bullets;
    }

    public abstract void shoot(Person p);
}
