package person;

import enums.LocationStates;
import enums.MindStates;
import item.Bun;
import item.Pistol;

import java.util.Objects;

public class Carlson extends Person {
    private Pistol pistol;
    private Bun bun;

    public Carlson(String name, LocationStates location, MindStates mind) {
        super(name, location, mind);
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
        if (o == null || o.getClass() != this.getClass()) return false;
        Carlson that = (Carlson) o;
        return (this.getName()).equals(that.getName())
                && (this.getLocation()).equals(that.getLocation())
                && (this.getMind()).equals(that.getMind())
                && this.getPistol().equals(that.getPistol())
                && this.getBun().equals(that.getBun());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getLocation(), this.getMind(), this.getPistol(), this.getBun());
    }

    public void loadPistol(int bullets) {
        Pistol p = this.getPistol();
        p.load(this, bullets);
    }

    public void usePistol() {
        Pistol p = this.getPistol();
        p.shoot(this);
    }

    public void eatBun() {
        Bun b = this.getBun();
        b.eat(this);
    }
}
