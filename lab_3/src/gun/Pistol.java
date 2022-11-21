package gun;

import enums.SoundStates;

import java.util.Objects;

public class Pistol extends Gun{

    public Pistol(int bullets) {
        super(bullets);
    }

    @Override
    public void shoot(String name) {
        int curBullets = this.getBullets();
        setBullets(curBullets - 1);
        makeSound(name, SoundStates.GUNSHOT_SOUND);
    }

    @Override
    public String toString() {
        int bullets = this.getBullets();
        return "Pistol{" + "bullets=" + bullets + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pistol)) return false;
        Pistol that = (Pistol) o;
        return this.getBullets() == that.getBullets();
    }
}
