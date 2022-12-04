package item;

import exceptions.AmountException;
import interfaces.SoundAction;

public abstract class Item implements SoundAction {
    private int amount;

    public Item(int amount) throws AmountException {
        if (amount < 0) throw new AmountException(amount);
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) throws AmountException {
        if (amount < 0) throw new AmountException(amount);
        this.amount = amount;
    }
}
