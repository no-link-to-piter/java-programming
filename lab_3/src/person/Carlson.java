package person;

import enums.LocationStates;
import enums.MindStates;
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

    @Override
    public String toString() {
        String name = this.getName();
        LocationStates location = this.getLocation();
        MindStates mind = this.getMind();
        Pistol p = this.getPistol();
        Bun b = this.getBun();
        int bullets = p.getBullets();
        int amount = b.getAmount();
        return "Carlson{" +
                "name=" + name +
                "location=" + location +
                "mind=" + mind +
                "Pistol{" + "bullets=" + bullets +
                "}Bun{" + "amount=" + amount + "}}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carlson)) return false;
        Carlson that = (Carlson) o;
        return (this.getName()).equals(that.getName())
                && (this.getLocation()).equals(that.getLocation())
                && (this.getMind()).equals(that.getMind())
                && this.getPistol().equals(that.getPistol())
                && this.getBun().equals(that.getBun());
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
