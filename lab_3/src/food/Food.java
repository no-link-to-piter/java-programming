package food;

public abstract class Food {
    private int amount;

    public Food(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public abstract void eat(String name);
}
