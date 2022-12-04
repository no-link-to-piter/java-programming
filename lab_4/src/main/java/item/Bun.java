package item;

import exceptions.AmountException;
import person.Person;

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
    public void eat(Person p) {
        int amount = this.getAmount();
        String name = p.getName();
        try {
            int leftAmount = amount - 1;
            this.setAmount(leftAmount);
            System.out.println(name + (leftAmount == 0 ? " съедает последнюю булочку" : " съедает булочку" + "\n" + "У " + name + " осталось " + leftAmount + " бул."));
        } catch (AmountException e) {
            System.out.println(name + " хочет съесть булочку, однако их уже не осталось");
        }
    }
}
