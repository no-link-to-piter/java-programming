package food;

import gun.Pistol;

public class Bun extends Food{

    public Bun(int amount) {
        super(amount);
    }

    @Override
    public String toString() {
        int amount = this.getAmount();
        return "Bun{" + "amount=" + amount + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bun)) return false;
        Bun that = (Bun) o;
        return this.getAmount() == that.getAmount();
    }

    @Override
    public void eat(String name) {
        int currentAmount = this.getAmount();
        this.setAmount(currentAmount - 1);
        System.out.println(name + " съедает булочку");
    }
}
