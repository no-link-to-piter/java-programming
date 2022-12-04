package item;

import enums.SoundStates;
import exceptions.AmountException;
import person.Person;

import java.util.Objects;

public class Pistol extends Gun{

    public Pistol(int amount) {
        super(amount);
    }

    @Override
    public void shoot(Person p) {
        int curBullets = this.getBullets();
        String name = p.getName();
        try {
            setBullets(curBullets - 1);
            makeSound(p, SoundStates.GUNSHOT_SOUND);
        } catch (AmountException e) {
            System.out.println(name + " пытается выстрелить, однако у него не получается ведь обойма пустая");
        }
    }

    public void load(Person p, int bullets) {
        String name = p.getName();
        try {
            setBullets(bullets);
            System.out.println(name + " вставляет " + bullets + " пуль(-и)(-ю) в оружие");
        } catch (AmountException e) {
            e.printStackTrace();
            setBullets(e.getModifiedAmount());
            System.out.println(name + " вставляет " + e.getModifiedAmount() + " пуль(-и)(-ю) в оружие");

        }
    }

    @Override
    public String toString() {
        int bullets = this.getBullets();
        return "Pistol{" + "bullets=" + bullets + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Pistol that = (Pistol) o;
        return this.getBullets() == that.getBullets();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getBullets());
    }

}
