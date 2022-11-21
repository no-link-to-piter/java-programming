package gun;

import interfaces.SoundAction;

public abstract class Gun implements SoundAction {
    private int bullets;
    public Gun(int bullets) {
        this.bullets = bullets;
    }

    public int getBullets() {
        return this.bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public abstract void shoot(String name);
}
