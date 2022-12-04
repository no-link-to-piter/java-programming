package exceptions;

public class AmountException extends RuntimeException{
    private int amount;

    public int getModifiedAmount() {
        return this.amount;
    }

    public AmountException(int amount) {
        super("Нельзя установить такое количество: " + amount);
        this.amount = 1;
    }
}
