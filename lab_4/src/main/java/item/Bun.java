package item;

import java.util.Objects;

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
        if (o == null || o.getClass() != this.getClass()) return false;
        Bun that = (Bun) o;
        return this.getAmount() == that.getAmount();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getAmount());
    }

    @Override
    public void eat(String name) {
        int amount = this.getAmount();
        if (amount > 0) {
            int leftAmount = amount - 1;
            String action = leftAmount == 0 ? " съедает последнюю булочку" : " съедает булочку" + "\n" + "У " + name + " осталось " + leftAmount + " бул.";
            System.out.println(name + action);
            this.setAmount(leftAmount);
        } else {
            System.out.println("У " + name + " нет булочек");
        }
    }
}
