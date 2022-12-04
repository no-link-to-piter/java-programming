package item;

import interfaces.SoundAction;

public abstract class Item implements SoundAction {
    private int amount;

    public Item(int amount) {
        this.amount = amount <= 0 ? 1 : amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount <= 0 ? 1 : amount;
    }
}
