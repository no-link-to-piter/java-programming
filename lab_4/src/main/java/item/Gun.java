package item;

public abstract class Gun extends Item {
    private int bullets;
    public Gun(int amount, int bullets) {
        super(amount);
        this.bullets = bullets <= 0 ? 1 : bullets;
    }

    public int getBullets() {
        return this.bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets <= 0 ? 1 : bullets;
    }

    public abstract void shoot(String name);
}
