package person;

import enums.LocationStates;
import food.Bun;
import gun.Pistol;

public class Carlson extends Person{
    private Pistol pistol;
    private Bun bun;

    public Carlson(String name, LocationStates location) {
        super(name, location);
    }

    public Pistol getPistol() {
        return this.pistol;
    }

    public void setPistol(Pistol pistol) {
        this.pistol = pistol;
    }

    public Bun getBun() {
        return this.bun;
    }

    public void setBun(Bun bun) {
        this.bun = bun;
    }

    public void usePistol() {
        Pistol p = this.getPistol();
        String personName = this.getName();
        p.shoot(personName);
    }

    public void eatBun() {
        Bun b = this.getBun();
        String currentName = this.getName();
        b.eat(currentName);
    }
}
