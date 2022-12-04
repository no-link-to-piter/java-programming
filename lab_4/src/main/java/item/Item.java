package item;

import exceptions.AmountException;
import exceptions.PropertyQuantityException;
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

    public void setAmount(int amount) throws PropertyQuantityException {
        if (amount < 0) throw new PropertyQuantityException(amount);
        this.amount = amount;
    }
}
